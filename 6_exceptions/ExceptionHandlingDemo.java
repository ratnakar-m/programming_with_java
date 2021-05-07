public class ExceptionHandlingDemo{
	public static void main(String[] args){
		
		if(args.length < 1){
			System.out.println("Usage: java ExceptionHandlingDemo <int>");
			return;
		}
		
		String arg1 = args[0];
		int number = Integer.parseInt(arg1);
		
		System.out.println("statement 1");
		
		if(number < 0){
			try{
				throw new Exception("Negative Number given");
			}
			catch(Exception e){
				System.out.println("Handled the exception: "+e.getMessage());
			}
		}
		
		System.out.println("Number given is: "+number);
		System.out.println("statement 3");
		
	}
}