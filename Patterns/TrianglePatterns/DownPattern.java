package  Patterns.TrianglePatterns;

import java.util.Scanner;

public class DownPattern
{
    public static void main(String[] ars){
        
        // Question : Write a Program to Print the Following Pattern?
        
        // If Input is 5 then Print
        
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows ).
        // Output        :- Print the Given Pattern.
        // Constraints  :- If the Given Input is Zero, Print "Invalid Input".
        //                  If the Given input is negative value then convert it into positive value and Print the pattern.
        
        
        // Example:
        // Input 1  :    5
        // Output 1: 5
        
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
        
        // Input 2  :    -4
        // Output 2:
        
        // * * * *
        //  * * *
        //   * *
        //    *

        Scanner scan = new Scanner(System.in);

        int range = scan.nextInt();
        if(range == 0){
            System.out.print("Invalid Input");
            return;
        }
        
        if(range<0) range = -(range);

        for( int i = range ; i >= 1 ; i-- ){
            
            for(int j = range; j >= 1 ; j-- ){
                
                if( i >= j ) System.out.print(" *");
                else System.out.print(" ");

            }

            System.out.println();

        }

    }
    
}
