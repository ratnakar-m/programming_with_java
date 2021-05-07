import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo2{
	public static void main(String[] args) throws Exception{
		
		Wallet w = new Wallet(500, new ArrayList<String>(Arrays.asList("ICICI", "HDFC")));
		Vehicle v = new Vehicle(30);
		Friend f1 = new Friend("Ram", false);
		List<Friend> friends = new ArrayList<>();
		friends.add(f1);
		v.drive();
		v.pickup(f1);
		System.out.println("Towards InorbitMall");
		//try{
			hangoutInInorbitMall(w, friends);
		//}
		/*catch(Exception e)
		{
			System.out.println(e.getMessage());
		}*/
		v.drive();
		v.drop(f1);
		System.out.println("Comeback to Home");
	}
	
	public static void hangoutInInorbitMall(Wallet w, List<Friend> friends) throws Exception{
		
		System.out.println("\tBegin Shopping");
		shop(w, friends);
		System.out.println("\tBegin Eating");
		foodCourt(w, friends);
		System.out.println("\tBegin Watching Movie");
		movie(w, friends);
	}
	
	public static void shop(Wallet w, List<Friend> friends) throws Exception{
		shop1stFloor(w, friends);
		shop2ndFloor(w, friends);
		shop3rdFloor(w, friends);
	}
	
	public static void shop1stFloor(Wallet w, List<Friend> friends) throws Exception{
		System.out.println("\t\tShopping in 1st floor");
		look();
		select();
		pay(w);
	}
	
	public static void shop2ndFloor(Wallet w, List<Friend> friends) throws Exception{
		System.out.println("\t\tShopping in 2nd floor");
		look();
		select();
		pay(w);
	}
	
	public static void shop3rdFloor(Wallet w, List<Friend> friends) throws Exception{
		System.out.println("\t\tShopping in 3rd floor");
		look();
		select();
		pay(w);
	}
	
	public static void foodCourt(Wallet w, List<Friend> friends)throws Exception	{
		pay(w);
		eat();
	}
	
	public static void movie(){
		buyTicket();
		watchMovie();
	}
	
	public static void eat(){
		System.out.println("\tEating");
	}
	
	public static void look(){
		System.out.println("\t\t\tLooking at the shirts and trousers");
	}
	
	public static void select(){
		System.out.println("\t\t\tSelecting the shirts and trousers tha you liked");
	}
	
	public static boolean pay(Wallet w) throws Exception{
				
		if(w.amount > 1000 && w.cards.size() > 0)
		{
			System.out.println("\t\tPaying for selected items");
			return true;
		}
		else
		{
			Exception ex = new Exception("Not enough money...");
			throw ex;
		}
		
		

	}
	
	public static boolean movie(Wallet w, List<Friend> friends){
		if(w.amount > 1000 && w.cards.size() > 0)
		{
			buyTicket();
			watchMovie();
			return true;
		}

		return false;
	}
	
	public static void buyTicket(){
		System.out.println("\tBuying ticket");
	}
	
	public static void watchMovie(){
		System.out.println("\tWatching movie");
	}
}