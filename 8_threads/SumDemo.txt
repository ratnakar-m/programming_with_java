import java.io.IOException;
import java.util.Date;

public class CurrentThreadDemo{
	
	public static void main(String[] args) throws Exception{
		System.out.println("Hello");
		
		Thread t = Thread.currentThread();
		System.out.println("Current Thread Name: "+t.getName());
		
		
		Runnable myTask = new SumTask();
		
		Thread myThread = new Thread(myTask, "MyThread");	
		myThread.start();
		
		
	}

	
}

