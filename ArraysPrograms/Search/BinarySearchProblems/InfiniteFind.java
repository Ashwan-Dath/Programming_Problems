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

        // int index = MySolution(arr, target);
        
        // System.out.printf("The Target Present At Index %d in the Given Array",index);
        // int index = recursiveMethod(arr, target, 2, 6);
        
        // System.out.printf("The Target Present At Index %d in the Given Array",index);
        
        int OptimisedIndex = LearntNewWritingCode(arr, target);
        
        System.out.printf("The Target Present At Index %d in the Given Array",OptimisedIndex);
    }

    // Learnt New Solution in the same way but writing code is little bit different
    // In this method i am only checking that array where my target will present because
    // i am checking the arr[end] will be greater than target. That is where we find our target 
    // present in the 
    public static int LearntNewWritingCode(int []arr, int target){
        // Imagining the start and end will be of the size of 2.
        int start = 0;
        int end = 1;

        // Checking whether the given element is greater than the end means 
        // the target will be present in the infinite array or else the
        // target will not present in the array.
        while(target > arr[end]){
            // Moving start to the forward of the end to move the searching values.
            int tempStart = end + 1;
            // Doubling the box size for every loop
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }

        return findTargetIndex(arr, target, start, end);
    }

    public static int findTargetIndex(int []arr, int target, int start, int end){
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }







    // My Logic I created the solution.
    // In this logic i am always running binary search for every array i created
    // But the above code only runs the binary search only when the target is present in the 
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
