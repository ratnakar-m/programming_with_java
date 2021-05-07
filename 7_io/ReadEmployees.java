import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.lang.String;
import java.io.IOException;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.math.BigInteger;
import java.nio.ByteBuffer;


//Program <--- FileInputStream <--- File

public class ReadEmployees{
	public static final int MAX_NAME_LENGTH = 30;
	public static final char FIELD_SEPERATOR = '|';
	
	public static void main(String[] args) throws IOException, ParseException, Exception{
		FileInputStream fis = new FileInputStream("employees.dat");
		
		//Read 1 employee
		byte[] nameBytes = new byte[MAX_NAME_LENGTH];
		fis.read(nameBytes);
		String name=new String(nameBytes);  

		char separator = (char) fis.read();
		
		byte[] idBytes = new byte[4];
		fis.read(idBytes);
		int id = convertByteArrayToInt(idBytes); //convert sequence of 4 bytes to java integer data type
		
		separator = (char) fis.read();
		
		char gender = (char) fis.read();
		separator = (char) fis.read();
		
		byte[] longBytes = new byte[8];
		fis.read(longBytes);
		long millis = convertByteArrayToLong(longBytes);
		String dob = getDateString(millis);
		
		System.out.print(name+separator+id+separator+gender+separator+dob);
		
		char recordSeparator = (char) fis.read();
		System.out.print(recordSeparator);
		
		//Read another employee
		nameBytes = new byte[MAX_NAME_LENGTH];
		fis.read(nameBytes);
		name=new String(nameBytes);  

		separator = (char) fis.read();
		
		idBytes = new byte[4];
		fis.read(idBytes);
		id = convertByteArrayToInt(idBytes);
		
		separator = (char) fis.read();
		
		gender = (char) fis.read();
		separator = (char) fis.read();
		
		longBytes = new byte[8];
		fis.read(longBytes);
		millis = convertByteArrayToLong(longBytes);
		dob = getDateString(millis);
		
		System.out.print(name+separator+id+separator+gender+separator+dob);
		
		fis.close();
	}
	
	public static int convertByteArrayToInt(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getInt();
    }
	
	public static long convertByteArrayToLong(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getLong();
    }
	
	public static String getDateString(long millis) throws ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		Date date = new Date(millis);  
		String strDate = formatter.format(date);  
		return strDate;
	}
}