package  Arrays.ArraysLevel1;

import java.util.Scanner;

public class nthLargestElement {

    public static int[] finding(int []arr){

        for(int i = 0; i < arr.length; i++){
            int high = -1;

            for(int j = i; j < arr.length; j++){
                if(arr[j] > arr[i])
                    high = j;
            }

            if(high != -1){
                int dup = arr[i];
                arr[i] = arr[high];
                arr[high] = dup;
            }

        }

        // for(int i = 0; i < arr.length; i++)
        //     System.out.print(arr[i]+" ");
        return arr;
    }

    public static void main(String [] args){

        // Question : Write a Program to Find the nTH Largest Element in an Given Array ?

        // Constraints:
        // Input : First Line of Input Consists of One Integer Value (Array Size).
        //          Second Line of Input Consists of few Integer Values Separated by Space (Array Elements). 
        //         Third Line of Input Consists of One Integer Value (nTh Largest Value Place).
        // Output : Print the nTh Largest element/value in the Array Elements.

        // Constraints : Array Size must be Greater than 3 or else Print "Invalid Array Size.".
        // If there is no nTH Largest value in a Given Array then Print "There is No nTh Largest Value.".
        // The nth Largest value should be less than or equal to array size or else print "Invalid Largest Value Index.".

        // Explanation:
        // Input 1 : 6 - Length of the Array
        //          10 02 20 21 11 54 - Elements
        //          4 - Largest Value
        // Output 1 : The 4 Largest value in a Given Array Elements is : 11.
        // Explanation :
        // First Largest value is 54. Second Largest is 21, Third Largest value is 20.
        // The 4 Largest value in a Given Array Elements is : 11.

        // Input 2 : 6 - Length of the Array
        //            55 3 11 34 67 89 - Elements
        //              5
        // Output 2 : The 5 Largest value in a Given Array Elements is : 11.
        // Explanation :
        // First Largest value in a Given Array Element is : 55, Second Largest is : 11.
        // The Third Largest value in a Given Array Elements is : 3.
        
        // Input 3 : 5 - Length of the Array
        //            10 11 10 11 10 - Elements
        //              4 - nth Largest Value
        // Output 2 : The 4 Largest value in a Given Array Elements is : 10.
        // Explanation :
        // After sorting array is : 11 11 10 10 10
        // First Largest value is : 11, Second Largest is : 11, Third Largest is : 10.
        // The 4 Largest Value in a Given Array Elements is : 10.

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Array Size : ");
        int Length = scan.nextInt();

        if(Length < 4){
            scan.close();
            System.out.print("Invalid Array Size.");
            return;
        }

        System.out.print("\nEnter the Values in the Array : ");
        int arr[] = new int[Length];

        for(int i = 0; i < Length; i++)
            arr[i] = scan.nextInt();

        System.out.print("\nEnter the nTh Largest Value to find : ");
        int Largest = scan.nextInt();
        
        scan.close();
        
        if(Largest > Length){
            System.out.println("Invalid Largest Value Index.");
            return;
        }

        int sortedArray[] = finding(arr);

        System.out.printf("The %d Largest Value in a Given Array Elements is : %d.", Largest, sortedArray[Largest-1]);

    }
}
