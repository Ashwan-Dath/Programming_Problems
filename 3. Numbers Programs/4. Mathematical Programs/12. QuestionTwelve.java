import java.util.Scanner;

// nth term value in the geometric progression series

class QuestionTwelve
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Find the nth term value in the Harmonic progression series by taking input of 1st term(a),
        //              common difference(d) and nth term ?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (1st Term (a)).
        //                  Second Line of Input Consists of One Integer Value (Common Difference (d)).
        //                  Third Line of Input Consists of One Integer Value (No of Terms (n)).
        // Output        :- Print the nth term value of Harmonic Progression Values.
        
        // Constraints  :-
        //              'a' Value is an any Integer Value.
        //              'd' Value is an any Integer Value.
        //              'n' Value is Must be Greater than zero or else Print "InvaliD InPut".
        
        
        // Example:
        // Input 1 :   1, 1, 6
        // Output 1 : 0.17
        
        
        // Input 2 :   6, -1, 6
        // Output 2 : 1.00
        
        
        // Input 3 :   7, 2, -5
        // Output 3 : InvaliD InPut
        
        
        // Explanation:
        // NA        
        
        
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
	        
	        float result =(float)1/(a+(n-1)*d);
	       //  Using the Formula getting the last Term in Harmonic Progression : 1 / a + (n-1)* d
	       
	        System.out.printf("%.2f",result);

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
