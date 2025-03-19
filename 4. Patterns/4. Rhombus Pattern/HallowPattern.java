import java.util.Scanner;

public class HallowPattern {
    
    public static void main(String [] args){

        // Question : Write a Program to Print the following Hollow Pattern?
        // If Input is 4 then Print 

        // *     * 
        //  *   * 
        //   * * 
        //    * 
        //   * * 
        //  *   * 
        // *     * 


        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Hollow Pattern.
        // Constraints  :- Given Input Must be Greater than Zero or Else Print "Invalid Input".

        // Example:
        // Input 1  :    4
        // Output 1: 

        // *     * 
        //  *   * 
        //   * * 
        //    * 
        //   * * 
        //  *   * 
        // *     * 

        // Input 2  :    -3
        // Output 2:    Invalid Input

        Scanner scan = new Scanner(System.in);	    
	    
	    int range = scan.nextInt();

        scan.close();   // Closing the resource once the usage is over

        for(int i = range; i >= 1; i-- ){ 

            for(int j = i; j < range; j++) 
                System.out.print(" "); 
                
            for(int j = 1; j <= i; j++){ 
                if(j==1 || j==i) 
                    System.out.print("* "); 
                else   
                    System.out.print("  "); 
            } 

            System.out.println(); 
        } 

        for(int i = 2; i <= range; i++){

            for(int j=range; j>i ;j--)
                System.out.print(" ");

            for(int j = 1; j <= i; j++){
                if(j==1 || j==i)
                    System.out.print("* ");
                else   
                    System.out.print("  ");
            }

            System.out.println();

        }


    }

}
