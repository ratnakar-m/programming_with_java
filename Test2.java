public class Test2{
	public static void main(String[] args){
		
		System.out.println(Student.count);
		int countx = Student.getCount();
		System.out.println(countx);
		countx = 20;
		System.out.println(Student.count);
		Student.count++;
		System.out.println(Student.count);
		Student st = new Student(23, "Rajesh", new Date())

	}
}

/*
	What happens when you refer to the class for the first time?
	a) class gets loaded
	b) static variables are initialized to default value or inital value
	c) static blocks are executed
*/

/*
	what happens when object is created?
	Object get created in heap
	object/instance variables are initialized
	Constructor gets called
	
*/
