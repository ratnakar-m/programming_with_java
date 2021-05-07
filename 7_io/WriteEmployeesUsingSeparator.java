import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.lang.String;
import java.io.IOException;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  


//Program ---> DataOutputStream ---> FileOutputStream ---> File

public class WriteEmployeesUsingSeparator{
	public static int MAX_NAME_LENGTH = 30;
	
	public static void main(String[] args) throws IOException, ParseException, Exception{
		FileOutputStream fos = new FileOutputStream("employees.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//write 1 employee
		dos.writeByte("Ratnakar");
		dos.writeChar('|');   //seperator between fields in employee record
		dos.writeInt(1);
		dos.writeChar('M');
		long millis = getTimeInMillis("03-09-1981");
		dos.writeLong(millis);
		
		dos.writeChar('\n'); //seperator between employees
		
		//write another employee
		dos.writeChars("Rakesh");
		dos.writeChar('|');   //seperator between fields in employee record
		dos.writeInt(2);
		dos.writeChar('M');
		millis = getTimeInMillis("12-10-1991");
		dos.writeLong(millis);
		
		dos.writeChar('\n'); //seperator between employees
		
		dos.close();
		fos.close();
	}
	
	public static long getTimeInMillis(String dateStr) throws ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		Date date = formatter.parse(dateStr);  
        long millis = date.getTime();
		return millis;
	}
	
	public static byte[] convertNameToBytes(String name)throws Exception{
		if(name.length > MAX_NAME_LENGTH)
			throw new Exception("name length exceeded max limit");
		
		byte[] nameBytes = name.getBytes();
		byte[] nameBytesWithPadding = new byte[MAX_NAME_LENGTH];
		for(int i=0; i<nameBytes.length; i++){
			nameBytesWithPadding[i] = nameBytes[i];
		}
		
		for(int i=nameBytes.length; i<MAX_NAME_LENGTH; i++){
			nameBytesWithPadding[i] = (byte) 0x00;
		}
	}
}