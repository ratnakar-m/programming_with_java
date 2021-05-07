import java.util.Date;
import java.lang.Comparable;

public class Employee implements Comparable{
	String name;
	int id;
	Date dob;
	String address;
	String degree;
	int workExperience;
	String pan;
	float salary;
	
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setDob(Date dob){
		this.dob = dob;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setDegree(String degree){
		this.degree = degree;
	}
	
	public void setWorkExperience(int workExperience){
		this.workExperience = workExperience;
	}
	
	public void setPan(String pan){
		this.pan = pan;
	}
	
	public void setSalary(float salary){
		this.salary = salary;
	}
	
	@Override
	public boolean	equals(Object obj){
		Employee e = (Employee) obj;
		return this.id == e.id;
	}
	
	@Override
	public int	hashCode(){
		return this.id;
	}
	
	@Override
	public String toString(){
		return "("+this.id+", "+this.name+")";
	}
	
	public int	compareTo(Object o){
		Employee e = (Employee) o;
		if(this.workExperience > e.workExperience)
			return 1;
		else if (this.workExperience < e.workExperience)
			return -1;
		else
			return 0;
	}
}