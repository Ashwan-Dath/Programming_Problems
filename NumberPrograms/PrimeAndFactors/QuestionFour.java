package  NumberPrograms.PrimeAndFactors;

import java.util.Scanner;

// Sum of 'N' Natural Numbers
public class QuestionFour
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write a program to find Sum of first 'n' Natural Numbers Without Using formula?
        
        
        // Constraints:
        // Input       :- First Line of Input Consists of One Integer Value.
        // Output      :- Print Sum of first 'N' Natural Numbers.
        // Constraints :- Given Input is Zero then Print "InvaLid Input.".
        //              If Given Input is Negative then Print "Sorry! you have Entered Negative Values.".
        
        
        // Example:
        // Input 1  :    10
        // Output 1:    Sum of 'N' Natural Numbers is 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55.
        
        // Input 2  :   5
        // Output 2:   Sum of 'N' Natural Numbers is 1 + 2 + 3 + 4 + 5 = 15.
        
        // Input 3  :    8
        // Output 3:    Sum of 'N' Natural Numbers is 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36.
        
        
        // Explanation:
        // Input 1  :    10
        // Output 1:    Sum of 'N' Natural Numbers is 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55.
        
        // Explanation:
        // First 'N' Numbers is 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // Sum of First 'N' Numbers is 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
        
        // Input 2  :   5
        // Output 2:   Sum of 'N' Natural Numbers is 1 + 2 + 3 + 4 + 5 = 15.
        // Explanation:
        // First 'N' Numbers is 1, 2, 3, 4, 5
        // Sum of 'N' Natural Numbers is 1 + 2 + 3 + 4 + 5 = 15.
        
        // Input 3  :    8
        // Output 3:    Sum of 'N' Natural Numbers is 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36.
        // Explanation:
        // First 'N' Numbers is 1, 2, 3, 4, 5, 6, 7, 8
        // Sum of 'N' Natural Numbers is 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36.
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();

    	    if(range == 0){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    
    	    if(range < 0){
    	        System.out.print("Sorry! you have Entered Negative Values.");
    	        return;
    	    } 
    	    
    	    int sum = 0;     // To store the sum of the Values
    	    
    	    for ( int i = 1 ; i <= range ; i++ ){
    	        System.out.print( i == 1 ? "Sum of 'N' Natural Numbers is 1" : " + "+i );
    	        sum += i;
    	    }
    	    System.out.print(" = "+sum+".");

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
