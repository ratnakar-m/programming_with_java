import java.math.BigInteger;
import javafx.util.Pair;
import java.util.List;
import java.util.ArrayList;

public class SumDemoWithThreads {
	public static void main(String[] args) throws Exception{
		long n = 500000000l;
		int numThreads = 2;
		
		long startTime = System.currentTimeMillis();
		
		//Splitting the inputs into batches (input batches)
		List<Pair<Long, Long>> rangesList = getRangesList(n, numThreads);
		List<BigInteger> resultsHolder = new ArrayList<BigInteger>();
		
		List<Thread> threadsList = new ArrayList<>();
		
		for(int i=0; i<numThreads; i++){
			long from = rangesList.get(i).getKey();
			long to = rangesList.get(i).getValue();
			
			//create the task/job that will be assigned to the thread
			Runnable r = new SumTask(from, to, resultsHolder);
			
			//create thread and pass the task to be perfomed by thread
			Thread t = new Thread(r);
			
			//start the thread
			t.start();
			threadsList.add(t);
		}	
		
		//The below for loop ensures threads executions are completed
		for(int i=0; i<threadsList.size(); i++)
			threadsList.get(i).join();
		
		//After ensuring that tasks are completed; we have results in the resultsHolder
		//Sum the results
		BigInteger totalSum = getTotalSum(resultsHolder);
		long endTime = System.currentTimeMillis();
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread: "+threadName+", Sum = "+totalSum+ ", Time Taken (ms): "+(endTime-startTime));
	}
	
	public static List<Pair<Long, Long>> getRangesList(long n, int numBatches){
		
		long batchSize = n/numBatches;
		List<Pair<Long, Long>> rangesList = new ArrayList<>();
		
		Long from = 1l;
		for(int i = 0; i < numBatches; i++){
			
			Long to = from + batchSize;
			if(to > n)
				to = n;
			
			Pair<Long, Long> batchRange= new Pair<>(from, to);
			rangesList.add(batchRange);

			from = to + 1;
				
		}
		return rangesList;
	}
	
	public static BigInteger getTotalSum(List<BigInteger> resultsHolder){
		BigInteger totalSum = new BigInteger("0");
		for(int i=0; i<resultsHolder.size(); i++){
			totalSum = totalSum.add(resultsHolder.get(i));
		}
		return totalSum;
	}
	
}