import java.text.SimpleDateFormat;
import java.util.Date;

public class EqualsDemo{
	public static void main(String[] args) throws Exception{
		Employee employee1 = getEmployeeDataFromHRDatabase(23);
		Employee employee2 = getEmployeeDataFromFinanceDatabase(23);
		
		if(employee1 == employee2)
			System.out.println("Same Employee");
		else
			System.out.println("Different Employee");
		
		if(employee2.equals(employee1))
			System.out.println("Same Employee");
		else
			System.out.println("Different Employee");
	}
	
	public static Employee getEmployeeDataFromHRDatabase(int id) throws Exception{
		Employee e = new Employee(23, "Laxmi");
		e.setWorkExperience(23);
		e.setDegree("CSE");
		e.setAddress("Alwal, Secunderabad");
		e.setDob(getDate("1990-01-14"));
		return e;
	}
	
	public static Employee getEmployeeDataFromFinanceDatabase(int id){
		
		Employee e = new Employee(23, "Lakshmi");
		e.setPan("SDB9234IH");
		e.setSalary(200000);
		return e;
	}
	
	public static Date getDate(String dateStr) throws Exception{
		String pattern = "YYYY-MM-DD";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(dateStr);
		return date;
	}
}