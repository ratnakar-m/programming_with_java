import java.util.List;
import java.util.ArrayList;

public class Demo{
	
	public static void main(String[] args){
		List<String> s = new ArrayList<>();
		int l = m1(s);
		
		System.out.println("String returned by m1: "+s);
		System.out.println("int returned by m1: "+l);
	}
	
	public static int m1(List<String> s){
		s.add("Ratnakar");
		return s.size();
	}
}