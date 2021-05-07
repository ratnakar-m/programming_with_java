import java.util.Date;

public class DateDemo{
	public static void main(String[] args){
		System.out.println(System.currentTimeMillis());
		Date d = new Date(0l);
		System.out.println(d.toString());
	}
}