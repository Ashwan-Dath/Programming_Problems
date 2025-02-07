import java.util.Scanner;

// print the Power of a Number.
class QuestionSeven 
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {

        // Question : Write a program to Calculate Power of a Number. (Without using Pre Defined Method)
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Base Value ).
        //                  Second Line of Input Consists of One Integer Value ( Exponent Value ).
        // Output        :- Print the Power Value.
        // Constraints  :- Given Inputs is Must be Greater than Zero or else Print Invalid Inputs.
        
        
        // Example:
        // Input 1  :    2, 5
        // Output 1:    2 Power 5 value is 32.
        // Explanation : 
        //  = 2 * 2 * 2 * 2 * 2 = 32
        
        
        
        // Input 2  :   6, 3
        // Output 2:    6 Power 3 value is 216.
        // Explanation : 
        // = 6 * 6 * 6 = 216
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
	        int startingRange = scan.nextInt();
	        int endingRange = scan.nextInt();
	        
	        if(startingRange <= 0 || endingRange <= 0){
	            System.out.print("Invalid Inputs");
	            return;
	        }
	        
	        int value = 1;
	        
	        for (int i = 1; i <= endingRange ; i++ ){
	            value *= startingRange;
	        } 
	        System.out.print(startingRange+" Power "+endingRange+" value is "+value+".");
	        
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
}
