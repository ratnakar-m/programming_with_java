public class MathUtil{
	
	public static int factorial(int n) throws Exception{
		
		if(n < 0)
		{
			Exception e = new Exception("Factorial is not defined for negative numbers");
			throw e;
		}
		
		if(n==0 || n==1)
			return 1;
			
		int factorialResult = 1;
		for(int i=2; i<=n; i++)
			factorialResult = factorialResult * i;
		
		return factorialResult;
	}
	
	public static int sum(int a, int b){
		return a+b;
	}
}