/**
Purpose: To demonstrate NullPointerException
**/

public class ExceptionDemo4{
	public static void main(String[] args){
		System.out.println("main: statement1");
		System.out.println("main: statement2");
		m1();
		System.out.println("main: statement4");
	}
	
	public static void m1() {
		Vehicle v = VehicleFactory.manufacture();
		v.drive();		
	}

}