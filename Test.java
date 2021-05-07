import java.util.Date;

public class Test{
	
	Student st;
	static int count;
	public static void main(String[] args){
		System.out.println("Entered Main method...");
		System s = new System();
		s.out;
		boolean b;
		int a = 10;
		Student s;
		Student x = new Student(34, "John", new Date());
		//Student.count
		//Student.id
		//x.id
		x.printId();
		System.out.println("Stduent Count: "+Student.count);
		System.out.println(x.id);
		
		Student y = new Student(66, "Alex", new Date());
		y.printId();
		System.out.println("Stduent Count: "+Student.getCount());
		System.out.println(y.id);
		
		m1();
		 System.out.println("Stduent Count: "+Student.count);
		
		System.out.println(x.id);
		int sum = add(3,4); //declaration, invokation, assignment
		div(3,4);
		System.out.println(a);
	}
	
	public static int add(int q, int p){
		return p+q;
	}
	
	public static int div(int q, int p){
		return p/q;
	}
	
	public static void m1(){
		
		int a = 10; //declartion and assignment
		int q;
		q=20;
		Student p;
		p = new Student(23, "Ram", new Date()); //id, name, birthdate
		
		
		System.out.println(a);
		m2(8);
	   Student st = new Student(25, "Rajesh", new Date());
		for(int i=0; i<1000l; i++){
		}
	}
	
	public static void m2(int num){
		boolean isreminderZero = num%2==0;
		if(isreminderZero)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");
	}
}
//Code Section
	//Class gets loaded with complete code {}
	
//Stack Section
		//main();
			//System.out.println();
			//m1();
				//m2();
			//add();
			//div();
			
			
		
//Heap Section
