// int startingRange = scan.nextInt();
// int endingRange = scan.nextInt();


// // Calculate the direction of the loop (forward or backward) 
// int step = (startingRange < endingRange) ? 1 : -1;  
// // Why only storing 1 or -1 : is for making the loop to iterate forward(++) or backward(--)

// // A single for loop to handle both cases 
// for (int i = startingRange; (step == 1) ? i <= endingRange : i >= endingRange; i += step) {
    
//     System.out.print( (i < 0 ? "(" + (5 * i) + ")" : (5 * i))   +   (i != endingRange ? ", " : "") );
//     //                              |                                           |
//     // Print the value of i * 5, handling negative numbers with parentheses     |
//     //                                                                          |
//     //                                             Print a comma and space unless it's the last number
// }

// // This logic is for a single loop for both ranges from low to high and high to low


// int a = 10;
// int b = 20;
// a = a + b - ( b = a);
// System.out.print(a+" "+b);


// package logic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Logics {
    public static void main(String[] args) {

        // Question : 


        Scanner input = new Scanner(System.in);

        String outerStart = input.next();
        String outerEnd = input.next();

        System.out.println("OuterStart "+ outerStart);
        System.out.println("OuterEnd "+ outerEnd);
        outerStart = outerStart.toUpperCase();
        outerEnd = outerEnd.toUpperCase();
        System.out.println("OuterStart "+ outerStart);
        System.out.println("OuterStart "+ outerStart.length());
        System.out.println("OuterEnd "+ outerEnd);
        System.out.println("OuterEnd "+ outerEnd.length());
        
        if(outerStart.length() > outerEnd.length()){
            String tempString = outerStart;
            outerStart = outerEnd;
            outerEnd = tempString;
        }

        System.out.println("After OuterStart "+ outerStart);
        System.out.println("After OuterStart "+ outerStart.length());
        System.out.println("After OuterEnd "+ outerEnd);
        System.out.println("After OuterEnd "+ outerEnd.length());
        
        // System.out.println("\nEnter the Range Starting Character : ");
        // char outerStart = input.next().charAt(0);
        // System.out.println("\nEnter the Range Ending Character : ");
        // char outerEnd = input.next().charAt(0);
        
        // System.out.println("\nEnter the Range Starting Number : ");
        // int innerStart = input.nextInt();
        // System.out.println("\nEnter the Range Ending Number : ");
        // int innerEnd = input.nextInt();

        input.close();


    }
}
