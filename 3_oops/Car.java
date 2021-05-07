interface -- Standard, Contract/Agreement, Specification

interface Car{
	public void start();
	public void drive();
	public void reverse();
	public void stop();
	public void applyBrake();
	public void applyWipers();
	public void switchLights();
}
interface BS6{
	emissionStandard();
}

interface AutoTrasmission{
}

interface ManualTrasmission{
	public void changeGears();
}

class MarutiCar implements Car, ManualTrasmission, BS6 {
	public void start(){
		System.out.println("Starting...");
	}
	public void drive(){
		System.out.println("Driving...");
	}
	public void reverse(){
		System.out.println("Reversing...");
	}
	public void stop(){
		System.out.println("Stopping...");
	}
	public void applyBrake(){
		System.out.println("Applying Breaks...");
	}
	public void applyWipers(){
		System.out.println("Applying Wipers...");
	}
	public void switchLights(boolean on){
		if(on)
			System.out.println("Switch on...");
		else
			System.out.println("Swicth off...");
	}
	
	public void changeGears(){
		System.out.println("Chaging Gears...");
	}
	
	public void emissionStandard(){
		System.out.println("Implemnted emission standard");
	}
}

class HyundaiCar implements Car, ManualTrasmission, BS6 {
	public void start(){
		System.out.println("Starting...");
	}
	public void drive(){
		System.out.println("Driving...");
	}
	public void reverse(){
		System.out.println("Reversing...");
	}
	public void stop(){
		System.out.println("Stopping...");
	}
	public void applyBrake(){
		System.out.println("Applying Breaks...");
	}
	public void applyWipers(){
		System.out.println("Applying Wipers...");
	}
	public void switchLights(boolean on){
		if(on)
			System.out.println("Switch on...");
		else
			System.out.println("Swicth off...");
	}
	
	public void changeGears(){
		System.out.println("Chaging Gears...");
	}
	
	public void emissionStandard(){
		System.out.println("Implemnted emission standard");
	}
}

	
Team 1 (Manufacturer) -> Car implemnts Car Object
Team 2 (Buyer/Driver) -> Consumes/Uses Car