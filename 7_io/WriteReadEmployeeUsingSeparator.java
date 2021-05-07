import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.lang.String;
import java.io.IOException;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  


//Program ---> DataOutputStream ---> FileOutputStream ---> File

public class WriteReadEmployeeUsingSeparator{
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("employees.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//write 1 employee
		dos.writeChars("Ratnakar");
		dos.writeChar('|');   //seperator between fields in employee record
		dos.writeInt(1);
		dos.writeChar('M');
		long millis = getTimeInMillis("03-09-1981");
		dos.writeLong(millis)
		
		dos.writeChar('\n'); //seperator between employees
		
		//write another employee
		dos.writeChars("Rakesh");
		dos.writeChar('|');   //seperator between fields in employee record
		dos.writeInt(2);
		dos.writeChar('M');
		long millis = getTimeInMillis("12-10-1991");
		dos.writeLong(millis)
		
		dos.writeChar('\n'); //seperator between employees
		
		dos.close();
		fos.close();
	}
	
	public static long getTimeInMillis(String dateStr){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		Date date = formatter.parse(dateStr);  
        long millis = date.getTime();
		return millis;
	}
}