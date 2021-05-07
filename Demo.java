import java.util.Date;
import java.time.Instant;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;

public class Demo {

	public static void main(String[] args){
		int a = -2147483647; //2147483648
		char c = 'g';
		String b = "ag"; // ['a', 'g', '\o']
		boolean f = true;
		
		int myageInseconds = 859919400;
		long myageeInMiilis = 859919400000l;
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(f);
		
		System.out.println("String length : "+b.length());
		
		String s = "start";
		System.out.println("s--->"+s);
		s="United States of America";
		System.out.println("s--->"+s);
		
		
		int p; //4 bytes are allocated
		Integer t; //0 bytes
		t = new Integer(100); //memory is allocated
		System.out.println(t);
		
		Student x = new Student(34, "Ravi", new Date());
		Student z = x;
		x=new Student(37, "Ram", new Date());
		
		System.out.println("x ---> "+x);
		System.out.println("z ---> "+z);
		
				
		Student y;
		/*for(int i=0; i<1000000000; i++){
			y = new Student(i, getRandomName(), getRandomDate());
			System.out.println(y);
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





