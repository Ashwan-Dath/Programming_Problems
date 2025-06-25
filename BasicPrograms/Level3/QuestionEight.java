package  BasicPrograms.Level3;

import java.util.Scanner;

// Incomplete

public class QuestionEight
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question :   Write program to print the following series which is shown in Given Examples.
        
        // Input         :- First Line of Input Consists of One Integer Value.
        //                  Second Line of Input Consists of One Integer Value.
        // Output        :- Print the Following Series.
        // Constraints  :- Given Inputs Must be Greater than Zero or else Print "Invalid Inputs".
        
        
        // Example:
        // Input 1  :    10, 31
        // Output 1:    10^2, 12^2, 14^2, 16^2, 18^2, 20^2, 22^2, 24^2, 26^2, 28^2, 30^2
        
        // Input 2  :    -6, 8
        // Output 2:     Invalid Inputs
        
        // Input 3  :    5, 27
        // Output 3:    5^2, 7^2, 9^2, 11^2, 13^2, 15^2, 17^2, 19^2, 21^2, 23^2, 25^2, 27^2
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingRange = scan.nextInt();
    	    int endingRange = scan.nextInt();
    	    
    	    if(startingRange<=0 || endingRange <= 0){
    	        System.out.print("Invalid Input");
    	        return;
    	    }
    	    
    	    for(  ; startingRange <= endingRange ; startingRange++ ){
    	        
    	        if(startingRange < endingRange) System.out.print( startingRange + "^2" );
    	        if(startingRange != endingRange || startingRange != (endingRange-1)) System.out.print(", " );
    	        
    	    }

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	}
}
