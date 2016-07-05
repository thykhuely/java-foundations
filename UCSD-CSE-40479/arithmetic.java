import java.util.Scanner;
public class Arithmetic_Extreme_Values {
	/* Calculate and display sum, avg, product, smallest and largest of 
		3 numbers input by user */
	
		@SuppressWarnings("resource")
		public static void main( String[] args) {
			// create Scanner to obtain input from command window
			Scanner input = new Scanner( System.in );
			
			int x; 
			int y; 
			int z;
			int sum, average, product;
			int largest;
			
			System.out.print("Enter first integer: ");
			x = input.nextInt(); 
			
			System.out.print("Enter second integer: ");
			y = input.nextInt();
			
			System.out.print("Enter third integer: ");
			z = input.nextInt(); 
			
			sum = x + y + z;
			average = sum / 3;
			product = x * y * z; 
			largest = maximum (x, y, z);
			
			System.out.printf("Sum is %d\n", sum);
			System.out.printf("Average is %d\n", average);
			System.out.printf("Product is %d\n", product);
			System.out.printf("Maximum value is %d\n", largest);
			
		} // end main

		public static int maximum (int n1, int n2, int n3) {
			// assume x is the largest value
			// keyword static enables the main method to call maximum without qualifying 
			// the method name with the class name Arithmetic_Extreme_Values
			int largest = n1; 
			
			if (n2 > largest)
				largest = n2;
			if (n3 > largest)
				largest = n3; 
			return largest;
			
		} // end method maximum
			
			
}
