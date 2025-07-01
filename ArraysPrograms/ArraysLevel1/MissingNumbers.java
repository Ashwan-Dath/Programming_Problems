package  ArraysPrograms.ArraysLevel1;

import java.util.Scanner;

public class MissingNumbers {
    
    public static void main(String [] args){
        //Question : Find the missing number in an array of size n containing numbers from 1 to n+1.

        // Constraints:
        // Input : First Line of Input Consists of One Integer Value (Array Size).
        //         Second Line of Input Consists of few Integer Values Separated by Space (Array Elements). 
        // Output : Print the missing numbers that are not present in between the given array.

        // Constraints :
        //      Array Size must be Greater than 3 or else Print "Invalid Array Size.".
        //      If there are no missing numbers then print "No Numbers are MISSING."

        // Explanation:
        // Input 1 : 6 - Length of the Array
        //           1 6 7 2 4 9 - Elements
        // Output 1 : Missing Numbers are : 3 5 8
        // Explanation :
        // First sort the array. Here 1 2 4 6 7 9 are sorted array
        // So from the sorted array the numbers : 3 5 8 are missing
        
        
        // Input 2 : 4 - Length of the Array
        //           8 1 -4 5 - Elements
        // Output 2 : Missing Numbers are : -3 -2 -1 0 2 3 4 6 7.
        // Explanation :
        // First sort the array. Here -4 1 5 8 are sorted array
        // So from the sorted array the numbers : -3 -2 -1 0 2 3 4 6 7 are missing
        

        // Input 3 : 5 - Length of the Array
        //            1 5 2 4 3 - Elements
        // Output 2 : No Numbers are MISSING.
        // Explanation :
        // First sort the array. Here 1 2 3 4 5 are sorted array.
        // Since there are no missing numbers present in between the lowest and highest number.
        // So we are printing "No Numbers are MISSING."

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Size of the Array : ");
        int Length = scan.nextInt();

        if(Length < 4){
            scan.close();
            System.out.println("Invalid Array Size");
            return;
        }

        int arr[] = new int[Length];
        System.out.print("\nEnter the Element Values in the array : ");
        
        for(int i = 0; i < Length; i++)
            arr[i] = scan.nextInt();

        scan.close();
        
        int []newarr = removeDuplicates(arr);
         newarr = sortArray(newarr);


        System.out.print("Deduplicated and Sorted Array : ");
        for(int i = 0; i < newarr.length; i++)
            System.out.print(newarr[i]+" ");
        
        System.out.print("\nThe Missing Numbers are : ");
        
        int k = newarr[0];
        for(int i = 0; i < newarr.length; k++ ){
            if(k == newarr[i]){
                i++;
            }
            else{
                System.out.print(k + " ");
            }
        }

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


}
