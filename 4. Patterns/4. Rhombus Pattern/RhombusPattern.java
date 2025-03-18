import java.util.Scanner;

public class RhombusPattern
{
	public static void main(String[] args) {
	    
        // Question :  Write a Program to Print the Following Pattern?
        // If Input is 5 then Print
        
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Given Pattern.
        // Constraints  :- Given Input must be Greater than 0 or Else Print "Invalid Input".
        
        // Example:
        // Input   1:    5
        // Output 1: 
        
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
        
        
        // Input 2  :    -6
        // Output 2:    Invalid Input
        
        
	    Scanner scan = new Scanner(System.in);	    
	    
	    int range = scan.nextInt();
	    
	    if(range <= 0){ 
	        System.out.print("Invalid Input."); 
	        return;
	    }
        
	    // This Loop is to form the upper triangle
	    for (int i = 1; i <= range ; i++ ){
	        for(int j = range; j >= 1; j--){
	            if(i >= j) System.out.print(" *");
	            else System.out.print(" ");
	        }
	        System.out.println();
	    } 

        // This loop is to form the lower traingle
        for(int i = range - 1 ; i>=0; i--){
            for(int j = range; j >= i ; j-- )
                System.out.print(" "); 
            for(int j = 0 ; j < i ; j++) 
                System.out.print("* "); 
            System.out.println(); 
        }

	    
	}
}
