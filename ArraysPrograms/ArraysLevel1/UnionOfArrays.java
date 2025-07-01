package  ArraysPrograms.ArraysLevel1;

import java.util.Scanner;

public class UnionOfArrays{
    
    public static void main(String [] args){
        // Question :   Write a Program to get the UNION of TWO ARRAYS.
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
        //                  47 90 1 93 
        // Output 1 :   Union of Arrays : 1 3 15 47 56 93
        // Explanation :
        // First sort the given arrays 
        // Then prepare a new array for forming new array
        // insert the union of values in the array

        // Input 2 :       5
        //                 8 2 7 54 89
        //                 4    
        //                 54 3 7 2 
        // Output 2 :   2 3 7 8 54 89
        // Explanation :
        // First sort the given arrays 
        // Then prepare a new array for forming new array
        // insert the union of values in the array

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Size of the First Array : ");
        int firstLength = scan.nextInt();

        System.out.print("\nEnter the Element Values in the Array : ");
        int firstArr[] = new int[firstLength];

        for(int i = 0; i < firstLength; i++)
            firstArr[i] = scan.nextInt();
            
        System.out.print("\nEnter the Size of the Second Array : ");
        int secondLength = scan.nextInt();

        System.out.print("\nEnter the Element Values in the Array : ");
        int secondArr[] = new int[secondLength];

        for(int i = 0; i < secondLength; i++)
            secondArr[i] = scan.nextInt();

        scan.close();

        firstArr = sortArray(firstArr);
        secondArr = sortArray(secondArr);
        for(int i =0 ;i< firstLength;i++)
            System.out.print(firstArr[i]+" ");
        for(int i =0 ;i< secondLength;i++)
            System.out.print(secondArr[i]+" ");
    }


    public static int[] sortArray(int []arr){
       
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int dup = arr[i];
                    arr[i] = arr[j];
                    arr[j] = dup;
                }
            }
        }
        return arr;
    }


}