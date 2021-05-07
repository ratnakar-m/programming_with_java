public class FoodOrder{
	public int tokenNo;
	public String item;
	public float price;
	public String orderer;
	
	public FoodOrder(int tokenNo, String item, float price, String name){
		this.tokenNo = tokenNo;
		this.item = item;
		this.price = price;
		this.orderer = name;
	}
	
	public String toString(){
		return "("+tokenNo+", "+item+", "+price+", "+orderer+")";
	}
	
}