import java.util.Scanner;

class PatternOne
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	   // Question : Write a Program to Print the following Basic Pattern?
        
    //     If Input is 5 4 then Print 
    //     * * * *
    //     * * * *
    //     * * * *
    //     * * * *
    //     * * * *
        
        
    //     Constraints:
    //     Input          :- First Line of Input Consists of Two Integer Values ( Rows & Columns ).
    //     Output        :- Print the Rectangle Pattern.
    //     Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Inputs.
        
        
    //     Example:
    //     Input 1  :    5, 4
    //     Output 1: 
        
    //     * * * *
    //     * * * *
    //     * * * *
    //     * * * *
    //     * * * *
        
        
    //     Input 2  :    3, 3
    //     Output 2: 
        
    //     * * *
    //     * * *
    //     * * *
        
        
    //     Explanation:
    //     Print a Rectangle Pattern by taking Two Integer Inputs
	    Answer();
	}
	
	public static void Answer(){
	    
	    int column = scan.nextInt();
	    int row = scan.nextInt();
        
        if(row <= 0 || column <= 0){
	        System.out.print("Invalid Input.");
	        return;
	    }

	    for ( int i = 1 ; i <= row ; i++ ){
	        
	        for( int j = 1 ; j <= column ; j++ ) System.out.print("* ");
	        
	        System.out.println();
	    } 
	    
	}
	
}
