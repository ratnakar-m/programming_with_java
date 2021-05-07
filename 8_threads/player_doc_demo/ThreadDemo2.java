import java.io.IOException;
import java.util.Date;

public class ThreadDemo2{
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("Hello");
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		/*long n = 2000000000l;
		long sum = 0;
		
		long startTime = System.currentTimemillis();
		for(int i=0; i<n; i++)
			sum = sum + i;
		long endTime = System.currentTimemillis();
		
		System.out.println("Sum = "+sum);
		System.out.println("Time taken: "+(endTime -startTime));*/
			
	}
	
}

