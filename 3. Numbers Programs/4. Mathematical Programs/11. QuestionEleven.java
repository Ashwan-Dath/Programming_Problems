import java.util.Scanner;

// Print first 'n' Numbers in the Harmonic progression series

class QuestionEleven
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        
        
        // Question : Write a Program to Print first 'n' Numbers by taking input of 1st term(a), 
        //              common difference(d) and no of terms(n) in the Harmonic progression series?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (1st Term (a)).
        //                      Second Line of Input Consists of One Integer Value (Common Difference (d)).
        //                      Third Line of Input Consists of One Integer Value (No of Terms (n)).
        // Output        :- Print the Harmonic Progression Values.
        
        // Constraints  :-
        //                      'a' Value is an any Integer Value.
        //                      'd' Value is an any Integer Value.
        //                      'n' Value is Must be Greater than zero or else Print "Invalid Input".
        
        
        // Example:
        // Input 1 :   1, 1, 6
        // Output 1 : 1.00, 0.50, 0.33, 0.25, 0.20, 0.17
        
         
        
        // Input 2 :   6, -1, 6
        // Output 2 : 0.16, 0.20, 0.25, 0.33, 0.50, 1.00
        
         
        
        // Input 3 :   7, 2, -5
        // Output 3 : Invalid Input
        
        
        // Explanation:
        // Harmonic series is inverse of a arithmetic progression.
        
        // In general, the terms in a harmonic progression can be denoted as 1/a, 1/(a + d), 1/(a + 2d), 1/(a + 3d) …. 1/(a + nd).
        // As Nth term of AP is given as ( a + (n – 1)d).
        
        // Hence, Nth term of harmonic progression is reciprocal of Nth term of AP, which is 1/(a + (n – 1)d), where “a” is the 1st term of AP and “d” is a common difference.
        
        

        
        
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
	        
	        float result = (float) 1 / a;
        
            // Multiply by 100, apply Math.floor(), then divide by 100 to round down to two decimal places
            double roundedDown = Math.floor( result * 100 ) / 100;
            
            // Print the result with two decimal places
            System.out.printf("%.2f", roundedDown);

	        for (int i = 1; i < n ; i++ ){
	            float temp = (float)1 / (a + i * d);
	            System.out.printf(", %.2f", temp);
	        }
	        
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
