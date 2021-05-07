interface Engineer{
	public void internship();
}

interface CivilEngineer extends Engineer{
	public void civilDegree();
}

interface Mathematics extends Engineer{
	public void mathDegree();
}

class DualDegree implements CivilEngineer, Mathematics{
	internship(){}
	civilDegree(){}
	mathDegree(){}
}

class Professional implements CivilEngineer{
	internship(){}
	civilDegree(){}
}