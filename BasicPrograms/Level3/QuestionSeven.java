package  BasicPrograms.Level3;

import java.util.Scanner;

public class QuestionSeven
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question :   Write program to print the following series which is shown in Given Examples.
        
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Following Series.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        
        // Example:
        // Input 1  :    10
        // Output 1:    5, 10, 5, 10, 5, 10, 5, 10, 5, 10
        
         
        
        // Input 2  :    -6
        // Output 2:     Invalid Input
        
        
        // Input 3  :    5
        // Output 3:    5, 10, 5, 10, 5
        
        // Explanation:
        // Print 5 and 10 Alternatively        

        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();
    	    if(range<=0){
    	        System.out.print("Invalid Input");
    	        return;
    	    }
    	    for (int i =1 ;i<=range ;i++ ){
    	        System.out.print( ( i % 2 == 0 ? "10" : "5" ) + ( i != range ? ", " : "") );
    	        //                     |                            |
    	        // checking even/odd logic to print 10 and 5        |
    	       //                                                   |
    	       // Printing ", " for the numbers except the last digit.
    	    } 
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
