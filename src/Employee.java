//Employee Class

 public class Employee{
	 
	 protected int ID;
	 protected int year;
	 protected double salary;
	 protected double compensation;
	 protected double totalCompensation;
	 protected String employeeSummary;
	 public Employee() {
			ID = 0;
			year = 0;
			salary = 0;
			totalCompensation = 0;
	}
	 public void setID(int userID) {
			ID = userID;
	}
	 public void setYearHired(int YearHired) {
			year = YearHired;
	}
	 public void setBaseSalary(double BaseSalary) {
			salary = BaseSalary;
	}
	 public void setCompensation(double Compensation) {
			compensation = Compensation;
	}
	 public void setTotalCompensation(double TotalCompensation) {
			totalCompensation = TotalCompensation;
	}
	 public int getID() {
			return ID;
	}
	 public int getYearHired() {
			return year;
	}
	 public double getBaseSalary() {
			return salary;
	}
	 public double getCompensation() {
			return compensation;
	}
	 public double getTotalCompensation() {
			return totalCompensation;
	}
	 public String EmployeeSummary() {
			return getID() +"\t"+getYearHired()+"\t"+getBaseSalary()+"\t"+getCompensation();
	}
	 public String toString() {
			return ID +" "+ year +" "+ salary +" "+ totalCompensation;
	}
	 public String EndingSummary() {
			return "null";
	}
}//Closes Employee Class