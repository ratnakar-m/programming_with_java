import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.lang.String;
import java.io.IOException;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.math.BigInteger;
import java.nio.ByteBuffer;

//Program ---> FileOutputStream ---> File

public class WriteEmployees{
	public static final int MAX_NAME_LENGTH = 30;
	public static final char FIELD_SEPERATOR = '|';
	
	public static void main(String[] args) throws IOException, ParseException, Exception{
		FileOutputStream fos = new FileOutputStream("employees.dat");
		
		//write 1 employee
		
		byte[] nameBytes = convertStringToBytes("Ratnakar", MAX_NAME_LENGTH);
		fos.write(nameBytes);
		
		
		fos.write((byte)'|');   //seperator between fields in employee record
		
		int id = 1;
		byte[] idBytes = convertIntTobytes(id);
		fos.write(idBytes);
		
		
		fos.write((byte)'|'); 
		
		
		fos.write((byte)'M');
		fos.write((byte)'|'); 
		
		long millis = getTimeInMillis("03-09-1981");
		byte[] millisBytes = convertLongTobytes(millis);
		fos.write(millisBytes);
		
		fos.write((byte)'\n'); //seperator between employees
		
		//write another employee
		nameBytes = convertStringToBytes("Rakesh", MAX_NAME_LENGTH);
		fos.write(nameBytes);
		
		
		fos.write((byte)'|');   //seperator between fields in employee record
		
		id = 2;
		idBytes = convertIntTobytes(id);
		fos.write(idBytes);
		
		fos.write((byte)'|'); 
		
		
		fos.write((byte)'M');
		fos.write((byte)'|'); 
		
		millis = getTimeInMillis("12-10-1991");
		millisBytes = convertLongTobytes(millis);
		fos.write(millisBytes);
		
		fos.write((byte)'\n'); //seperator between employees
		
		fos.close();
	}
	
	public static long getTimeInMillis(String dateStr) throws ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		Date date = formatter.parse(dateStr);  
        long millis = date.getTime();
		return millis;
	}
	
	public static byte[] convertStringToBytes(String name, int maxLength)throws Exception{
		if(name.length() > maxLength)
			throw new Exception("length exceeded max limit");
		
		byte[] nameBytes = name.getBytes();
		byte[] nameBytesWithPadding = new byte[maxLength];
		for(int i=0; i<nameBytes.length; i++){
			nameBytesWithPadding[i] = nameBytes[i];
		}
		
		for(int i=nameBytes.length; i<maxLength; i++){
			nameBytesWithPadding[i] = (byte) 0x00;
		}
		
		return nameBytesWithPadding;
	}
	
	public static byte[] convertIntTobytes(int value){
		byte [] bytes = ByteBuffer.allocate(4).putInt(value).array();		
		return bytes;
	}
	
	public static byte[] convertLongTobytes(long value){
		byte [] bytes = ByteBuffer.allocate(8).putLong(value).array();		
		return bytes;
	}
}