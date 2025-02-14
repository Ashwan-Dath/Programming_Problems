import java.util.Scanner;

class SquarePatternFive 
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
                	    
        // Question : Write a Program to Print the following Basic Pattern?
        
        // If Input is 6 then Print 
        
        // 1 1 1 1 1 1
        // 1 1 1 1 2 2
        // 1 1 1 3 3 3
        // 1 1 4 4 4 4
        // 1 5 5 5 5 5
        // 6 6 6 6 6 6
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows & Columns ).
        // Output        :- Print the Following Pattern.
        // Constraints  :- Given Input Must be Greater than Zero or Else Print Invalid Input.
        
        
        // Example:
        // Input 1  :    6
        // Output 1: 
        
        // 1 1 1 1 1 1
        // 1 1 1 1 2 2
        // 1 1 1 3 3 3
        // 1 1 4 4 4 4
        // 1 5 5 5 5 5
        // 6 6 6 6 6 6
        
        // Input 2  :    5
        // Output 2: 
        
        // 1 1 1 1 1
        // 1 1 1 2 2
        // 1 1 3 3 3
        // 1 4 4 4 4
        // 5 5 5 5 5
        
        
        // Explanation:
        // Print the Given Pattern by taking one Integer Input.
        
        
        Answer();
        
        
	}
	
	
	public static void Answer(){
	    
	    int row = scan.nextInt();   // Row and column are Same 

	    if(row <= 0 ){
	        System.out.print("Invalid Input.");
	        return;
	    }
	    
	    for ( int i = 1 ; i <= row ; i++ ){
	       
	        for( int j = 1 ; j <= row ; j++ ) {
	            if( row + 1 - i > j ) System.out.print(1+" ");
	            else System.out.print(i+" ");
	        } 
	        
	        System.out.println();
	    } 
	    
	}
	
}
