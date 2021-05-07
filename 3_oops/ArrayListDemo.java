import java.util.ArrayList;

class ArrayListDemo{
	
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);//Autoboxing into its respective Box class
		al.add(5555);
		al.add(new Integer(200));
		
		System.out.println(al);
		
		al.remove(new Integer(5555));
		
		System.out.println(al);
		
		/*Student st1 = new Student("Rajesh", 20, 'M', 1);
		Student st2 = new Student("Alex", 21, 'M', 2);
		Student st3 = new Student("Rita", 20, 'F', 3);
		
		ArrayList al = new ArrayList();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		
		
		int numStudents = 1000000;
		
		for(int i=0; i< numStudents; i++){
			int genderIdx = i%2;
			char gender;
			if(genderIdx==0)
				gender='M';
			else
				gender='F';
				
			Student st = new Student("random"+i, i%20,gender , 4+i);
			al.add(st);
		}
		
		System.out.println(al);
		
		Student st = (Student) al.remove(0);
		System.out.println("Removed Student: "+st);*/
	}
}