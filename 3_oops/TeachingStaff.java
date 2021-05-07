public class TeachingStaff extends Staff{
	String course;
	String degree;
	
	public TeachingStaff(String name, int age, char gender, int salary){
		super(name, age, gender, salary);
	}
	
	public void setCourse(String course){
		this.course=course;
	}
	
	public void setDegree(String degree){
		this.degree=degree;
	}
	
	public void parkVehicleAt(){
		System.out.println(this.name + " parked vehicle in teaching staff slot");
	}
}