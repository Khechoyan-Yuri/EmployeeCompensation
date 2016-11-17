//Manager class

public class Manager extends Employee{
	
	//Variables
	double stockDividend;

	//Manager Constructor
	public Manager(int iD, int year, double salary, double compensation, double stockDividend) {
		super(iD, year, salary, compensation);
		this.stockDividend = stockDividend;
	}

	//Setters
	public void setStockDividend(double stockDividend) {
		this.stockDividend = stockDividend;
	}
	
	//Getters
	public double getStockDividend() {
		return stockDividend;
	}

	//toString method - displays employee’s ID, year hired, & stockDividend
	@Override
	public String toString() {
		return "Manager [stockDividend=" + stockDividend + ", ID=" + ID + ", year=" + year + "]";
	}

}