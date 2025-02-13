import java.util.Scanner;

class SquarePatternTwo
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Description : Write a Program to Print the following Basic Pattern?
        
        // If Input is 5 then Print 
        
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows & Columns ).
        // Output        :- Print the Square Pattern.
        // Constraints  :- Given Input Must be Greater than Zero or else Print the Invalid Input.
        
        
        // Example:
        // Input 1  :    5
        // Output 1:
        
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        
        // Input 2  :    3
        // Output 2: 
        
        // 1 2 3
        // 1 2 3
        // 1 2 3
        
        
        // Explanation:
        // Print the Square Pattern by taking One Integer Input


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
	            System.out.print(j+" ");
	        } 
	        
	        System.out.println();
	    } 
	    
	}
	
}
