import java.util.Scanner;

// Create a GradeBook object and calling its displayMessage method
public class GradeBookTest 
{	
	// main method begins program execution
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// create a GradeBook object and assign it to myGradeBook
		GradeBook myGradeBook = new GradeBook();
		
		// prompt for and input course name
		System.out.println("Please enter the course name");
		String nameOfcouse = input.nextLine(); // read a line of text
		System.out.println(); 				  // outputs a blank line
				
		// call myGradeBook's displayMessage method
		myGradeBook.displayMessage();
	}
}
