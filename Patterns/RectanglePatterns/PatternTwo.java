package  Patterns.RectanglePatterns;

import java.util.Scanner;

public class PatternTwo
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a Program to Print the following Basic Pattern?
        
        // If Input is 5 and 6 then Print 
        
        // * * * * * *
        // * $ $ $ $ *
        // * $ $ $ $ *
        // * $ $ $ $ *
        // * * * * * *
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of Two Integer Values ( Rows & Columns ).
        // Output        :- Print the Given Pattern.
        // Constraints  :- Given Inputs Must be Greater than Zero or else Print Invalid Inputs.
        
        
        // Example:
        // Input 1  :    5, 6
        // Output 1: 
        
        // * * * * * *
        // * $ $ $ $ *
        // * $ $ $ $ *
        // * $ $ $ $ *
        // * * * * * *
        
        
        // Input 2  :    3, 6
        // Output 2: 
        
        // * * * * * *
        // * $ $ $ $ *
        // * * * * * *
        
        
        // Explanation:
        // Print the Stars(*) at Boarders and in middle print dollars($) in the Given Square/Rectangle Patterns    
        
        Answer();
	}
	
	public static void Answer(){
	    
	    int row = scan.nextInt();
	    int column = scan.nextInt();
	    
	    if(row <= 0 || column <= 0){
	        System.out.print("Invalid Input.");
	        return;
	    }
	    
	    for ( int i = 1 ; i <= row ; i++ ){
	        
	        for( int j = 1 ; j <= column ; j++ ){
	            if(i==1 || i== row || j == 1 || j==column) System.out.print("* ");
	            else System.out.print("# ");
	        } 
	        
	        System.out.println();
	    } 
	    
	}
	
}
