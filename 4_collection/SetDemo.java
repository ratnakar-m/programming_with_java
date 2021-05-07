import java.util.Set;
import java.util.HashSet;

public class SetDemo{
	public static void main(String[] args){
		Employee a = new Employee(1, "Laxmi");
		Employee b = new Employee(2, "Bharat");
		Employee c = new Employee(3, "Krishna");
		Employee d = new Employee(1, "Vani");

		HashSet<Employee> s = new HashSet<>();
		
		boolean isAdded = s.add(a);
		checkIfAdded(a, isAdded);
		
		isAdded = s.add(b);
		checkIfAdded(b, isAdded);
		
		isAdded = s.add(c);
		checkIfAdded(c, isAdded);
		
		isAdded = s.add(d);
		checkIfAdded(d, isAdded);
		

		System.out.println(s.size());
	}
	
	public static void checkIfAdded(Employee e, boolean isAdded){
		if(isAdded)
			System.out.println("Employee "+e+" is added");
		else
			System.out.println("Employee "+e+" NOT added");
	}
}