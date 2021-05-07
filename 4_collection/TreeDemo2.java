import java.util.TreeSet;

public class TreeDemo2{
	public static void main(String[] args)
	{
		Player p1 = new Player("VK", "India", 10000, 50.7f, 3);
		Player p2 = new Player("KW", "New Zealand", 7000, 52, 2);
		Player p3 = new Player("JR", "England", 8000, 52.0f, 4);
		Player p4 = new Player("DW", "Australia", 9000, 60.0f, 1);
		Player p5 = new Player("AB", "South Africa", 8000, 55, 5);
		Player p6 = new Player("CG", "West Indies", 11000, 45, 9); 
		Player p7 = new Player("GM", "Australia", 6000, 48, 12);
		
		TreeSet<Player> tree = new TreeSet<>();
		tree.add(p1);
		tree.add(p2);
		tree.add(p3);
		tree.add(p4);
		tree.add(p5);
		tree.add(p6);
		tree.add(p7);
		
		System.out.println("Printing before adding new two players");
		System.out.println(tree);
		
		
		Player p8 = new Player("SD", "India", 9000, 52.5f, 7);
		Player p9 = new Player("BS", "England", 6000, 70.0f, 6);
		
		tree.add(p8);
		tree.add(p9);
		
		System.out.println("Printing after adding new two players"+p8+" and "+p9);
		System.out.println(tree);
		
	}
}