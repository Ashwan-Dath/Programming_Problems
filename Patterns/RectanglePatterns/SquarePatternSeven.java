package  Patterns.RectanglePatterns;

import java.util.Scanner;

public class SquarePatternSeven
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	    
        // Question :  Write a Program to Print the following Basic Pattern?
        
        // If Input is 5 then Print 
        
        // 1 0 0 0 0
        // 0 2 0 0 0
        // 0 0 3 0 0
        // 0 0 0 4 0
        // 0 0 0 0 5
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows & Columns ).
        // Output        :- Print the Following Pattern.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        
        // Example:
        // Input 1  :    5
        // Output 1: 
        
        // 1 0 0 0 0
        // 0 2 0 0 0
        // 0 0 3 0 0
        // 0 0 0 4 0
        // 0 0 0 0 5
        
         
        
        // Input 2  :    8
        // Output 2: 
        
        // 1 0 0 0 0 0 0 0
        // 0 2 0 0 0 0 0 0
        // 0 0 3 0 0 0 0 0
        // 0 0 0 4 0 0 0 0
        // 0 0 0 0 5 0 0 0
        // 0 0 0 0 0 6 0 0
        // 0 0 0 0 0 0 7 0
        // 0 0 0 0 0 0 0 8
        
        
        // Explanation:
        // Print a Following Pattern by taking One Integer Input        
        
        
        Answer();
        
        
	}
	
	
	public static void Answer(){
	    
	    int row = scan.nextInt();   // Row and column are Same 

	    if(row <= 0 ){
	        System.out.print("Invalid Input.");
	        return;
	    }
	    
	    for (int i = 1 ; i <= row ; i++ ){
	        
	        for (int j = 1; j <= row ; j++ ){
	            
	            if(i==j) System.out.print(i+" ");
	            else System.out.print("0 ");
	            
	        } 
	        System.out.println();
	    } 
	    
	}
	
	
	
}
