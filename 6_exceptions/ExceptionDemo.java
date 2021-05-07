public class ExceptionDemo{
	public static void main(String[] args)throws Exception{
		System.out.println("Hello");
		int n=-6;
		int result = MathUtil.factorial(n);
		System.out.println("factorial of "+n+" is: "+result);
		int sum = MathUtil.sum(4,5);
		System.out.println("sum is "+sum);
	}
}