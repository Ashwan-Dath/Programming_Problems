package  ArraysPrograms.ArraysLevel1;

import java.util.Scanner;

public class SortedArray {

    public static boolean ascendinggOrder(int arr[]){
        
        for(int i = 0 ; i < arr.length; i++){
            boolean b = false;
            for(int j = i; j < arr.length; j++){

                if( arr[i] > arr[j] )
                    b = true;
            }

            if(b)
                return false;
        }
        return true;
    }
    
    public static boolean descendingOrder(int arr[]){

        for(int i = 0; i < arr.length; i++){
            boolean b = false;

            for(int j = i; j < arr.length; j++){
                if(arr[i] < arr[j])
                    b = true;
            }
            if(b)
                return false;
        }

        return true;

    }

    public static void main(String [] args){
        // Question : Check if an array is sorted (in ascending or descending order). 

        // Constraints: 
        // Input : First Line of Input Consists of One Integer Value (Array Size). 
        //         Second Line of Input Consists of few Integer Values Separated by Space (Array Elements). 
        // Output : Print the Array is Sorted or Not. 

        // Constraints : 
        //      Array Size must be Greater than 3 or else Print "Invalid Array Size.". 
        //      If the Given Array is sorted print "The Given array is in sorted". 
        //      If the Given Array is not sorted print "The Given array is not sorted". 


        // Explanation: 
        // Input 1 : 6 - Length of the Array 
        //           2 20 21 54 67 78 - Elements 
        // Output 1 : The Given array is sorted in Ascending order. 
        // Explanation :
        //  2 < 20 < 21 < 54 < 67 < 78 - The Given array is sorted in Ascending order. 


        // Input 2 : 4 - Length of the Array 
        //           55 24 13 11 - Elements 
        // Output 2 : The Given array is sorted in Descending order. 
        // Explanation : 
        // 55 > 24 > 13 > 11 - The Given array is sorted in Descending order. 
        
        // Input 3 : 5 - Length of the Array 
        //            12 34 2 43 1 - Elements 
        // Output 2 : The Given array is not sorted. 
        // Explanation : 
        // 12 < 34 > 2 < 43 > 1 - The Given array is not sorted. 

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the size of the array : ");
        int Length = scan.nextInt();

        if(Length < 4){
            scan.close();
            System.out.print("Invalid Array Size.");
            return;
        }

        System.out.println("\nEnter the Element values in the Array : ");
        int arr[] = new int[Length];

        for(int i = 0; i < Length; i++)
            arr[i] = scan.nextInt();

        scan.close();

        if(ascendinggOrder(arr))
            System.out.print("The Given array is SORTED in Ascending order");
        else if (descendingOrder(arr))
            System.out.print("The Given array is SORTED in Descending order");
        else
            System.out.print("The Given array is NOT SORTED");
            

    }
}
