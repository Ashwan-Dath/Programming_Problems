import java.util.Scanner;

public class SecondLargestArray {

    public static void formalFinding(int arr[]) {
        int firstHeighest = -1;
        int secondHeighest = -1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] > arr[j] && arr[i] > firstHeighest) {
                    secondHeighest = firstHeighest;
                    firstHeighest = arr[i];
                } else if (arr[i] > arr[j] && secondHeighest < firstHeighest && arr[i] > secondHeighest
                        && arr[i] < firstHeighest) {
                    secondHeighest = arr[i];
                }

            }

        }
        if (secondHeighest == -1)
            System.out.print("There is No Second Largest Value.");
        else
            System.out.printf("The Second Largest value in a Given Array Elements is : %d.", secondHeighest);
    }

    // public static void sorting(int arr[]) {
    //     int duparr[] = new int[arr.length];

    //     for (int i = 0; i < arr.length; i++) {
    //         int num = 0;
    //         for (int j = 0; j < arr.length; j++) {
    //             if (arr[i] > arr[j]) {
    //                 num = arr[i];
    //                 // System.out.print(arr[i] + " ");
    //                 // duparr[i] = arr[i];
    //                 // arr[i] = 0;
    //             }
    //         }
    //         System.out.print(num+" ");
    //     }
        
    //     System.out.println();
    //     for (int i = 0; i < arr.length; i++)
    //         System.out.print("  " + arr[i]);

    //     System.out.println();
    //     for (int i = 0; i < arr.length; i++)
    //         System.out.print("  " + duparr[i]);

    // }

    public static void main(String[] args) {
        
        // Question : Write a Program to Find the Second Largest Element in an Given
        // Array ?

        // Constraints:
        // Input : First Line of Input Consists of One Integer Value (Array Size).
        // Second Line of Input Consists of few Integer Values Separated by Space (Array Elements). 
        // Output : Print the Second Largest element/value in the Array Elements.

        // Constraints : Array Size must be Greater than 2 or else Print "Invalid Array
        // Size.".
        // All the Given Array Values Must be greater than ONE, or else print "Invalid
        // Array Elements".
        // If there is no Second Largest value in a Given Array then Print "There is No
        // Second Largest Value".

        // Explanation:
        // Input 1 : 6 - Length of the Array
        // 10 02 20 21 11 54 - Elements
        // Output 1 : The Second Largest value in a Given Array Elements is : 21.
        // Explanation :
        // First Largest value is 54.
        // The Second Largest value in a Given Array Elements is : 21.

        // Input 2 : 4 - Length of the Array
        // 55 2 3 11 - Elements
        // Output 2 : The Second Largest value in a Given Array Elements is : 11.
        // Explanation :
        // First Largest value in a Given Array Element is : 55.
        // The Second Largest value in a Given Array Elements is : 21.

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Length of the Array Size : ");
        int Length = scan.nextInt();

        if (Length < 3) {
            scan.close();
            System.out.println("Invalid Array Size.");
            return;
        }

        int arr[] = new int[Length];

        for (int i = 0; i < Length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] < 2) {
                System.out.println("Invalid Array Elements.");
                scan.close();
                return;
            }
        }

        formalFinding(arr);
        // sorting(arr);
        scan.close();
    }
}
