import java.util.Scanner;

class RightAngleFour
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String [] args){
	    
        // Description : Write a Program to Print the Following Pattern?
        
        // If Input is 5 then Print
        
        // * * * * *
        // * * * * 
        // * * *
        // * *
        // *
        
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows ).
        // Output        :- Print the Given Pattern.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        
        // Example:
        // Input 1  :    5
        // Output 1: 
        
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        
         
        
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
        
        for(int i = row; i >= 1; i--){

            for(int j = 1; j <= row; j++){

                if(j<=i) System.out.print("* ");

            }

            System.out.println();
        }
        
	}
	
	
	
}
