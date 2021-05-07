import java.io.FileInputStream;
import java.io.DataInputStream;
import java.lang.String;
import java.io.IOException;


//Program ---> DataOutputStream ---> FileOutputStream ---> File

public class ReadIntDemo{
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("myint.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		
		dis.close();
		fis.close();
	}
}