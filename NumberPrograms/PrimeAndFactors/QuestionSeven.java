package  NumberPrograms.PrimeAndFactors;

import java.util.Scanner;

// Avg of Alternative Prime numbers

public class QuestionSeven
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write a program to find Average of all Alternative Prime Numbers between Given Values.
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        //                  Second Line of Input Consists of One Integer Value.
        // Output        :- Print Average of all Alternative Prime Numbers Between the Given Values.
        // Constraints  :- Given Inputs Must be Greater than Zero or else Print Invalid Inputs.
        //                If no Primes Numbers are identified in Between the Given Values then Print No Prime Numbers.
        
        // Example:
        // Input 1  :    25, 100
        // Output 1:    57.750
        // Explanation :
        // Prime Numbers : 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
        // Alternative Prime Numbers : 29, 37, 43, 53, 61, 71, 79, 89
        // Sum of Alternative Prime Numbers : 29 + 37 + 43 + 53 + 61 + 71 + 79 + 89 = 462
        // Average of Alternative Prime Numbers : 462 /8 =57.750
        
        
        // Input 2  :    -23, -133
        // Output 2:     Invalid Inputs
        // Explanation :
        // Given Numbers are not a Positive Numbers

        
        // Input 3  :    61, 19 
        // Output 3:    40.200
        // Explanation :
        // Prime Numbers : 23, 29, 31, 37, 41, 43, 47, 53, 59
        // Alternative Prime Numbers : 23, 31, 41, 47, 59
        // Sum of Alternative Prime Numbers : 23 + 31 + 41 + 47 + 59 = 201
        // Average of Alternative Prime Numbers : 201 / 5 = 40.200

        
        // Input 4  :    90, 97
        // Output 4:    No Prime Numbers
        // Explanation :
        // Prime Numbers : No Prime Numbers between the Given Numbers
        // Alternative Prime Numbers : No Alternative Prime Numbers between the Given Numbers So Printing No Prime Numbers.

        
        
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
    	    
    	    if(startingrange > endingrange){ 
    	        Processing(endingrange, startingrange);
    	    }else{
    	        Processing(startingrange, endingrange);
    	    }
    	    
    	   // FasterLogic(startingrange, endingrange);

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
	
	public static void FasterLogic(int startingrange, int endingrange){
	    
	    int step = startingrange < endingrange ? 1 : -1;
	    int Alternative = 0;
	    int count = 0;
	    int sum = 0;
	    for ( int i = startingrange + step ; step == 1 ? i < endingrange : i > endingrange  ; i += step ){
	        
	        if(i == 1) continue;
	        
	        boolean prime = true;
	        
	        for ( int j = 2 ; j * j <= i ; j++ ){
	            if( i % j == 0 ) prime = false;
	        }
	        if(prime){
	            Alternative++;
	            if(Alternative % 2 == 1){
	                count++;
	                sum+=i;
	            }
	        } 
	        
	    } 
	    System.out.printf( Alternative == 0 ? "No Prime Numbers" : "%.3f",((float)sum/count));
	   // System.out.println();
	}
	
	
	public static void Processing(int startingrange, int endingrange){
		int Alternative = 0;    // To store the alternative of the Numbers
		int sum = 0;            // Sum of the prime Numbers
		int count = 0;          // No.of prime numbers
		for ( int i = startingrange + 1 ; i < endingrange ; i++ ){
			int prime = 0;
			for ( int j = 1 ; j <= i ; j++ ){
					if( i % j == 0) prime++;
			} 
			
			if(prime == 2){
				Alternative++;
				if(Alternative % 2 == 1){
					count++;
					sum += i;
				}
			}
		} 
		if(Alternative == 0){
			System.out.print("No Prime Numbers");
			return;
		}
		System.out.printf("%.3f",( (float)sum/count ));
	}
}
