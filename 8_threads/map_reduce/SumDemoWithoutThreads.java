import java.math.BigInteger;
/**
find sum of numbers between 1 to 50000000000 (50 billion)

1 + 2 + 3 + 4 + ...............49999999997+  49999999998+ 49999999999+ 50000000000 

int - 4 bytes = 32 bits - 
long - 8 bytes = 
BigInteger
**/
public class SumDemoWithoutThreads{
	public static void main(String[] args){
		long n = 500000000l; //50 billion
		BigInteger sum  = new BigInteger("0");
		long startTime = System.currentTimeMillis();
		for(long i = 0; i <= n; i++)
		{
			sum = sum.add(BigInteger.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken (in millisecons): "+(endTime - startTime));
		System.out.println("Sum = "+sum);
	}
	
}