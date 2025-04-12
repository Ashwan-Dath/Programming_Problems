import java.util.Scanner;

public class MergingArrays {

    public static int[] sortedArr(int []arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int dup = arr[i];
                    arr[i] = arr[j];
                    arr[j] = dup;
                }
            }
            // System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String [] args){
        // Question :   Write a Program to Two Given Arrays.
        // Constraints:
        // Input :      First Line of Input Consists of One Integer Value (Array Size).
        //              Second Line of Input Consists of few Integer Values Separated by Spaces (Array Elements).
        //              Third Line of Input Consists of One Integer Value (Array Size).
        //              Fourth Line of Input Consists of few Integer Values Separated by Spaces (Array Elements).
        // Output :         Print the Merged Sorted Array.
        // Constraints :    Array Size must be greater than 3 or else Print "Invalid Array Size.".                  

        // Example:
        // Input 1 :        3
        //                  5 8 9
        //                  4     
        //                  2 89 3 1
        // Output 1 :    The Given Arrays are : 5, 8, 9 and 2, 89, 3, 1
        //               Merged Sorted Array is : 1, 2, 3, 5, 8, 9, 89 
        // Explanation :
        // Both the given Arrays should be sorted first
        // Later both the arrays should be merged in a sorted array.
                
        // Input 2 :       5
        //                 8 2 7 54 89
        //                 4
        //                 1 7 8 3
        // Output 1 :    The Given Arrays are : 8 2 7 54 89 and 1 7 8 3
        //               Merged Sorted Array is : 1, 2, 3, 7, 7, 8, 8, 54, 89 
        // Explanation :
        // Both the given Arrays should be sorted first
        // Later both the arrays should be merged in a sorted array.
        
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Size of the First Array  : ");
        int firstArraySize = scan.nextInt();

        if(firstArraySize < 4){
            scan.close();
            System.out.print("Invalid First Array Size.");
            return;
        }
        int firstArr[] = new int[firstArraySize];
        System.out.print("\nEnter the First Array Elements : ");
        for(int i = 0; i < firstArraySize; i++)
        firstArr[i] = scan.nextInt();
        
        System.out.print("\nEnter the Size of the Second Array  : ");
        int secondArraySize = scan.nextInt();
        
        if(secondArraySize < 4){
            scan.close();
            System.out.print("Invalid Second Array Size.");
            return;
        }

        int secondArr[] = new int[secondArraySize];
        System.out.print("\nEnter the Second Array Elements : ");
        for(int i = 0; i < secondArraySize; i++)
            secondArr[i] = scan.nextInt();

        scan.close();

        System.out.print("\nThe Given Array are : ");
        for(int i =0 ; i < firstArraySize; i++)
            System.out.print(firstArr[i]+" ");
        
        System.out.print("and ");
            
        for(int i =0 ; i < secondArraySize; i++)
            System.out.print(secondArr[i]+" ");
        

        firstArr = sortedArr(firstArr);

        secondArr = sortedArr(secondArr);

        int mergedArr[] = new int[firstArraySize + secondArraySize];

        for(int i = 0; i < firstArraySize; i++)
            mergedArr[i] = firstArr[i];

        for(int i = 0; i < secondArraySize; i++)
            mergedArr[i+firstArraySize] = secondArr[i];

            
        mergedArr = sortedArr(mergedArr);
        
        System.out.print("\nMerged Sorted Array is : ");
        for(int i = 0; i < mergedArr.length; i++)
            System.out.print(mergedArr[i]+" ");

    }
}
