package Programming_Problems.BasicPrograms.Level3;

import java.util.Scanner;

public class QuestionTwo
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        // Question :   Write program to print the following series which is shown in Given Examples.
        
        // Constraints  :   NO 
        // Input    :-  First Line of Input Consists of One Integer Value.
        //              Second Line of Input Consists of One Integer Value.
        
        // Output   :- Print the Following Series.
        
        // Example:
        // Input 1  :    10, -12
        // Output 1:    
        // 5*10, 5*9, 5*8, 5*7, 5*6, 5*5, 5*4, 5*3, 5*2, 5*1, 5*0, 5*(-1), 5*(-2), 5*(-3), 5*(-4), 5*(-5), 5*(-6), 5*(-7), 5*(-8), 5*(-9), 5*(-10), 5*(-11), 5*(-12)
        
        // Input 2  :    -6, 8
        // Output 2:     5*(-6), 5*(-5), 5*(-4), 5*(-3), 5*(-2), 5*(-1), 5*0, 5*1, 5*2, 5*3, 5*4, 5*5, 5*6, 5*7, 5*8
        
        // Input 3  :    5, 8
        // Output 3:    5*5, 5*6, 5*7, 5*8
        
        
        // Explanation:
        // The ginen inputs are the range starting to ending we have to print in a pattern 
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingRange = scan.nextInt();
    	    int endingRange = scan.nextInt();
    	    
    	    for ( ; startingRange <= endingRange ; startingRange++ ){
    	        
    	       System.out.print("5*");
    	       if(startingRange<0)  System.out.print("(");
    	       System.out.print(startingRange);
    	       if(startingRange<0)  System.out.print(")");
    	       if(startingRange != endingRange)   System.out.print(", ");
    	        
    	    } 
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
