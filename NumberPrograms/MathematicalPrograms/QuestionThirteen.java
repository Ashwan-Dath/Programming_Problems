package  NumberPrograms.MathematicalPrograms;

import java.util.Scanner;

// sum of the first 'n' terms in the geometric progression series

public class QuestionThirteen
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a Program to Print sum of the first 'n' terms by taking input of 1st term(a), common difference(d) and No of terms(n) in the Harmonic progression series? 
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (1st Term (a)).
        //                      Second Line of Input Consists of One Integer Value (Common Difference (d)).
        //                      Third Line of Input Consists of One Integer Value (No of Terms (n)).
        // Output        :- Print the sum of the Harmonic Progression Values.
        
        // Constraints  :-
        //              'a' Value is an any Integer Value.
        //              'd' Value is an any Integer Value.
        //              'n' Value is Must be Greater than zero or else Print "Invalid Input.".
        
        
        // Example:
        // Input 1 :   1, 1, 6
        // Output 1 : 2.45
        
        // Input 2 :   6, -1, 5
        // Output 2 : 1.45
        
        // Input 3 :   7, 2, -5
        // Output 3 : Invalid Input
        
        
        // Explanation:
        // First add the values and print the sum value in ".2f" format        
        
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
	        
	        float sum = 0;
	        
	        for (int i = 0 ; i < n ; i++ ){
	            float result =(float)1/(a+i*d);
	            sum+=result;
	        } 
	        
	        System.out.printf("%.2f",sum);

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
