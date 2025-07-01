package  ArraysPrograms.ArraysLevel1;

import java.util.Scanner;


public class ReverseArray {
    public static void main(String [] args){
        // Question : Write a Program to Print Given Array in Reverse Order?

        // Constraints:
        // Input : First Line of Input Consists of One Integer Value (Array Size).
        //         Second Line of Input Consists of few Integer Values Separated by Space (Array Elements).
        // Output :   Print all the Array Elements in Reverse Order.
        // Constraints :   Array Size must be Greater than or equal to 1 or else Print "InvALId ArrAy SIze.".

        // Example:
        // Input 1 :         8
        //                     46 18 11 73 93 21 34 19
        // Output 1 :     Given Array Elements - 46 18 11 73 93 21 34 19
        //                Reverse Array Elements - 19 34 21 93 73 11 18 46
        

        // Input 2 :        4
        //                     55 2 3 11
        // Output 2 :    Given Array Elements - 55 2 3 11
        //               Reverse Array Elements - 11 3 2 55

        Scanner scan = new Scanner(System.in);

        int Length = scan.nextInt();
        int arr[] = new int[Length];

        for(int i = 0; i < Length; i++)
            arr[i] = scan.nextInt();
        
        scan.close();   // Closing the resource once the work is done

        // Looping from the backside to print the values
        for(int i = arr.length-1 ; i>=0 ; i--)
            System.out.print(arr[i]+" ");


    }
}
