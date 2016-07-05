/*
 * Employee.java
 */

/**
 *
 * @author ThyKhueLy
 */
public class Employee {
	
    // create three instance variables that stores employees' names and salaries 
	private String firstName, lastName;
	private double monthlySalary;
	
	// constructor initializes instance variables ' values
	public Employee (String fName, String lName, double salary) {
		firstName = fName; 
		lastName = lName;
		if (salary > 0.0)
			monthlySalary = salary; 
	} // end constructor
	
	// method to set employees' names and salaries 
	public void setFirstName(String name) { 
		firstName = name; 
	}
	public void setLastName(String name) { 
		lastName = name; 
	}
	public void setMonthlySalary(double salary) { 
		if (salary > 0.0) 
		monthlySalary = salary; 
	}	
	
	//  method to retrieve employees' names and salaries 
	public String getFirstName() {
		return firstName; 
	}
	public String getLastName() {
		return lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
		
	// apply 10% raises to employees' salaries
	public void salaryRaise() {
		monthlySalary = monthlySalary * 1.1;
	} 			
	
	// method to calculate yearly salary
	public double yearlySalary() {
		double yearlySalary;
		yearlySalary = monthlySalary * 12;
		return yearlySalary;
	}

	
	// Name your member variables as follows: firstName, lastName and monthlySalary
    
	// Implement a three-parameter constructor that takes, in order: the first name, last name and monthly salary

	// Your accessor methods should be named following the pattern getVariableName. e.g.: getFirstName
	// Your mutator methods should be named following the pattern setVariableName. e.g.: setFirstName
    
}
