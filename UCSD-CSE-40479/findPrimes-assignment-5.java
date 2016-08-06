/*
 * FindPrimes.java
 * a) Write a method that determines whether a number is prime.
 * 
 * b) Use this method in an application that determines and 
 * displays all the prime numbers less than 10,000. 
 * How many numbers up to 10,000 do you have to test to ensure that you’ve found all the primes?
 * 
 * c) Initially, you might think that n/2 is the upper limit for which you must test to see
 * whether a number n is prime, but you need only go as high as the square root of n. 
 * Re- write the program, and run it both ways.
 */

/**
 *
 * @author ThyKhueLy
 */
public class FindPrimes {
       
    public static void main(String[] args) {
        System.out.println("Prime numbers < 10k:");

        // loop 10000 times and check every number for primeness using isPrime method
        for ( int n = 2 ; n <= 10000 ; n++ ) {
    	 if ( isPrime(n) )
    	        System.out.println(n);
     } // end for loop
    } // end main method
    
    public static boolean isPrime(int num) {
    	if ( num <= 1 ) // negative number, zero and one are by definition, non-prime
    		return false;
    	else {
	    	int upper_limit = (int) (Math.sqrt(num) + 1); // initialize the upper limit as the square root of the number
	    	for ( int i = 2; i < upper_limit; i++ ) { // loop over all the numbers up until the square root of n
	    	if ( num % i == 0 ) // the number is not prime if it is evenly divisible by any other number
	    		return false;   
	    	}	// end for loop
    	return true; 
    	}
    } // end method isPrime
} // end class FindPrimes
