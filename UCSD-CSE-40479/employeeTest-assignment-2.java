/*
 * EmployeeTest.java
 */

/**
 *
 * @author ThyKhueLy
 */
public class EmployeeTest {
    
    public static void main(String args[]){
        // Create two Employee objects
    	//	 Employee #1: Benjamin Bernanke has a monthly salary of 1234.56
    	//   Employee #2: Paul Volcker has a monthly salary of 2345.67
        Employee employee1 = new Employee("Benjamin", "Bernanke", 1234.56);
        Employee employee2 = new Employee("Paul", "Volcker", 2345.67);
    
    	
        // Display the employees' info (including yearly salary)
        System.out.printf( "%s %s's yearly salary: %f\n", 
        		employee1.getFirstName(), employee1.getLastName(), employee1.yearlySalary() );
        
        System.out.printf( "%s %s's yearly salary: %f\n", 
        		employee2.getFirstName(), employee2.getLastName(), employee2.yearlySalary() );


        System.out.println("Giving raises...");
        // Give each employee a 10% raises.
    	// Be sure to actually apply the raise to the Employee objects: don't just calculate and display a 10% greater salary within this test code 
        employee1.salaryRaise();
        employee2.salaryRaise(); 
        
        // Display the employees' info (including yearly salary)
        System.out.printf( "%s %s's yearly salary: %f\n", 
        		employee1.getFirstName(), employee1.getLastName(), employee1.yearlySalary() );
        
        System.out.printf( "%s %s's yearly salary: %f\n", 
        		employee2.getFirstName(), employee2.getLastName(), employee2.yearlySalary() );

        System.out.println("Attempting to set a negative salary value...");
        // Attempt to set Bernanke's salary to a negative value...
        employee1.setMonthlySalary(-1234.56);
        // Display Bernanke's info (including yearly salary)
        System.out.printf( "%s %s's yearly salary: %f\n", 
        		employee1.getFirstName(), employee1.getLastName(), employee1.yearlySalary() );

    }
    
}
