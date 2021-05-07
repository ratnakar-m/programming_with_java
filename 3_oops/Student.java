class Student extends Person{
	int id;
	String branch;
	float aggregate;
	boolean hasdues;
	
	public Student(String name, int age, char gender, int id){
		super(name, age, gender);
		this.id = id;
	}
	
	public void parkVehicleAt(){
		System.out.println(this.name + " parked vehicle in Student slot");
	}
	
	@Override
	public String toString(){
		return "( "+name+", "+age+", "+gender+", "+id+" )";
	}
}