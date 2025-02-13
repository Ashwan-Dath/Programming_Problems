import java.util.Scanner;

class SquarePatternThree
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Description : Write a Program to Print the following Basic Pattern?
        
        // If Input is 5 then Print 
        
        // 1 1 1 1 1
        // 2 2 2 2 2
        // 3 3 3 3 3
        // 4 4 4 4 4
        // 5 5 5 5 5
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows & Columns ).
        // Output        :- Print the Square Pattern.
        // Constraints  :- Given Input Must be Greater than Zero or else Print InValid InPut.
        
        
        // Example:
        // Input 1  :    5
        // Output 1: 
        
        // 1 1 1 1 1
        // 2 2 2 2 2
        // 3 3 3 3 3
        // 4 4 4 4 4
        // 5 5 5 5 5
        
         
        
        // Input 2  :    3
        // Output 2: 
        
        // 1 1 1
        // 2 2 2
        // 3 3 3
        
        
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
	            System.out.print(i+" ");
	        } 
	        
	        System.out.println();
	    } 
	    
	}
	
}
