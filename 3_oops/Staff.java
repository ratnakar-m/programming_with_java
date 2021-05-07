public abstract class Staff extends Person{
	int salary;
	String department;
	
	public Staff(String name, int age, char gender, int salary){
		super(name, age, gender);
		this.salary=salary;
	}
	
	public void setDepartment(String deptName){
		this.department=deptName;
	}
}