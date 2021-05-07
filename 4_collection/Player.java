public class Player implements Comparable{
	int runs;
	String name;
	String country;
	float strikeRate;
	int ranking;
	
	public Player(String name, String country, int runs, float strikeRate, int ranking){
		this.runs = runs;
		this.name = name;
		this.country = country;
		this.strikeRate = strikeRate;
		this.ranking = ranking;
	}
	
	public int compareTo(Object object){
		Player player = (Player) object;
		if(this.strikeRate > player.strikeRate)
			return 1;
		else if(this.strikeRate < player.strikeRate)
			return -1;
		else
			return 0;
	}
	
	public String toString(){
		return "("+name+" - "+strikeRate+")";
	}
}