package Programming_Problems.BasicPrograms.Level3;

import java.util.Scanner;

public class QuestionFive
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
    //      Question :  Write program to print the following series which is shown in Given Examples.
    //      Input    :- First Line of Input Consists of One Integer Value.
    //                  Second Line of Input Consists of One Integer Value.
        
    //     Output        :- Print the Following Series.
        
    //     Constraints  :- No 
        
    //     Example:
    //     Input 1  :    10, -12
    //     Output 1 :   50, 45, 40, 35, 30, 25, 20, 15, 10, 5, 0, (-5), (-10), (-15), (-20), (-25), (-30), (-35), (-40), (-45), (-50), (-55), (-60)
        
    //     Input 2  :   -6, 8
    //     Output 2 :   (-30), (-25), (-20), (-15), (-10), (-5), 0, 5, 10, 15, 20, 25, 30, 35, 40
        
    //     Explanation:
    //     print the multiple of 5 from the given range of numbers.

        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingRange = scan.nextInt();
    	    int endingRange = scan.nextInt();
    	    
    	    
            // Calculate the direction of the loop (forward or backward) 
            int step = (startingRange < endingRange) ? 1 : -1;  
            // Why only storing 1 or -1 is for making the loop to iterate forward(++) or backward(--)
            
            // A single for loop to handle both cases 
            for (int i = startingRange; (step == 1) ? i <= endingRange : i >= endingRange; i += step) {
                
                System.out.print( (i < 0 ? "(" + (5 * i) + ")" : (5 * i))   +   (i != endingRange ? ", " : "") );
                //                              |                                           |
                // Print the value of i * 5, handling negative numbers with parentheses     |
                //                                                                          |
                //                                             Print a comma and space unless it's the last number

            }



            // This is even more simpler if you dont understand the above one.
            
            
    	   // if(startingRange<endingRange){  // If we have startingRange less than ending range we have make a forward loop (startingRange++)
    	        
        // 	    for ( ; startingRange <= endingRange ; startingRange++){
        // 	        System.out.print( startingRange<0 ? "("+(5*startingRange)+")" : (5*startingRange) );
        // 	        // This condition is to add the brackets for the negative numbers
        	        
        // 	        System.out.print( startingRange!=endingRange ? ", ": "");
        // 	        // This condition is to add ", " for all the numbers except the last on
        // 	    } 
        	    
    	   // }else{  // if the startingRange is greater than ending range we have to make a backward loop (startingRange--)
    	   //     for ( ; startingRange >= endingRange ; startingRange--){
        // 	        System.out.print( startingRange<0 ? "("+(5*startingRange)+")" : (5*startingRange) );
        // 	        // This condition is to add the brackets for the negative numbers
        	        
        // 	        System.out.print( startingRange!=endingRange ? ", ": "");
        // 	        // This condition is to add ", " for all the numbers except the last on
        // 	    }
    	   // }
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
