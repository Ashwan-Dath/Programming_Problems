package  NumberPrograms.PrimeAndFactors;

import java.util.Scanner;

// Given Number prime or not
public class QuestionEight
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write a program to check given number is prime number or not.
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Prime Number or Not a Prime Number.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        // Example:
        // Input 1  :    83
        // Output 1:    Prime Number
        
        // Input 2  :    -6
        // Output 2:     Invalid Input
        
        // Input 3  :    182
        // Output 3:    Not a Prime Number
        
        // Explanation:
        // If the Given Input is greater than Zero then check the Given Number is Prime Number or Not a Prime Number.
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();

    	    if(range <= 0 ){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    
    	    FasterLogic(range);
    	    SimpleLogic(range);
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	public static void FasterLogic(int range){
	    boolean prime = true;
	    if(range == 1) prime = false;
	    for (int i = 2 ; i * i <= range ; i++ ) {
	        if(range % i == 0){
	            prime = false;
	            break;
	        }
	    }
	    
	    System.out.println( prime ? "Prime Number" : "Not a Prime Number");

	}
	
	
	public static void SimpleLogic(int range){
	        	    
	    int prime = 0;
	    for ( int i = 1 ; i <= range ; i++ ){
            if(range % i == 0) prime++;
	    } 
	    System.out.println( prime == 2 ? "Prime Number" : "Not a Prime Number");

	}
	
}
