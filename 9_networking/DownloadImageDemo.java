import java.net.URL;
import java.io.InputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.FileOutputStream;

public class DownloadImageDemo{
	


	//55296 bytes
	//1-1024, 1025-2048, 2049-3072, 3073-4096, 4097-5120, ........
	public static void main(String[] args) throws MalformedURLException, IOException{
		URL u = new URL("https://image.shutterstock.com/image-photo/large-beautiful-drops-transparent-rain-600w-668593321.jpg");
		InputStream inputStream = u.openStream();
		FileOutputStream fos = new FileOutputStream("xyz");
		byte[] buffer = new byte[1024];
		int x = inputStream.read(buffer);
		System.out.println(x);
		fos.write(buffer);
		fos.flush();

		while(x != -1)
		{
			
			buffer = new byte[1024];
			x = inputStream.read(buffer);
			fos.write(buffer);
			fos.flush();
			System.out.println(x);
		};
		
		inputStream.close();
		fos.close();
	}
}