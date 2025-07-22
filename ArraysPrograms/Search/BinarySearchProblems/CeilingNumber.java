package ArraysPrograms.Search.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;

public class CeilingNumber {
    public static void main(String[] args) {
        // Question : Find the smallest element in array greater than or equal to the target

        // ex : arr = [2, 4, 5, 7, 7, 9, 12, 45, 75, 86, 87, 93] target = 24
        //  Answer = 45  Because 45 is the smalles element that is greater than equal to the targert.

        // ex: arr = [98, 76, 54, 34, 23, 21, 14, 12, 6, 3, 1] , target = 19
        //  answer = 21 becaue 21 is the smallest element that is greater that or equal to the target.
        int arr[] = InputUser.IntegerArrayInput();
        int target = InputUser.singleIntegerInput();

        int index = bruteForce(arr, target);
        System.out.println("Answer From Brute Force : " + index);
        int indexx = optimalSolution(arr, target);
        System.out.println("Answer From Optimal Code : " + indexx);
    }

    public static int optimalSolution(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        boolean isAsc = arr[start] < arr[end];

        if((isAsc && target > arr[end]) || (!isAsc && target < arr[start]) ){
            return -1;
        }
        // else if (!isAsc && target < arr[start]);{

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                return mid;
            } else if (isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return isAsc ? start : end;
    }


    public static int bruteForce(int []arr, int target){

        boolean isAsc = arr[0] < arr[arr.length - 1];
        int num;
        int index = -1;
        if(isAsc)
            num = Integer.MIN_VALUE;
        else
            num = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            
            if( isAsc ){
                if(arr[i] >= target && num <= target){
                    index = i;
                    num = arr[i];
                } 
                continue;
            }else if( arr[i] >= target && target <= num){
                index = i;
                num = arr[i];
            }
        }
        
        return index;

    }

}