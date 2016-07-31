/*
 * CommissionCalculator.java
 */

/**
 *
 * @author ThyKhueLy
 */

import java.util.Scanner; // class uses class Scanner
public class CommissionCalculator {
    
    public static void main(String args[]) {
        // Initialize a Scanner to read input from the command line
    	Scanner input = new Scanner (System.in);
    	
    	double compensation; // total compensation
    	int item; // item number sold entered by user
    	
    	// initialization phase 
    	compensation = 200.00; // initialize weekly base compensation
    	
    	/* Note that we'll be doing this at least once and most likely multiple times...
    	 * Prompt the user with a menu of the four items and their values (this information is included in the problem statement)
    	 */
    	
    	System.out.println("Item\tValue");
        System.out.println("1\t$239.99");
        System.out.println("2\t$129.75");
        System.out.println("3\t$99.95");
        System.out.println("4\t$350.89"); 
    	
        // display the user's current compensation
        System.out.printf("Current compensation: $%.2f\n", compensation);

        // prompt for input and read item number or 0 to exit
        System.out.print("Please select an item from the list above (or enter 0 to exit): ");
        item = input.nextInt();
       
        // loop until sentinel value read from user's input,  
        while (item != 0) {
        	// adding 9% of item sales to compensation
        	if (item == 1) 
        		compensation += 239.99 * 0.09;
        	else if (item == 2)
        		compensation += 129.75 * 0.09;
        	else if (item == 3)
        		compensation += 99.95 * 0.09;
        	else if (item == 4)
        		compensation += 350.89 * 0.09;
        	else // if user provides an invalid input (a value other than 0 - 4)
        		System.out.println("ERROR: Invalid input!");
            
        	System.out.println("Item\tValue");
            System.out.println("1\t$239.99");
            System.out.println("2\t$129.75");
            System.out.println("3\t$99.95");
            System.out.println("4\t$350.89");

            // calculate resulting compensation after the item is sold
        	System.out.printf("Current compensation: $%.2f\n", compensation);

           // prompt for the next input  
            System.out.print("Please select an item from the list above (or enter 0 to exit): ");
            item = input.nextInt();
            
        } // end while

 
    	/* After the user enters 0, display the salesperson's earnings in the format "Total earnings: $NNN.NN" and exit
    	 * For example, if the salesperson sold two item 3s this week the final output would be "Total earnings: $217.99"
    	 */
        
        // termination phase
        System.out.printf("Total earnings: $%.2f", compensation);
    } // end main method
    
} // end class CommissionCalculator

