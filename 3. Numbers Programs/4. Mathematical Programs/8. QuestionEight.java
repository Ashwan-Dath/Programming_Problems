import java.util.Scanner;

// Print first 'n' Numbers in the Arithmetic progression series

class QuestionEigth
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a Program to Print first 'n' Numbers by taking input of 
        //              term(a), common difference(d) and no of terms(n) in the Arithmetic progression series?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (Term (a)).
        //                      Second Line of Input Consists of One Integer Value (Common Difference (d)).
        //                      Third Line of Input Consists of One Integer Value (No of Terms (n)).
        // Output        :- Print the Arithmetic Progression Values.
        
        // Constraints  :-
        //              'a' Value is an any Integer Value.
        //              'd' Value is an any Integer Value.
        //              'n' Value is Must be Greater than zero or else Print "Invalid Input".
        
        
        // Example:
        // Input 1  :    2, 4, 8
        // Output 1:    2, 6, 10, 14, 18, 22, 26, 30.
        
        
        // Input 2  :   -11, 6, 11
        // Output 2:   -11, -5, 1, 7, 13, 19, 25, 31, 37, 43, 49.
        
        
        // Input 3  :    5, 9, -2
        // Output 3:    Invalid Input.
        
        
        // Explanation:
        // Arithmetic progression ->  a, a+d, a+2d, a+3d, ................., a+(n-1)d.
        
        
        
        
        
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
	        
	        System.out.print(a);    // Printing First Number.
	        
	        for (int i = 1 ; i < n ; i++ ){
	            a += d;
	            System.out.print(", "+a);
	        } 
	        
	        System.out.print(".");

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
