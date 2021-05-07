import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo{
	public static void main(String[] args){
		LinkedList queue = new LinkedList();
		
		queue.add(new FoodOrder(1, "Idly", 40, "Vijay"));
		queue.add(new FoodOrder(2, "Dosa", 50, "Ajith"));
		queue.add(new FoodOrder(3, "Upma", 35, "Krishna"));
		
		
		System.out.println(queue);
		
		queue.remove();
		System.out.println(queue);
		
		queue.add(new FoodOrder(4, "Vada", 50, "Rajesh"));
		System.out.println(queue);
		
		queue.remove();
		System.out.println(queue);
		
		queue.remove();
		System.out.println(queue);
	}
}