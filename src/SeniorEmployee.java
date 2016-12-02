//Senior class

public class SeniorEmployee extends Employee implements EmployeeCompensation{
	double annualBonus;
	//SeniorEmployee Method
	public SeniorEmployee(int ID, int YearHired, double BaseSalary, double eAnnualBonus){
		setID(ID);
		setYearHired(YearHired);
		setBaseSalary(BaseSalary);
		setAnnualBonus(eAnnualBonus);
	}
	//Setting Annual Bonus method
	public void setAnnualBonus(double eAnnualBonus){
		annualBonus = eAnnualBonus;
	}
	//Getting Annual Bonus method
	public double getAnnualBonus(){
		return annualBonus;
	}
	//EmployeeSummary string method extracts important information from file and arranges them
	//in this order: ID, Year Hired, Base Salary, Total Compensation (line 31)
	public String EmployeeSummary(){
		return String.format("%d\t%d\t\tSenior\t\t$%,.2f\t\t$%,.2f\r\n", getID(), getYearHired(), getBaseSalary(), CalculateTotalCompensation());
	}
	//Produces a general print Summary based on information compiled in line 22
	public String toString(){
		return String.format("This is a senior employee. ID is %d, hired since %d, and annual bonus is $%,.2f.\r\n", 
				getID(), getYearHired(), getAnnualBonus());
	}
	//Calculation for Senior Employee Total Compensation: Annual Bonus + Base Salary
	public double CalculateTotalCompensation(){
		setTotalCompensation(getAnnualBonus() + getBaseSalary());
		return getTotalCompensation();
	}
}//Closes SeniorEmployee Class w/Employee extension & EmployeeComensation interface