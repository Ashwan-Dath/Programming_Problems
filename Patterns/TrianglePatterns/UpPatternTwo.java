package  Patterns.TrianglePatterns;

import java.util.Scanner;

public class UpPatternTwo
{

    public static void main(String[] args) {
	    
        // Question : Write a Program to Print the Following Pattern?
        // If Input is 4 then Print

        //    1
        //   212
        //  32123
        // 4321234


        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows ).
        // Output        :- Print the Given Pattern.
        // Constraints  :- If the Given Input is Zero then Print "Oh! I got Zero(0)".
        //              If the Given Input is Negative then convert into Positive value and Print the pattern.


        // Example:
        // Input 1  :    4
        // Output 1: 

        //    1
        //   212
        //  32123
        // 4321234

        

        // Input 2  :    -6
        // Output 2:

        //      1
        //     212
        //    32123
        //   4321234
        //  543212345
        // 65432123456

	    Scanner scan = new Scanner(System.in);	   

	    int range = scan.nextInt();

	    if(range == 0){
            System.out.print("Invalid Input.");
            return;
        }
	    
        if(range < 0) range= - (range);
	    
	    for (int i = 1  ; i <= range ; i++ ) 
	    {
	        for(int j = range; j >= 1 ; j-- ){
	    
                if(i>=j) System.out.print(j);
	            else System.out.print(" ");
	    
            }
	    
            for(int k = 1; k < i; ) System.out.print(++k);
	    
            System.out.println();
	    }
	}


}
