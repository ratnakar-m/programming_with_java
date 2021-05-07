abstract class Person{
	String name;
	int age;
	char gender;
	
	public Person(String name, int id, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}

