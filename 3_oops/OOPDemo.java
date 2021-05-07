import java.util.Date;

public class OOPDemo{
	public static void main(String[] args){
		
		Student st = new Student("George", 20, 'M', 1);
		
		st.parkVehicleAt();
		
		TeachingStaff teachingStaff = new TeachingStaff("Ramakrishna", 35, 'M', 10000);
		teachingStaff.setCourse("Operating Systems");
		teachingStaff.setDegree("Phd. in CSE");
		
		teachingStaff.parkVehicleAt();

	}
}