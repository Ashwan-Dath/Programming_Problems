package  Arrays.ArraysLevel1;

import java.util.Scanner;

public class TwoArraysCheck {
    
    public static boolean equalArrays(int firstArr[], int secondArr[]){
        if(firstArr.length != secondArr.length)
            return false;
        
        for(int i = 0; i < firstArr.length; i++){
            boolean b = false;
            for(int j = 0; j < secondArr.length; j++){
                if(firstArr[i] == secondArr[j])
                    b = true;
            }
            if(!b)
                return false;
        }

        return true;
    }
    public static void main(String [] args){
        
        // Question :   Write a Program to the TWO Given Array are equal.
        // Constraints:
        // Input :      First Line of Input Consists of One Integer Value (Array Size).
        //              Second Line of Input Consists of few Integer Values Separated by Spaces (Array Elements).
        //              Third Line of Input Consists of One Integer Value (Array Size).
        //              Fourth Line of Input Consists of few Integer Values Separated by Spaces (Array Elements).
        // Output :         Print the Output accordingly
        // Constraints :    Both the Array Sizes must be greater than 3 or else Print "Invalid Array Size.".                  

        // Example:
        // Input 1 :        4
        //                  15 3 47 56
        //                  4
        //                  47 3 56 15 
        // Output 1 :   The Given Two Arrays are EQUAL.
        // Explanation :
        // Check every element that is present in first array is present in second array 
        // Check every element that is present in second array is present in first array

        // Input 2 :       5
        //                 8 2 7 54 89
        //                 4    
        //                 54 1 8 90 89
        // Output 2 :   The Given TWO Arrays are NOT EQUAL.
        // Explanation :
        // Check every element that is present in first array is present in second array 
        // Check every element that is present in second array is present in first array

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the First Array Size : ");
        int lenFirst = scan.nextInt();

        if(lenFirst < 4){
            scan.close();
            System.out.print("Enter the Valid First Array Size.");
            return;
        }

        System.out.print("\nEnter the First Array Element Values : ");
        int firstArr[] = new int[lenFirst];
        for(int i = 0; i < lenFirst; i++)
            firstArr[i] = scan.nextInt();
        
        System.out.print("\nEnter the Second Array Size : ");
        int lenSecond = scan.nextInt();
        
        if(lenSecond < 4){
            scan.close();
            System.out.print("Enter the Valid Second Array Size.");
            return;
        }
        
        System.out.print("\nEnter the First Array Element Values : ");
        int secondArr[] = new int[lenSecond];
        for(int i = 0; i < lenSecond; i++)
        secondArr[i] = scan.nextInt();
        
        scan.close();

        if(equalArrays(firstArr, secondArr)){
            System.out.println("\n The Given TWO Arrays are EQUAL.");
        }else{
            System.out.println("\n The Given TWO Arrays are NOT EQUAL.");
        }

            
    }
}
