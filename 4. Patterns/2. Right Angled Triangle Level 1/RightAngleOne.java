import java.util.Scanner;

class RightAngleOne
{
    static Scanner scan = new Scanner(System.in);
    // public static void main(String [] args){
    //     System.out.print("Hell");
    // }

    public static void main(String [] args){
	    
        // Question :  Write a Program to Print the Following Pattern?
        
        // If Input is 5 then Print
        
        // *
        // **
        // ***
        // ****
        // *****
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows ).
        // Output        :- Print the Given Pattern.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        
        // Example:
        // Input 1  :    5
        // Output 1: 
        
        // *
        // **
        // ***
        // ****
        // *****
        
         
        
        // Input 2  :    -6
        // Output 2: 
        // Invalid Input
        
        
        // Explanation:
        // Print the Following Right angle Triangle Pattern by taking Given Integer Value.
        
        
        
        Answer();
        
        
	}
	
	
	public static void Answer(){
	    
	    int row = scan.nextInt();   // Row and column are Same 

	    if(row <= 0 ){
	        System.out.print("Invalid Input.");
	        return;
	    }
	    
	    for (int i = 1; i <= row ; i++ ){
	        for(int j =1 ; j <= i; j++) System.out.print("*");
	        System.out.println();
	    } 
	    
	}
	
	
	
}
