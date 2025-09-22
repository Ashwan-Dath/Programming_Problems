package ArraysPrograms.Search.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;

public class MinSumInSubArray {
    public static void main(String[] args) {
        // Question : Given array nums which consists non-negative integers and an integer m,
        //            you can split the array into m non-empty continuous subarray

        // Ex: Input nums = [7,2,5,10,8],   m = 2
        // Output = 18.
        // Explanation: 
        // There are four ways to split nums into two subarrays, because m = 2
        // [7], [2 + 5 + 10 + 8] => Sum => 7,  25 -> max number in both numbers => 25
        // [7 + 2], [5 + 10 + 8] => Sum => 9,  23 -> max number in both numbers => 23
        // [7 + 2 + 5], [10 + 8] => Sum => 14,  18 -> max number in both numbers => 18
        // [7 + 2 + 5 + 10], [8] => Sum => 24,  8 -> max number in both numbers => 24
        // So in max sum of all the subarrays that is = 25, 23, 18, 24 => So min sum value is 18.
        // 18 => [7 + 2 + 5], [10 + 8].
       
        
        // Ex: Input nums = [19, 3, 23, 5, 1],   m = 1
        // Output = 51.
        // Explanation: 
        // There is only 1 ways to split nums into two subarrays, because m = 1
        // [19 + 3 + 23 + 5 + 1] =>  51 
        // So in max sum of all the subarrays that is = 51 => So min sum value is 51.
        // [19 + 3 + 23 + 5 + 1] =>  51 .
        

        // Ex: Input nums = [5, 23, 53, 1, 2],   m = 3
        // Output = 53.
        // Explanation: 
        // There are four ways to split nums into two subarrays, because m = 2
        // [5] , [23 + 53], [1 + 2] => Sum => 5, 76, 3  => max number in both numbers => 76
        // [5] , [23 + 53 + 1], [2] => Sum => 5, 77, 2  => max number in both numbers => 77
        // [5] , [23], [53 + 1 + 2] => Sum => 5, 23, 56 => max number in both numbers => 56
        // [5 + 23], [53], [1 + 2]  => Sum => 28, 53, 3 => max number in both numbers => 53
        // [5 + 23], [53 + 1], [2]  => Sum => 28, 54, 2 => max number in both numbers => 54
        // [5 + 23 + 53], [1], [2]  => Sum => 82, 1, 2  => max number in both numbers => 82
        // So in max sum of all the subarrays that is = 76, 77, 56, 53, 54, 82 => So min sum value is 53.
        // 53 => [5 + 23], [53], [1 + 2].

        int arr[] = InputUser.IntegerArrayInput();
        int split = InputUser.singleIntegerInput();

        int value = maxValue(arr, split);
        
        System.out.println("Min Sum of Sub Array " + value);

    }

    static int maxValue(int []arr, int split){

        int min = 0;
        int max = 0;

        for(int i =0; i < arr.length; i++){
            min = Math.max(min, arr[i]);
            max += arr[i];
        }

        System.out.println("MIN"+min);
        System.out.println("MAX"+max);

         while (min < max) {
            int mid = min + (max - min) / 2;
            int sum = 0;
            int pieces = 1;
            for(int i = 0; i < arr.length; i++){
                if(sum + arr[i] > mid){
                    sum = arr[i];
                    pieces++;
                }else{
                    sum+=arr[i];
                }
            }

            if(pieces <= split){
                max = mid;
            }else{
                min = mid + 1;
            }
        }
        return min;
    }
}
