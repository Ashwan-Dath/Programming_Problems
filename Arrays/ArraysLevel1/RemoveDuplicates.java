package  Arrays.ArraysLevel1;

import java.util.Scanner;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int arr[]){

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j] && arr[i] != 0){
                    arr[j] = 0;
                    count++;
                }
            }
        }

        int dupArr[] = new int[arr.length - count];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0)
                dupArr[j++] = arr[i];
        }

        return dupArr;
    }

    public static void main(String [] args){
        
        // Question : Remove duplicates from a sorted array.

        // Constraints:
        // Input : First Line of Input Consists of One Integer Value (Array Size).
        //         Second Line of Input Consists of few Integer Values Separated by Space (Array Elements). 
        // Output : Print the Array with no duplicates without changing the order of the elements.

        // Constraints :
        //      Array Size must be Greater than 3 or else Print "Invalid Array Size.".
        //      Array elements should not be equal to zero or else print "Zero is not allowed."


        // Explanation:
        // Input 1 : 6 - Length of the Array
        //           10 13 10 21 10 13 - Elements
        // Output 1 : 10 13 21.
        // Explanation :
        // 10 and 13 are duplicates so remove it and form new array
        // 10 13 21.

        // Input 2 : 4 - Length of the Array
        //           55 24 13 11 - Elements
        // Output 2 : 55 24 13 11.
        // Explanation :
        // There are no duplicates in the given array so just print the array.
        
        // Input 3 : 5 - Length of the Array
        //            12 34 12 43 1 - Elements
        // Output 2 : 12 34 43 1
        // Explanation :
        // 12 has a duplicate so remove it and print newly formed array.
        // 12 34 43 1

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Size of an Array : ");
        int Length = scan.nextInt();

        if(Length  < 4){
            scan.close();
            System.out.print("Invalid Array Size.");
            return;
        }

        System.out.print("Enter the Element values : ");
        int arr[] = new int[Length];

        for(int i = 0; i < Length; i++){
            arr[i] = scan.nextInt();
            if(arr[i] == 0){
                scan.close();
                System.out.print("Zero is not allowed.");
                return;
            }
        }

        scan.close();

        int []newArr = removeDuplicates(arr);

        System.out.print("The Deduplication of Given Array is : ");
        for(int i = 0; i < newArr.length; i++)
            System.out.print(newArr[i]+" ");
        
    }
}
