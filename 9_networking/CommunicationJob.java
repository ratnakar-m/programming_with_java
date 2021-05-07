import java.io.InputStream;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.net.Socket;


public class CommunicationJob implements Runnable{

	Socket s;
	public CommunicationJob(Socket s){
		this.s = s;
	}
	
	public void run(){
		try{
			//prepare output stream pipeline
			OutputStream outputStream = s.getOutputStream();
			PrintStream ps = new PrintStream(outputStream, true);
			
			//prepare input stream pipeline
			InputStream inputStream = s.getInputStream();
			DataInputStream dis = new DataInputStream(inputStream);
			
			ps.println("Welcome");
			System.out.println(dis.readLine());
			
			dis.close();
			inputStream.close();
			
			ps.close();
			outputStream.close();
			
			s.close();
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		
	}
}