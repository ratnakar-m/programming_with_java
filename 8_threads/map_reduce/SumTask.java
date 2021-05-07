
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


public class SumTask implements Runnable{
	long from;
	long to;
	List<BigInteger> resultsHolder;
	
	public SumTask(long from, long to, List<BigInteger> resultsHolder){
		this.from = from;
		this.to = to;
		this.resultsHolder = resultsHolder;
	}
	public void run(){
		BigInteger sum  = new BigInteger("0");
		long startTime = System.currentTimeMillis();
		for(long i=from; i<=to; i++)
		{
			sum = sum.add(BigInteger.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread: "+threadName+", Sum = "+sum+ ", Time Taken (ms): "+(endTime-startTime));
		resultsHolder.add(sum);
	}
}