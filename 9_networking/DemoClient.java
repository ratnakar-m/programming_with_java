import java.net.Socket;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class DemoClient{
	public static void main(String[] args) throws IOException{
		Socket s = new Socket("localhost", 7096);
		
		//prepare output stream pipeline
		OutputStream outputStream = s.getOutputStream();
		PrintStream ps = new PrintStream(outputStream, true);
		
		
		//prepare input stream pipeline
		InputStream inputStream = s.getInputStream();
		DataInputStream dis = new DataInputStream(inputStream);
		
		System.out.println(dis.readLine());
		
		DataInputStream console = new DataInputStream(System.in);
		ps.println(console.readLine());
		
		console.close();
		
		ps.close();
		outputStream.close();
		dis.close();
		inputStream.close();
		s.close();
		
	}
}