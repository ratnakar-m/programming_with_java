import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.lang.String;
import java.io.IOException;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  


//insert into employees(name, id, gender, dob) values("Ratnakar", 1, 'M', '03-09-1981')
//Program <--- DataInputStream ---> FileInputStream ---> File

public class ReadEmployeesUsingSeparator{
	public static void main(String[] args) throws IOException, ParseException{
		FileInputStream fos = new FileOutputStream("employees.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//Read 1 employee
		dos.readLine();
		dos.writeChars("Ratnakar");
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
}