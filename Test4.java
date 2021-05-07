public class Test4{

	public static void main(String[] args){
		m1();
		int s = Calculator.sum(3, 5);
		int x = Calculator.sum(3, 5, 6);
		int y = Calculator.sum("30", "50");
		int z = Calculator.sum("30", 50);
	
		Student.cal.sum(4,5);
	}
	
	public static void m1(){
		Student st = new Student();
	}
}