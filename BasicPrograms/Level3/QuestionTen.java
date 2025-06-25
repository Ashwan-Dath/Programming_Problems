package Programming_Problems.BasicPrograms.Level3;

import java.util.Scanner;

public class QuestionTen
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write program to print the following series which is shown in Given Examples.
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Following Series.
        // Constraints  :- No 
        
        
        // Example:
        // Input 1  :    25
        // Output 1:     1, 3, divisible by five, 7, 9, 11, 13, divisible by five, 17, 19, 21, 23, divisible by five
        
        // Input 2  :    38
        // Output 2:    1, 3, divisible by five, 7, 9, 11, 13, divisible by five, 17, 19, 21, 23, divisible by five, 27, 29, 31, 33, divisible by five, 37
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();
    	    
    	    int count = 0;  // Taking count for ',' logic
    	    
    	    for ( int i = 1; i<= range ; i++ ){
    	       if(i%2==1){ // Only allowing the Odd numbers inside to print
    	           System.out.print( i % 5 == 0 ? "divisible by five" : i);
    	           if( i != range ){
    	               System.out.print(", ");
    	           } 
    	       } 
    	    } 

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
