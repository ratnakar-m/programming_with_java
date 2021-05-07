interface AutonomousUniversity{
	
	public void labsForAllDepartments();
	public void optimumStudentFaculityRatio1to20();
	public void classRoomAccommodation();
	public void phdDegrees();
	public void departments();
	public void infrastructure(); //ground, labs, cafeteria, physical excersises
}

interface PrometricCenter{  //center to conduct GRE, TOEFL, GMAT, CAT, BITSAT
	public void noNoise();
	public void computersCondition(); 
	public void requiredSoftwares(); 
	public void goodToilets(); 
	public void cleanliness(); 
}

class MITS implements AutonomousUniversity, PrometricCenter {
	public void labsForAllDepartments(){}
	public void optimumStudentFaculityRatio1to20(){}
	public void classRoomAccommodation(){}
	public void phdDegrees(){}
	public void departments(){}
	public void infrastructure(){}
	public void noNoise(){}
	public void computersCondition(){}
	public void requiredSoftwares(){}
	public void goodToilets(){}
	public void cleanliness(){}
}

