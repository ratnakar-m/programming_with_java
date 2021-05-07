import java.util.HashSet;

public class HashSearchDemo{
	
	public static void main(String[] args){
		HashSet set = new HashSet();
		
		int numberToSearch = 345;
		
		set.add(23);
		set.add(2);
		set.add(89);
		set.add(74);
		set.add(32);
		set.add(68);
		set.add(12);
		set.add(54);
		set.add(35);
		set.add(23); 
		set.add(89); 
		set.add(74);
		set.add(10);
		set.add(58);
		set.add(32);
		set.add(69); 
		set.add(19);
		
		boolean isPresent = set.contains(numberToSearch);
		if(isPresent)
			System.out.println("Item is present");
		else
			System.out.println("Item is NOT present");
		
	}

}