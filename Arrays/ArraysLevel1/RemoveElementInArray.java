package  Arrays.ArraysLevel1;

import java.util.Scanner;

public class RemoveElementInArray {

    public static int[] newArray(int arr[], int index){

        int duparr[] = new int[arr.length-1];

        int j = 0;
        for(int i =0 ; i<arr.length; i++){
            if( i != index){
                duparr[j++]=arr[i];
            }
        }

        return duparr;
    }

    public static void main(String[] args){
        
        // Question: Write a Program to Remove a Given Element from an Array.

        // Constraints:
        // Input: 
        // - The first line of input consists of one integer value (Array Size).
        // - The second line of input consists of integer values separated by space (Array Elements).
        // - The third line of input consists of one integer value (Element to be removed).

        // Output:
        // - Print the modified array after removing the given element.
        // - If the element is not found in the array, print "Element Not Found.".
        // - If the array becomes empty after removal, print "Array is Empty.".

        // Constraints:
        // - The array size must be greater than 1, or else print "Invalid Array Size.".
        // - All given array values must be greater than ONE, or else print "Invalid Array Elements".
        // - If there is more than one occurrence of the given element, remove all occurrences.

        // Explanation:
        // Input 1 : 6 - Length of the Array
        //           10 02 20 21 11 54 - Elements
        //            4 - Index value to remove the element
        // Output 1 :  10 2 20 21 54.
        // Explanation :
        // The 4th value is 21. Remove it and for an array 10 2 20 11 54.

        Scanner scan = new Scanner(System.in);

        System.out.print("\n Enter Size of the Array : ");
        int Length = scan.nextInt();
        
        if(Length < 3){
            scan.close();
            System.out.print("Invalid Array Size.");
        }
        
        
        int arr[] = new int[Length];
        
        System.out.print("\n Enter Elements in the Array : ");
        for(int i = 0; i < Length; i++){
            arr[i] = scan.nextInt();
        }
        
        System.out.print("\n Enter Index Value to delete value in the Array : ");
        int index = scan.nextInt();
        scan.close();
        
        if(index > Length){
            System.out.println("Length value is greater than the Array Size.");
            return;
        }
        
        System.out.print("\nNewly Formed Array is : ");
        int duparr[] = newArray(arr, index-1);

        for(int i = 0; i < duparr.length; i++){
            System.out.print(duparr[i]+" ");
        }
    }
}
