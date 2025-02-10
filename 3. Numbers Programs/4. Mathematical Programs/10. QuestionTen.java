import java.util.Scanner;

// Print sum of the first 'n' terms in the Geometric progression series

class QuestionTen
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a Program to Print sum of the first 'n' terms by taking input of 1st term(a), 
        //              common ratio(r) and No of terms(n) in the Geometric progression series? 
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (1st Term (a)).
        //                  Second Line of Input Consists of One Integer Value (Common Ratio (r)).
        //                  Third Line of Input Consists of One Integer Value (No of Terms (n)).
        // Output        :- Print Sum of the Geometric Progression Values.
        
        // Constraints  :-
        //              'a' Value is an any Integer Value.
        //              'r' Value is an any Integer Value.
        //              'n' Value is Must be Greater than zero or else Print "Invalid Input".
        
        
        // Example:
        // Input 1  :    2, 4, 8
        // Output 1:    43690
        
         
        
        // Input 2  :   -11, -2, 11
        // Output 2:   -7513
        
         
        
        // Input 3  :    5, 9, -2
        // Output 3:    Invalid Input
        
        
        
        
        
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
	        int sum = 0;
	        for ( int i =1; i<=n ; i++ ){
	            sum +=a;
	            a *= d;
	        } 
	        
	        System.out.print(sum);
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
