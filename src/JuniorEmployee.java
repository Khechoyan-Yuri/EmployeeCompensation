//Junior class

public class JuniorEmployee extends Employee{
	
	//Variables
	double juniorCommission;

	//JuniorEmployee Constructor
	public JuniorEmployee(int iD, int year, double salary, double compensation, double juniorCommission) {
		super(iD, year, salary, compensation);
		this.juniorCommission = juniorCommission;
	}
	
	//Setters
	public void setJuniorCommission(double juniorCommission) {
		this.juniorCommission = juniorCommission;
	}
	
	//Getters
	public double getJuniorCommission() {
		return juniorCommission;
	}

	//toString method - displays employee’s ID, year hired, salary, & JuniorCommission
	@Override
	public String toString() {
		return "JuniorEmployee [juniorCommission=" + juniorCommission + ", ID=" + ID + ", year=" + year + "]";
	}
	
		
	//EmployeeCompensation Interface
	
}