package  ArraysPrograms.ArraysLevel1;

import java.util.Scanner;

public class frequencyArray{
    
    public static void main(String [] args){
        // Question :   Write a Program to Find the Frequency of Each Element in an Array.
        // Constraints:
        // Input :      First Line of Input Consists of One Integer Value (Array Size).
        //              Second Line of Input Consists of Integer Values Separated by Spaces (Array Elements).
        // Output :     Print each element along with its frequency in ascending order of elements.
        // Constraints : The Array Size must be greater than 3 or else Print "Invalid Array Size."

        // Example:
        // Input 1 :        6
        //                  3 5 3 2 8 2
        // Output 1 :       2 - 2 times
        //                  3 - 2 times
        //                  5 - 1 time
        //                  8 - 1 time
        // Explanation :
        // First check if the array size is valid.
        // Then use a data structure like map/dictionary to store the frequency of each element.
        // Finally, sort the keys and print the elements with their respective frequencies.

        // Input 2 :        2
        //                  4 4
        // Output 2 :       Invalid Array Size.
        // Explanation :
        // Since the array size is less than 4, it violates the constraint.
        // Hence, print the error message instead of proceeding with logic.

        int arr[] = UserInput();

        frequencyOfArrayELements(arr);
    }

    public static void frequencyOfArrayELements(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = i; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = max;
                }
            }
            System.out.printf("%d - %d times\n", arr[i], count);
        }
    }

    public static int[] UserInput(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nEnter the Size of the Array : ");
        int size = scan.nextInt();

        if(size < 4){
            System.out.println("Invalid Array Size.");
            scan.close();
            return null;
        }

        System.out.println("\nEnter the Elements in the Array : ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }

        return arr;
    }
}