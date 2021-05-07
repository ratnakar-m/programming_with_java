public class VehicleFactory{
	public static Vehicle manufacture(){
		int rand = getRandomNumber(1,100);
		System.out.println("generated random number: "+rand);
		if(rand%2 == 0)
			return new Vehicle(25);
		else
			return null;
	}
	
	public static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
