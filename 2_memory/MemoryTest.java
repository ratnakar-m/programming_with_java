import java.time.LocalDate;
import java.util.Date;
import java.time.ZoneId;
import java.util.ArrayList;

//java -Xmx5m Test
public class MemoryTest{
	public static void main(String[] args){
		
		System.out.println(args[0]);
		String val = System.getProperty("abdkey");
		System.out.println(val);
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("os.name"));
		ArrayList<Student> sts = new ArrayList<>();
		
		/*for(int i=0; i<1000000000; i++){
			sts.add(new Student(i, getRandomName(), getRandomDate()));
			System.out.println(sts.get(i));
		}*/
	}
	
	public static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
	
	public static String getRandomName(){
		String randomStringForName="abcdefghijlmnopqrstuvwxyz";
		
		String name = "";
		int nameLength = 10;
		for(int i=0; i<nameLength; i++){
			int randIdx = getRandomNumber(0, 25);
			name+=randomStringForName.charAt(randIdx);
		}
		return name;
	}
	
	public static Date getRandomDate() {
		int startYear = 1991;
		int endYear = 1996;
        int day = getRandomNumber(1, 28);
        int month = getRandomNumber(1, 12);
        int year = getRandomNumber(startYear, endYear);
        LocalDate ld =  LocalDate.of(year, month, day);
		
		Date date = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		return date;
    }
	
	
}