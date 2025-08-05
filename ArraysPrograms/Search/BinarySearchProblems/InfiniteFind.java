package ArraysPrograms.Search.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;

public class InfiniteFind {
    public static void main(String[] args) {
        // Question : Find position of an element (target) in a sorted array of infinite numbers

        //  ex : arr = [1, 3, 3, 5, 6, 7, 7, 8, 8, 8, ........] target = 7
        //  Answer = 5 : Because 5 in the Index of the target present in the Array. 

        //  ex: arr = [8, 7, 6, 2, 0, -1, -3, -7, -9, -23, - 56, .......] , target = 10 
        //  answer = -1 : Because There is no value present in the array that matches the target. 
        
        //  ex: arr = [-9, -7, -3, -1, 2, 5, 6, 8, 98, 124, 234, 342, 532, 533, 543,.....] , target = 543
        //  answer = 15: Becaue 15 is the index of the target present in the array. 
        
        //  ex: arr = [-9, - 7, -7, -3, -1, 2, 2, 2, 5, 5, 8, 23, 34, 36, ......] , target = 98
        //  answer = x : because x will the index of the given target number present in the infinite number array. 

        // Constraint:
        // If target is not found in the Array return -1;
        // Don't use the array.length to find the length, imagine like the array has infinite numbers

        System.out.println("\nJust Imagine the array will have infinite number in the array");
        int arr[] = InputUser.IntegerArrayInput();
        int target = InputUser.singleIntegerInput();

        int index = MySolution(arr, target);

        System.out.printf("The Target Present At Index %d in the Given Array",index);
        // int index = recursiveMethod(arr, target, 2, 6);

        // System.out.printf("The Target Present At Index %d in the Given Array",index);

    }

    public static int MySolution(int arr[], int target){

        int start = 0;
        int end = 2;
        int index = -2;
        while (index != -3) {
            System.out.printf("\nMy Solution : Start - %d, End : %d\n", start, end);
            
            int ind = recursiveMethod(arr, target, start, end);
            
            System.out.printf("My Solution : Ind - %d\n", ind);
            
            if(ind == -1){
                System.out.printf("My Solution : Ind == -1\n");
                start = end;
                end += end;
            }else{
                System.out.printf("My Solution : Return Ind : %d\n",ind);
                return ind;
            }

        }

        return -1;
    }

    public static int recursiveMethod(int arr[], int target, int start, int end){
        
        while(start <= end){
            System.out.printf("\nStart : %d, End: %d", start, end);
            int mid = start + (end - start) / 2;
            System.out.printf("\n Mid : %d", mid);
            
            if(target == arr[mid]){
                System.out.printf("\n target == arr[mid] : %d", mid);
                // System.out.printf("Given K  value is %d, Present at index %d", k, mid);
                return mid;
            }else if(target < arr[mid]){
                System.out.printf("\n target < arr[mid] end : %d", end);
                end = mid - 1;
            }else{
                System.out.printf("\n target > arr[mid] start : %d", start);
                start = mid + 1;
            }

        }
        return -1;

    }
}
