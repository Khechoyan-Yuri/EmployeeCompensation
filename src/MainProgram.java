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
	It will ask the user to enter the name of the document that
	the user wishes to import. 
	If the file does not exist, program will give the user an error and then
	terminate itself. If the file that user imports does exist, program will
	proceed to accomplish the following:	
	The list of tasks that this program is designed to do:

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

	In order for this program to work, it must read in the file. If reading in the file fails,
	the program will throw an error to the user and self-terminate.
	
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
 
 	___________________________________________________________________________________
 
	Employee 13 is a manager. Dividend is $20,000! 
 
	Good bye!



ASSUMPTIONS

- None

*/

//*******************************
//*START OF MainProgram CLASS	*
//*******************************

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MainProgram{
	public void main(String[] args){
		
		
		
	}//Closes Main method
}//Closes MainProgram class