import java.util.Scanner;

class SquarePatternFour
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Description : Write a Program to Print the following Basic Pattern?
        
        // If Input is 3 and 5 then Print 
        
        // 1 2 3 4 5
        // 6 7 8 9 10
        // 11 12 13 14 15
        
         
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of Two Integer Values ( Rows & Columns ).
        // Output        :- Print the Following Pattern.
        // Constraints  :- Either of the Given Inputs is Zero then Print Invalid Inputs.
        //                       If the Given Inputs is Negative then Convert into Positive and then Print Following Output
        
        
        // Example:
        // Input 1  :    3, 5
        // Output 1: 
        
        // 1 2 3 4 5
        // 6 7 8 9 10
        // 11 12 13 14 15
        
         
        
        // Input 2  :    5, 4
        // Output 2: 
        
        // 1 2 3 4
        // 5 6 7 8
        // 9 10 11 12
        // 13 14 15 16
        // 17 18 19 20
        
        
        // Explanation:
        // If the Given Inputs is negative then Convert to Positive And print Following Pattern
        
        
        
        


        Answer();
	}
	
	public static void Answer(){
	    
	    int row = scan.nextInt();   
	    int column = scan.nextInt();

	    if(row == 0 || column == 0){
	        System.out.print("Invalid Input.");
	        return;
	    }

        if(row < 0) row = -(row);
        if(column < 0) column = -(column);
	    
	    int k = 1;
	    for ( int i = 1 ; i <= row ; i++ ){
	        
	        for( int j = 1 ; j <= column ; j++ ) System.out.print( k++ + " " );
	        
	        System.out.println();
	    } 
	    
	}
	
}
