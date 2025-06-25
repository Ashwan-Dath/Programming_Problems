package  NumberPrograms.MathematicalPrograms;

import java.util.Scanner;

// Print the nth term value in the Arithmetic progression series

public class QuestionNine
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Find and Print the term value in the Arithmetic progression series by taking input of 
        //              1st term(a), common difference(d) and term ?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (1st Term (a)).
        //                  Second Line of Input Consists of One Integer Value (Common Difference (d)).
        //                  Third Line of Input Consists of One Integer Value (No of Terms (n)).
        // Output        :- Print the term value of Arithmetic Progression Values.
        
        // Constraints  :-
        //              'a' Value is an any Integer Value.
        //              'd' Value is an any Integer Value.
        //              'n' Value is Must be Greater than zero or else Print "InValid Input".
        
        
        // Example:
        // Input 1  :    2, 4, 8
        // Output 1:    Last term value is : 30.
        
        
        // Input 2  :   -11, 6, 11
        // Output 2:  Last term value is : 49.
        
        
        // Input 3  :    5, 9, -2
        // Output 3:    InValid Input.
        
        
        
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
	        int a = scan.nextInt();    // 1st Term
	        int d = scan.nextInt();    // Common Difference
	        int n = scan.nextInt();    // No of Terms
	        
	        if( n <= 0 ){
	            System.out.print("Invalid Input");
	            return;
	        }
	        
	        System.out.printf("Last term value is : %d. " , (a + (n - 1) * d) );
	       // Arithmetic Progression Formula = a + (n – 1) × d

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
