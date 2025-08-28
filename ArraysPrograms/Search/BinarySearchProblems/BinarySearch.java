package ArraysPrograms.Search.BinarySearchProblems;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String [] args){
        
        //  Binary Search To find value        
        Scanner scan = new Scanner(System.in);

        System.out.printf("\nEnter the size of the array : ");
        int size = scan.nextInt();

        int nums[] = new int[size];

        for(int i = 0; i < size; i++)
            nums[i] = scan.nextInt();

        System.out.print("Enter the Target value : ");
        int k = scan.nextInt();

        scan.close();
        int index = orderAgnosticBinarySearch(nums, k);
        System.out.printf("index %d",index);
        // // searching(nums, k);
        // int index = arrayAgnosticBinarySearch(nums, k);
        // System.out.printf("The Target is present at index %d", index);

    }

    // This method only works for the Ascending Order Array search
    public static int searching(int arr[], int k){

        int start = 0;
        int end = arr.length-1;
        while(start < end){
            
            // int mid = ( start + end ) / 2;
            // int has a range if the range exceeds it will become a problem
            // To overcome this problem we are just applying the simple formula of
            int mid = start + (end - start) / 2;
            // start + (end - start) / 2 =>
            // 2start + (end - start) /2 => in this equation 2start and - start will get cancelled
            // finally we will get start + end / 2


            if(k == arr[mid]){
                // System.out.printf("Given K  value is %d, Present at index %d", k, mid);
                return mid;
            }else if(k < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return -1;

    }

    //  This method will return the index of the value present in the array
    public static int orderAgnosticBinarySearch(int arr[], int target){

        boolean isAsc = arr[0] < arr[arr.length - 1];

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if(mid == target){
                System.out.println("Mid "+ mid);
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target){
                    end = mid + 1;
                } else {
                    start = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    end = mid + 1;
                } else {
                    start = mid - 1;
                }
            }

        }
        return -1;
    }
}
