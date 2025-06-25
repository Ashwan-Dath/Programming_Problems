package  NumberPrograms.PrimeAndFactors;

import java.util.Scanner;

// Sum of the prime numbers in a range
public class QuestionThree
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write a program to find Sum of all Prime Numbers between the Given Values.
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Minimum Value ) .
        //                   Second Line of Input Consists of One Integer Value ( Maximum Value ) .
        // Output        :- Print All the Prime Number Between the Given Values.
        // Constraints  :- Given Inputs Must be Greater than Zero or else Print Invalid Inputs.
        
        
        // Example:
        // Input 1  :    25, 100
        // Output 1:    60
        
        // Input 2  :    -10, -90
        // Output 2:     Invalid Inputs
        
        // Input 3  :    19, 61
        // Output 3:    40.333
        
        // Explanation:
        // Input 1  :    25, 100
        // Output 1:    960
        
        // Explanation:
        // Prime Numbers :   29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        // sum = 29 + 31 + 37 + 41 + 43 + 47 + 53 + 59 + 61 + 67 + 71 + 73 + 79 + 83 + 89 + 97
        //       = 960
        
        // Input 2  :    -10,   -90
        // Output 2:     Invalid Inputs
        
        // Explanation:
        
        // Given Numbers are not a Positive Numbers
        
        // Input 3  :    19, 61
        // Output 3:    363
        
        // Explanation:
        // Prime Numbers:  23, 29, 31, 37, 41, 43, 47, 53, 59
        // sum = 23 + 29 + 31 + 37 + 41 + 43 + 47 + 53 + 59 
        //       =  363 

        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingrange = scan.nextInt();
    	    int endingrange = scan.nextInt();
    	    
    	    if(startingrange <= 0 || endingrange <= 0){
    	        System.out.print("Invalid Inputs");
    	        return;
    	    } 
    	    
    	    // Go through this for simpler logic 
    	    SimpleLogic(startingrange, endingrange);
    	    
    	    // Go through this for faster and complex logic
    	    // FasterLogic(startingrange, endingrange);    // uncomment this to get the faster answer
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	public static void SimpleLogic(int startingrange, int endingrange){
	    
    	    int sum = 0;     // To store the sum of the prime Numbers
    	    
    	    for( int i = startingrange+1 ; i < endingrange ; i++ ){
    	        
    	        int count = 0;
    	        
    	        for(int j = 1 ; j <= i ; j++ ){
    	            if( i % j == 0 ) count++;
    	        }
    	        
    	        if( count == 2 ) sum+=i;
    	        
    	    }
    	    
    	    System.out.print(sum);
	}
	
	public static void FasterLogic(int startingrange, int endingrange){
	    
	    int sum = 0; // To store the sum of the prime numbers
        
        // Loop through the numbers between startingrange and endingrange
        for (int i = startingrange + 1; i < endingrange; i++) {
            
            // Check if the number is prime
            boolean isPrime = true;
            
            if (i == 1) {
                isPrime = false;
            } else {
                
                // Cutting down the for loop into half to get the prime numbers more faster
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    
                }
                
            }
            
            // If the number is prime, add it to the sum
            if (isPrime) {
                sum += i;
            }
            
        }
        
        // Print the result
        System.out.print(sum);
	}
	
	
}
