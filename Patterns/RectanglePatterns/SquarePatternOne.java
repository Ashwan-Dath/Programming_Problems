package  Patterns.RectanglePatterns;

import java.util.Scanner;

public class SquarePatternOne
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Description  :  Write a Program to Print the following Basic Pattern?
        
        // If Input is 5 then Print 
        
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows & Columns ).
        // Output        :- Print the Square Pattern.
        // Constraints  :- Given Input Must be Greater than Zero.
        
        
        // Example:
        // Input 1  :    5
        // Output 1: 
        
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        
         
        
        // Input 2  :    3
        // Output 2: 
        
        // * * *
        // * * *
        // * * *
        
        
        // Explanation:
        // Print a Square Pattern by taking One Integer Input
        

        Answer();
	}
	
	public static void Answer(){
	    
	    int row = scan.nextInt();   // Row and column both are Same 

	    if(row <= 0 ){
	        System.out.print("Invalid Input.");
	        return;
	    }
	    
	    for ( int i = 1 ; i <= row ; i++ ){
	        
	        for( int j = 1 ; j <= row ; j++ ){
	            System.out.print("* ");
	        } 
	        
	        System.out.println();
	    } 
	    
	}
	
}
