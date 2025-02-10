import java.util.Scanner;

// Print first 'n' Numbers by taking input of 1st term(a), common Ratio(r) and No of terms(n) in the geometric progression series

class QuestionSix
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a Program to Print first 'n' Numbers by taking input of 1st term(a), common Ratio(r) and No of terms(n) in the geometric progression series ?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (1st Term (a)).
        //                  Second Line of Input Consists of One Integer Value (Common Ratio (r)).
        //                  Third Line of Input Consists of One Integer Value (No of Terms (n)).
        // Output        :- Print the Geometric Progression Values.
        
        // Constraints  :-
        //              'a' Value is an any Integer Value.
        //              'r' Value is an any Integer Value.
        //              'n' Value is Must be Greater than zero or else Print "Invalid Input".
        
        
        // Example:
        // Input 1  :    2, 4, 8
        // Output 1:    2, 8, 32, 128, 512, 2048, 8192, 32768.
        
        
        // Input 2  :   -11, -2, 11
        // Output 2:   -11, 22, -44, 88, -176, 352, -704, 1408, -2816, 5632, -11264.
        
        
        // Input 3  :    5, 9, -2
        // Output 3:    Invalid Input.
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
	        int a = scan.nextInt();    // 1st Term
	        int r = scan.nextInt();    // Common Ratio
	        int n = scan.nextInt();    // No of Terms
	        
	        if( n <= 0 ){
	            System.out.print("Invalid Input");
	            return;
	        }
	        
	        System.out.print(a);
	        for (int i = 1; i < n ; i++ ){
	            a*=r;
	            System.out.print(", "+a);
	        } 
	        System.out.print(".");
	        

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
