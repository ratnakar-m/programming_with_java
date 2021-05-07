public class StackOverFlowDemo{

	public static void main(String[] args){
		System.out.println();
		m1();
		System.out.println();
	}
	
	//method calling itself - is a recursion
	public static void m1(){
		m2();
	}
	
	public static void m2(){
		m1();
	}
}