import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparableDemo{
	public static void main(String[] args) throws Exception{
		Employee employee1 = new Employee(1, "Alex");
		employee1.setWorkExperience(15);
		
		Employee employee2 = new Employee(2, "Rajesh");
		employee2.setWorkExperience(10);
		
		Employee employee3 = new Employee(3, "Ram");
		employee3.setWorkExperience(10);
		
		employee1.compareTo(employee2); //1
		employee2.compareTo(employee1); //-1
		employee2.compareTo(employee3); //0
		employee3.compareTo(employee2); //0
	}
	
	
	public static Date getDate(String dateStr) throws Exception{
		String pattern = "YYYY-MM-DD";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(dateStr);
		return date;
	}
}