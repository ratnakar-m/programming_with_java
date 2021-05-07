import java.util.Set;
import java.util.HashSet;

public class Vehicle{
	int fuelQty;
	int numPassengers = 1;
	Set<Friend> passengers = new HashSet<>();
	
	Vehicle(int qty){
		fuelQty=qty;
	}
	
	public void drive(){
		System.out.println("Driving");
	}
	
	public void pickup(Friend f){
		System.out.println("\tpicked up friend: "+f.name);
		passengers.add(f);
		numPassengers++;
	}
	
	public void drop(Friend f){
		passengers.remove(f);
		numPassengers--;
		System.out.println("\tDropped friend: "+f.name);
	}
	
}