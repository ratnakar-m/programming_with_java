import java.util.HashMap;
import java.util.ArrayList;

/*
	List of key value pairs
	key could be an int, string, book or anything
	value could be an int, string, book or anything
*/

public class HashMapDemo2{
	public static void main(String[] args){
		HashMap<Integer, Employee> employeeMap= new HashMap<>();
		
		employeeMap.put("Alex", new Employee(1, "Alex"));
		employeeMap.put("Arun", new Employee(2, "Arun"));
		employeeMap.put("Ben", new Employee(3, "Ben"));
		employeeMap.put("Carl", new Employee(4, "Carl"));
		employeeMap.put("Roy", new Employee(5, "Roy"));
		employeeMap.put("Fritz", new Employee(7, "Fritz"));
		
		Employee emp = employeeMap.get("Fritz");
		System.out.println(emp);
		
		emp = employeeMap.get("Arun");
		System.out.println(emp);
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Alex"));
		employeeList.add(new Employee(5, "Roy"));
		employeeList.add(new Employee(3, "Ben"));
		employeeList.add(new Employee(7, "Fritz"));
		employeeList.add(new Employee(4, "Carl"));
		employeeList.add(new Employee(2, "Arun"));
		
		//emp = employeeList.get(5);
		boolean isFound = false;
		for(Employee e: employeeList){
			if(e.getName().equals("Arun"))
			{
				isFound = true;
				break;
			}
		}
		System.out.println("isFound: "+isFound);
	}
}