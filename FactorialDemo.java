
public class FactorialDemo{
    
	public static void main(String[] args){
		int input = 5;
		int result = factorial(input);
		System.out.println("Result got from recursion: "+result);
		
		result = factorialLoop(input);
		System.out.println("Result got from loop: "+result);
	}
	
	public static int factorial(int n){
		if(n==0)
			return 1;
		int factorialResult = n*factorial(n-1);
		return factorialResult;
	}
	
	
	public static int factorialLoop(int n){
		if(n==0 || n==1)
			return 1;
		
		int factorialResult = 1;
		for(int i=2; i<=n; i++){
			factorialResult = factorialResult*i;
		}
		
		return factorialResult;
	}
}


