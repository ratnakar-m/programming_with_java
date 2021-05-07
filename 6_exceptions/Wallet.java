import java.util.List;

public class Wallet{
	int amount;
	List<String> cards;
	
	public Wallet(int amount, List<String> cards){
		this.amount=amount;
		this.cards=cards;
	}
}