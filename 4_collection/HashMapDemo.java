import java.util.HashMap;
import java.util.ArrayList;

/*
	List of key value pairs
	key could be an int, string, book or anything
	value could be an int, string, book or anything
*/

public class HashMapDemo{
	public static void main(String[] args){
		HashMap<Integer, Employee> employeeMap= new HashMap<>();
		
		employeeMap.put(1, new Employee(1, "Alex"));
		employeeMap.put(2, new Employee(2, "Arun"));
		employeeMap.put(3, new Employee(3, "Ben"));
		employeeMap.put(4, new Employee(4, "Carl"));
		employeeMap.put(5, new Employee(5, "Roy"));
		employeeMap.put(7, new Employee(7, "Fritz"));
		
		Employee emp = employeeMap.get(7);
		System.out.println(emp);
		
		emp = employeeMap.get(2);
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