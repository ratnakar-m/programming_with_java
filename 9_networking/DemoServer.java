import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class DemoServer{
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(7096);
		System.out.println("DemoServer listening on port 7096");
		while(true){
			Socket s = ss.accept();
			Runnable comm = new CommunicationJob(s);
			Thread t = new Thread(comm);
			t.start();
		}
		
		System.out.println("At the end...");
		
	}
}