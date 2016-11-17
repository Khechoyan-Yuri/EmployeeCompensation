//Senior class

public class SeniorEmployee extends Employee{
	
	//Variables 
	double annualBonus;
	
	//SeniorEmployee Constructor
	public SeniorEmployee(int iD, int year, double salary, double compensation, double annualBonus) {
		super(iD, year, salary, compensation);
		this.annualBonus = annualBonus;
	}

	//Setters
	public void setAnnualBonus(double annualBonus) {
		this.annualBonus = annualBonus;
	}
	
	//Getters
	public double getAnnualBonus() {
		return annualBonus;
	}

	//toString method - displays employee’s ID, year hired, & annualBonus
	@Override
	public String toString() {
		return "SeniorEmployee [annualBonus=" + annualBonus + ", ID=" + ID + ", year=" + year + "]";
	}
	
	
}