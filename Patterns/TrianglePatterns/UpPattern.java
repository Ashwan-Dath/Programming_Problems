package  Patterns.TrianglePatterns;

import java.util.Scanner;

public class UpPattern
{
    public static void main(String[] ars){
        
        // Question : Write a Program to Print the Following Pattern?

        // If Input is 5 then Print

        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *


        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows ).
        // Output        :- Print the Given Pattern.
        // Constraints  :- If the Given Input is Negative then Print "Invalid Input".
        //                     If input is 0 then print "Zero".

        // Example:
        // Input 1  :    5
        // Output 1: 

        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *

        // Input 2  :    -6
        // Output 2:    Invalid Input

        Scanner scan = new Scanner(System.in);

        int range = scan.nextInt();
        if(range <= 0){
            System.out.print("Invalid Input");
            return;
        }

        for( int i = 1 ; i <= range ; i++ ){
            
            for(int j = range; j >= 1; j-- ){
                
                if(i<j) System.out.print(" ");
                else System.out.print(" *");

            }

            System.out.println();

        }

    }
    
}
