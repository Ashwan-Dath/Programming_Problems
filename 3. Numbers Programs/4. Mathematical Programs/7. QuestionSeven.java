import java.util.Scanner;

// nth term value in the geometric progression series

class QuestionSeven
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Find the nth term value in the geometric progression series by taking input of 1st term(a), common Ratio(r) and nth term ?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (1st Term (a)).
        //                      Second Line of Input Consists of One Integer Value (Common Ratio (r)).
        //                      Third Line of Input Consists of One Integer Value (No of Terms (n)).
        // Output        :- Print the nth term value of Geomentric Progression Values.
        
        // Constraints  :-
        //              'a' Value is an any Integer Value.
        //              'r' Value is an any Integer Value.
        //              'n' Value is Must be Greater than zero or else Print "InValid Input".
        
        
        // Example:
        // Input 1  :    2, 4, 8
        // Output 1:    Last term value is : 32768.
        
        
        // Input 2  :   -11, 6, 7
        // Output 2:  Last term value is : -513216.
        
        
        // Input 3  :    5, 9, -2
        // Output 3:    InValid Input.
        
        
        
        
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
	        
	        System.out.print("Last term value is : "+((int)(a*Math.pow(r,(n-1)))));
	       //  Getting the last value through the fomula
           //  Geometric  Progression Formula for Last Value.


	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
