import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.lang.String;
import java.io.IOException;


//Program ---> DataOutputStream ---> FileOutputStream ---> File

public class WriteIntDemo{
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("myint.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(123);
		
		dos.close();
		fos.close();
	}
}