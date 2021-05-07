public class HashCodeDemo{
	public static void main(String[] args){
		Integer i = new Integer(10);
		System.out.println(i.hashCode());
		
		String s = "Ratnakar";
		System.out.println(s.hashCode());
		
		String t = new String("Ratnakar");
		System.out.println(t.hashCode());
		
		System.out.println("s == t " + (s == t)); //false
		System.out.println("s.equals(t) " +s.equals(t)); //true
		
		String v = "Ratnakar";
		System.out.println(v.hashCode());
		
		System.out.println("s == v " + (s == v)); //?
		System.out.println("s.equals(v) " +s.equals(v)); //?
	}
}

/*Note: 
1) if two objects are equal => their hash codes are same
2) if two objects hashcodes are same no necessarily mean the objets are equal




x%4

int hashCode()
{
	return value%4;
}

a = new Integer(10) -> 2
12 -> 0
1  -> 1
7  -> 3
3  -> 3
c = new Integer(2)  -> 2
8  -> 0
b = new Integer(10) -> 2

a == b //false
a.equals(b) //true

%/