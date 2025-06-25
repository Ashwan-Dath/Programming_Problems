package  Arrays;

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

    public static void searching(int arr[], int k){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + end / 2;
            // System.out.printf("mid %d, start %d, end %d\n", mid, start, end);
            if(k == arr[mid]){
                System.out.printf("Given K  value is %d, Present at index %d", k, mid);
                return;
            }else if(k < arr[mid]){
                end = mid;
            }else{
                start = mid;
            }
        }
    }
}
