import java.net.URL;
import java.io.InputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.FileOutputStream;

/*
	java URLDemo http://google.com/
	
	java URLDemo <url>
*/

public class URLDemo{
	
	public static void main(String[] args) throws MalformedURLException, IOException{
		if(args.length < 1)
		{
			System.out.println("Usage: java URLDemo http://google.com/");
			return;
		}
		//URL u = new URL(args[0]);
		URL u = new URL("https://image.shutterstock.com/image-photo/large-beautiful-drops-transparent-rain-600w-668593321.jpg");
		InputStream inputStream = u.openStream();
		FileOutputStream fos = new FileOutputStream("image.gif");
		int x = inputStream.read();
		while(x != -1)
		{
			System.out.print((char) x);
			x = inputStream.read();
			fos.write((char) x);
		}
		
		inputStream.close();
		fos.close();
	}
}