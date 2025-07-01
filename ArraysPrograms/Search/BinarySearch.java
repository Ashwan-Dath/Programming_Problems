package ArraysPrograms.Search;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String [] args){
        
        //  Binary Search To find value        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = scan.nextInt();

        int nums[] = new int[size];

        for(int i = 0; i < size; i++)
            nums[i] = scan.nextInt();

        int k = scan.nextInt();

        scan.close();
        searching(nums, k);
    }

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
}
