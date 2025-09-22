package ArraysPrograms.ArraysLevel1;

import java.util.ArrayList;

import ArraysPrograms.UserInput.InputUser;

public class SubArrays {
    public static void main(String[] args) {
        // Question : Print all the possible sub arrays for a given array

        // ex: Input: [1, 2, 3, 4, 5]
        // output: 1 & 2 & 3 & 4 & 5 - 1
        // 1,2 & 2,3 & 3,4 & 4,5 -2
        // 1,2,3 & 2,3,4 & 3,4,5 - 3
        // 1,2,3,4 & 2,3,4,5 - 4
        // 1,2,3,4,5 - 5

        // ex Input: [23, 43, 64]
        // output: 23, 43, 64 - 1
        // 23, 43 & 43, 64 - 2
        // 23, 43, 64 -3

        int arr[] = InputUser.IntegerArrayInput();

        // MySolution(arr);
        // generateAllSubarrays(arr);
        int z = addingNumbers(arr, 0, 3, 0);
        System.out.println("ADDed"+z);
    }

     public static int searching(int arr[], int k){

        int min = Integer.MAX_VALUE;

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

            // int left = 


            // if(k == arr[mid]){
            //     // System.out.printf("Given K  value is %d, Present at index %d", k, mid);
            //     return mid;
            // }else if(k < arr[mid]){
            //     end = mid - 1;
            // }else{
            //     start = mid + 1;
            // }

            int x = addingNumbers(arr, start, mid, 0);
        }
        return -1;

    }

    public static int addingNumbers(int arr[], int start, int end,int add){ 
        System.out.println("start"+ start); 
        System.out.println("end"+ end); 
        System.out.println("add"+ add); 

        // if(start == end){
        //     return add;
        // }

        if(start < end){ 
            addingNumbers(arr, (start+1), end, add); 
            // addingNumbers(arr, (start+1), end, (arr[start] + arr[start + 1])); 
        } 
        
        if(start == 0) 
            return add; 
    
        add += arr[start];
        // add = start == end ?  arr[start] + arr[start - 1] : ;
        System.out.println("Added" + add);
        // else{ 
            // return (add + arr[end]); 
            // return (arr[start] + arr[start - 1]); 
            return add; 
        // } 
    } 


    public static void MySolution(int arr[]) {
        ArrayList<ArrayList> subArrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                ArrayList<Integer> tempArrayList = new ArrayList<>();
                for (int k = j; k < i + 1; k++) {
                    tempArrayList.add(arr[k]);
                }
                subArrayList.add(tempArrayList);
            }
        }
        System.out.println("ArrList" + subArrayList);
    }



    public static void generateAllSubarrays(int[] arr) {
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                System.out.print("Subarray: ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

}
