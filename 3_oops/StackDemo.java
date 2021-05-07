import java.util.Stack;

public class StackDemo{
	public static void main(String[] args){
		Stack booksStack = new Stack();
		booksStack.add(new Book("Java Complete Reference", "Herbert Schildtt"));
		booksStack.add(new Book("Fluent Python", "Mark Reynolds"));
		booksStack.add(new Book("Web Technologies", "Garcia Fields"));
		
		//booksStack.remove(booksStack.size()-1); //OR booksStack.pop();
		
		System.out.println(booksStack);
		
		System.out.println("Stack Size: "+booksStack.size());
		Book book = (Book)booksStack.pop();
		System.out.println(book);
		
		System.out.println("Stack Size: "+booksStack.size());
		book = (Book)booksStack.pop();
		System.out.println(book);
		
		System.out.println("Stack Size: "+booksStack.size());
		book = (Book)booksStack.pop();
		System.out.println(book);
		
		System.out.println("Stack Size: "+booksStack.size());
		
		
	}
}