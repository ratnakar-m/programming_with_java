public class Calculator{
	
    int p;
	
	public  static int sum(int x, int y){
		int a = x + y;
		return a;
	}
	
	public  static int sum(int x, int y, int z){
		int a = x + y + z;
		return a;
	}
	
	public  static int sum(String x, String y){
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		return a + b;
	}
	
	public  static int sum(String x, int y){
		int a = Integer.parseInt(x);
		return a + y;
	}
}