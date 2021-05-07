import java.util.Date;

public class InstanceVariableDemo {
	
	public static void main(String[] args){
		
		Student y = new Student(36, "alex", new Date());
		Student x = new Student(23, "rajesh", new Date());
		
		System.out.println(x.getName());
		System.out.println(x.getId());
	}
}