/* ========================================================================== */
/*	PROGRAM Employee Compensation

    AUTHOR: Yuri Khechoyan
    COURSE NUMBER: CIS 210
    COURSE SECTION NUMBER: 01
    INSTRUCTOR NAME: Dr. Tian
    PROJECT NUMBER: 10
    DUE DATE: 11/29/2016

SUMMARY

	This program is designed to read in a csv file.
	The program will already know the name of the file. It will 
	start importing the data from the file and proceed with its purpose. 	
	The list of tasks that this program is designed to do...

	Separate:
	-Employee ID Number
	-Year Employee was Hired
	-Employee's Occupation Title
	-Employee's Base Salary
	-Employee's extra Compensation
	

	1. Read in the content of the file. 

	2. Store the Employees' ID numbers

	3. Store the Employees' Hiring Year

	4. Store the Employees' Occupation Title

	5. Store the Employees' Base Salary

	6. Store the Employees' extra Compensation 

    7. Output all of the information in an organized manner (example shown under 'OUTPUT')

	
INPUT

	The input for this program will be a text file appropriately titled:
	--'Employees.csv'--
	
OUTPUT

	The output for this program will be the Employees' ID numbers, 
	Year Hired, Occupation Title, BaseSalary, & Compensation 
	Employees will be re-arranged in ascending order based on their ID numbers
	Here is an example of how the output of the program would look:

	Sample output:  
 
	ID       YEAR_HIRED   TITLE       BASE_SALARY   COMPENSATION    
	11         1999       Senior       $50,000        $60,000 
	This is a senior employee. ID is 11, hired since 1999, and annual bonus is $10,000.  
	12         2000       Junior       $50,000        $55,000 
	This is a junior employee. ID is 12, hired since 2000, and commission is $5,000. 
	13         1980       Manager      $80,000       $100,000 
	This is a manager. ID is 13, hired since 1980, and stock dividend is $20,000.
	14         2012       Junior       $50,000        $51,000 
	This is a junior employee. ID is 14, hired since 2012, and commission is $1,000.  
 
 ------------------------------------------------------------------------------------
 
	Employee 13 is a manager. Dividend is $20,000! 
 
	Good bye!


ASSUMPTIONS

- Program assumes that the file is already in the correct location. 
- The program assumes that the file exists and is inside of the project folder
- but outside of the source folder

*/

//*******************************
//*START OF MainProgram CLASS	*
//*******************************

import java.util.Scanner;												//Imports Scanner Utility
import java.io.*;														//Imports File IO
import java.util.ArrayList;												//Imports ArrayList Utility

public class MainProgram{
	public static void main(String[] args) throws IOException{
		
		//Ask and receive file name from User
		System.out.println("Enter the name of the file: ");
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
		keyboard.close();
		
		//MainProgran only used to Read in Data, 
		//initialize Selection Sort, and print to console/file
		ArrayList<Employee> obj1 = ReadInputData("Employees.csv");
		ArrayList<Employee> obj2 = SelectionSort(obj1);
		PrintManagerDividend(obj2, "employeeOutput.txt");	
	}//Closes Main Method
//=======================================================================
	
	//*********************
	// METHOD DEFINITIONS *
	//*********************
	
	/**
	 * ReadInputData method that creates the counter for number of lines
	 * Closes the object when program finishes
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<Employee> ReadInputData(String fileName) throws IOException{
		int numOfLines = 0;
		File file = new File(fileName);	
		
		Scanner fileCount = new Scanner(file);
		Scanner fileInput = new Scanner(file);
		
		//Add to fileCount counter while a line is read
		while(fileCount.hasNextLine()){
			fileCount.nextLine();
			numOfLines++;
		}
		//Closes fileCount object
		fileCount.close();
		
		//Create a string array for numOfLines
		String [] stringArray = new String[numOfLines];
		int i = 0;
		
		//Add to fileInput counter while file has another line
		while(fileInput.hasNextLine()){
			stringArray[i] = fileInput.nextLine();
			i++;
		}
		//Closes fileInput object
		fileInput.close();
		//Creates a 2nd ArrayList inside of the Employee ArrayList called employeeClass
		ArrayList<Employee> employeeClass = new ArrayList<Employee>();
		
		//Loops through and reads in all employees data, separates data by comma separation
		for(i=1; i<stringArray.length; i++){
			//Organizes string elements into sub strings based 
			//on what each employee is classified as 
			String [] employeeRecord = stringArray[i].split("[,]");
			
			//if element is of Junior status
			if(employeeRecord[2].equals(" Junior")){
				employeeClass.add(new JuniorEmployee(Integer.parseInt(employeeRecord[0]),
					Integer.parseInt(employeeRecord[1]),
					Double.parseDouble(employeeRecord[3]),
					Double.parseDouble(employeeRecord[4])));
			}
			//if element is of Senior status
			else if(employeeRecord[2].equals(" Senior")){
				employeeClass.add(new SeniorEmployee(Integer.parseInt(employeeRecord[0]),
					Integer.parseInt(employeeRecord[1]),
					Double.parseDouble(employeeRecord[3]),
					Double.parseDouble(employeeRecord[4])));
			}
			//if element is of Manager status
			else if(employeeRecord[2].equals(" Manager")){			
				employeeClass.add(new Manager(Integer.parseInt(employeeRecord[0]),
					Integer.parseInt(employeeRecord[1]),
					Double.parseDouble(employeeRecord[3]),
					Double.parseDouble(employeeRecord[4])));
			}
		}//Closes for Loop
		
		return employeeClass;
	}//Closes ReadInputData Method
//======================================================================================
	
	/**
	 * Reads in the EmployeeList and associates related elements with ID number
	 * @param employeeList
	 * @return
	 */
	public static ArrayList<Employee> SelectionSort(ArrayList<Employee> employeeList){
		 int startScan, index, minIndex;
		 Employee minValue = new Employee();
		 for (startScan = 0; startScan < (employeeList.size()-1); startScan++){
		     minIndex = startScan;
		     minValue = (employeeList.get(startScan));         
		     
		     //Organizes information from SelectionSort method in numerical ascending order   
		     for(index = startScan + 1; index < employeeList.size(); index++){
		    	 if (employeeList.get(index).getID() < minValue.getID()){
		          minValue = employeeList.get(index);
		          minIndex = index;
		    	 }
		     }//Closes 2nd for loop

		         //Replaces minIndex value with the startIndex value
		         employeeList.remove(minIndex);
		         employeeList.add(minIndex,employeeList.get(startScan));
		         employeeList.remove(startScan);
		         employeeList.add(startScan, minValue);
		 }//Closes large for loop
		 
		 return employeeList;
	}//Closes SelectionSort Method
//========================================================================================
	
	/**
	 * Output all of the relevant Information out to the employeeOutput.txt file 
	 * @param employeeList
	 * @param fileName
	 * @throws IOException
	 */
	public static void PrintManagerDividend(ArrayList<Employee> employeeList, String fileName) throws IOException{
		//Creates PrintWriter object to Output to File
		PrintWriter fileOutput = new PrintWriter(fileName);
		//Prints out Header
		fileOutput.println("ID\tYEAR HIRED\tTITLE\t\tBASE SALARY\tCOMPENSATION");	
		//Print out all Information that was separated by commas
		for(int i=0; i<employeeList.size(); i++) {
			fileOutput.printf(employeeList.get(i).EmployeeSummary());
			fileOutput.printf(employeeList.get(i).toString());
		}		
		//Prints out Dividing Line
		fileOutput.println("-------------------------------------\r\n");
		//Find and Print out All Manager Employees
		for(int i=0; i<employeeList.size(); i++) {
			if(!(employeeList.get(i).EndingSummary().equals("null"))) {
				fileOutput.printf(employeeList.get(i).EndingSummary());
			}
		}
		fileOutput.println("\r\nGoodbye.");	
		//Closes fileOutPut object
		fileOutput.close();
//------------------------------------------------------------------------
		
		/**
		 * Outputs identical information onto the console
		 */
		//Prints out Header
		System.out.println("ID\tYEAR_HIRED\tTITLE\t\tBASE_SALARY\t\tCOMPENSATION");	
		//Print out all Information that was separated by commas
		for(int i=0; i<employeeList.size(); i++) {
			System.out.println(employeeList.get(i).EmployeeSummary());
			System.out.println(employeeList.get(i).toString());
		}	
		//Prints out Dividing Line
		System.out.println("----------------------------------------------\n");
		//Find and Print out All Manager Employees
		for(int i=0; i<employeeList.size(); i++) {
			if(!(employeeList.get(i).EndingSummary().equals("null"))) {
				System.out.println(employeeList.get(i).EndingSummary());
			}
		}
		System.out.println("\nGoodbye.");		
	}//Closes PrintManagerDividend Method
}//Closes MainProgram class