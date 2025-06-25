package  NumberPrograms.PrimeAndFactors;

import java.util.Scanner;

// Find given numbers is prime or not
public class QuestionTwo
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question :  Write a Program to Print the Given Number is Prime or not without using count?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Prime Number or Not a Prime Number.
        // Constraints  :- Given Input Must be Greater than Zero or else Print "Invalid Input".
        
        
        // Example:
        // Input 1  :    83
        // Output 1:    Prime Number
        
        
        // Input 2  :    -6
        // Output 2:     Invalid Input
        
        // Input 3  :    182        
        // Output 3:    Not a Prime Number
        
        
        // Explanation:
        // NA
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();
    	    
    	    if(range <= 0){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    
    	    // Uncomment any of the method to see the code working
    	   // SimpleLogic(range);
    	    
    	    FasterLogic(range);
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
	
	
	public static void FasterLogic(int range){
	    
	    boolean b = true;
	    if(range == 1) b = false;
	    for ( int i = 2 ; i < Math.sqrt(range) ; i++ ){
	       //                   |
	       //                   |
	       // Reducing the loop to make the 
	        if( range % i == 0) b = false;    
	        
	    }
	    
	    System.out.print( b ? "Prime Number" : "Not a Prime Number");
	    
	}
	
	
	public static void SimpleLogic(int range){
    	    
    	    int count = 0;
    	    for ( int i = 1; i <= range ; i++ ){
    	        if(range % i == 0) count++;
    	        //     |
    	       //  This condition is there to check whether out range is divisible by the number from 1 to range
    	    } 
    	    
    	    System.out.print(count == 2 ? "Prime Number" : "Not a Prime Number");
    	   //                   |
    	   // This condition is taken only 1 and number are the factors for a prime number so if the 
    	   // count == 2 then that number is a prime number or else not a prime number.
    	   
	}
}
