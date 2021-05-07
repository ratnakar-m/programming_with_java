import java.net.InetAddress;
import java.net.UnknownHostException; 

/*
java IPAddressDemo google.com
java IPAddressDemo localhost
*/
public class IPAddressDemo{

	public static void main(String[] args) throws UnknownHostException{
		if(args.length < 1)
		{
			System.out.println("Usage: java IPAddressDemo <hostname>");
			return;
		}
		InetAddress addr = InetAddress.getByName(args[0]);
		System.out.println(addr.getHostName());
		System.out.println(addr.getHostAddress());
	}
	
}
