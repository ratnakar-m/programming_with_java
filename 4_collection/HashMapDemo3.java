import java.util.ArrayList;
import java.util.HashMap;

class HashMapDemo3{
	public static void main(String[] args){
	
		System.out.println("Generating Employees...");
		long startTime = System.currentTimeMillis();
		ArrayList<Employee> empsFromExternalSrc = getEmployeesFromExternalSource();
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken to Generate Employees: "+((endTime-startTime))+" milliseconds");
		
		String employeNameToSearch = "Arun";
		
		startTime = System.currentTimeMillis();
		boolean isFound = false;
		System.out.println("Beginning Search in ArrayList...");
		for(int i=0; i<empsFromExternalSrc.size(); i++)
		{
			Employee e = empsFromExternalSrc.get(i);
			if(e.getName().equals(employeNameToSearch)){
				isFound = true;
				break;
			}
				
		}
		if(isFound)
			System.out.println("Employee with Name "+employeNameToSearch+" is Found");
		else
			System.out.println("Employee with Name "+employeNameToSearch+" is NOT Found");
		
		endTime = System.currentTimeMillis();
		
		System.out.println("Time taken to Search: "+((endTime-startTime))+" milliseconds");
		
		System.out.println("-----------------------------------------------------");
		//Create hashmap of employees
		HashMap<String, Employee> employeesMap = new HashMap<>();
		for(int i=0; i<empsFromExternalSrc.size(); i++)
		{
			
			Employee e = empsFromExternalSrc.get(i);
			employeesMap.put(e.getName(), e);		
		}
		
		System.out.println("Beginning Search in HashMap...");
		startTime = System.currentTimeMillis();
		Employee empResult = employeesMap.get(employeNameToSearch);
		if(empResult != null)
			System.out.println("Employee with Name "+employeNameToSearch+" is Found in HashMap");
		else
			System.out.println("Employee with Name "+employeNameToSearch+" is NOT Found in HashMap");
		endTime = System.currentTimeMillis();
		System.out.println("Time taken to Search in HashMap: "+((endTime-startTime))+" milliseconds");
	
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
	
	public static ArrayList<Employee> getEmployeesFromExternalSource(){
		ArrayList<Employee> employees = new ArrayList<>();
		int numEmployeesToGenerate = 10000000;
		for(int i=0; i<numEmployeesToGenerate; i++){
			if(i==9500000)
			{
				Employee e = new Employee(i+1, "Arun");
				employees.add(e);
			}
			else
			{
				Employee e = new Employee(i+1, getRandomName());
				employees.add(e);
			}
		}		
		return employees;
	}
}