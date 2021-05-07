import java.util.Date;

public class Student{
	int id;  //4 bytes
	String name; //~10 bytes
	Date birthday; //8 bytes
	boolean isGraduated;
	int numOfBacklogs = 10;
	String address;
	int distancefromCollege;
	
	static int count = 10;
	static Calculator cal = new Calculator();
	
	static {
		count = count + 100;
	}
	
	public Student(int id, String namex, Date birthdayx, int distancefromCollege){
		this.id = id;
		name = namex;
		birthday = birthdayx;
		this.distancefromCollege = distancefromCollege;
		count = count + 1;
	}
	
	@Override
	public String toString(){
		return this.id+", "+this.name+", "+this.birthday;
	}
	
	public void printId(){
		//int id = 10;
		System.out.println(id);
		System.out.println(count);
	}
	
	public Date getBirthday(){
		return birthday;
	}
	public String getName(){
		return name;
	}
	
	public void doNothing(){
	}
	
	public int getId(){
		return id;
	}
	
	public boolean getIsGraduated(){
		return isGraduated;
	}
	
	static int getCount(){
		return count;
	}
	
    int printCount(){
		return count;
	}
	
	public void changeName(String name){
		this.name = name;
	}
	
	
	public void writeExam(){
		//use id
		//use name
		//use birthday
		
		//use numOfBacklogs
		
	}
	
	public void prepareForExam(){
	}
	
	public void modeOfTransportation(){
		if(distancefromCollege <= 1)
			System.out.println("Name:" + name+ ", Transport: Walk");
		else if(distancefromCollege <= 5)
			System.out.println("Name:" + name+ ", Transport: Bike");
		else if(distancefromCollege > 5)
			System.out.println("Name:" + name+ ", Transport: Bus");
	}
	
	public void run(){
		System.out.printn("Running");
	}
	
	public void meet(){
	}
}

