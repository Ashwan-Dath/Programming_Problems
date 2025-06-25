package  Arrays.ArraysLevel1;

import java.util.Scanner;

public class MaxMin {
    
    public static void main(String[] args) {  

        // Question : Find the maximum and minimum elements in an array in a single traversal.
        // Constraints:
        // Input :      First Line of Input Consists of One Integer Value (Array Size).
        //              Second Line of Input Consists of few Integer Values Separated by Spaces (Array Elements).
        // Output :     Minimum Number : x, Maximum Number : x. 
        // Constraints :    The Array Size must be greater than 3 or else Print "Invalid Array Size.".                  

        // Example:
        // Input 1 :        4
        //                  15 3 47 56
        // Output 1 :   Minimum Number : 3, Maximum Number : 56.
        // Explanation :
        // Check every element in the array in a single Traversal(Loop).

        // Input 2 :       5
        //                 8 2 7 54 89
        // Output 2 :   Minimum Number : 2, Maximum Number : 89.
        // Explanation :
        // Check every element in the array in a single Traversal(Loop).

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Size of the Array : ");
        int Length = scan.nextInt();

        int arr[] = new int[Length];
        System.out.print("\nEnter the Element Values in Array : ");
        for(int i = 0; i < Length; i++){
            arr[i] = scan.nextInt();
        }

        scan.close();

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        // In a Single Loop Finding out the MAX and MIN
        for(int i = 0; i < Length; i++){
            if(arr[i] < max)
                max = arr[i];
            if(arr[i] > min)
                min = arr[i];
        }

        System.out.printf("Minimum Number : %d, Maximum Number : %d.",max, min);

    }
}
