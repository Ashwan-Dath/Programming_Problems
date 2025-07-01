package  ArraysPrograms.ArraysLevel1;

import java.util.Scanner;

public class ThirdLargesArray {

    public static void formalFinding(int [] arr){

        int firstLargest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;
        for(int i = 0; i < arr.length; i++){
            
            for(int j = 0; j < arr.length; j++){

                if(arr[j]>arr[i] && arr[j] > firstLargest){
                    firstLargest = arr[j];
                }
                else if(arr[j] > arr[i] && arr[j] > secondLargest && arr[j] < firstLargest){
                    secondLargest = arr[j];
                }
                else if(arr[j] > arr[i] && arr[j] > thirdLargest && arr[j] < secondLargest && arr[j] < firstLargest){
                    thirdLargest = arr[j];
                }

            }
        }

        if(thirdLargest != 0)
            System.out.println("The Third Largest value in a Given Array Elements is : "+ thirdLargest);
        else   
            System.out.println("There is No Third Largest Value.");

    }
    public static void main(String [] args){
        
        // Question : Write a Program to Find the Third Largest Element in an Given Array ?

        // Constraints:
        // Input : First Line of Input Consists of One Integer Value (Array Size).
        // Second Line of Input Consists of few Integer Values Separated by Space (Array Elements). 
        // Output : Print the Third Largest element/value in the Array Elements.

        // Constraints : Array Size must be Greater than 3 or else Print "Invalid Array Size.".
        // All the Given Array Values Must be greater than ONE, or else print "Invalid Array Elements".
        // If there is no Second Largest value in a Given Array then Print "There is No Third Largest Value".

        // Explanation:
        // Input 1 : 6 - Length of the Array
        // 10 02 20 21 11 54 - Elements
        // Output 1 : The Third Largest value in a Given Array Elements is : 21.
        // Explanation :
        // First Largest value is 54. Second Largest is 21
        // The Third Largest value in a Given Array Elements is : 20.

        // Input 2 : 4 - Length of the Array
        //            55 2 3 11 - Elements
        // Output 2 : The Third Largest value in a Given Array Elements is : 11.
        // Explanation :
        // First Largest value in a Given Array Element is : 55, Second Largest is : 11.
        // The Third Largest value in a Given Array Elements is : 3.
        
        // Input 3 : 5 - Length of the Array
        //            10 11 10 11 10 - Elements
        // Output 2 : There is No Third Largest Value.
        // Explanation :
        // First Largest value in a Given Array Element is : 11, Second Largest is : 10.
        // There is No Third Largest Value.

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

        scan.close();
        formalFinding(arr);


    }
}
