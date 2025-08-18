package ArraysPrograms.Search.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;
import ArraysPrograms.Search.BinarySearchProblems.PeakMountainArray;

public class TargetMountainArray {
    public static void main(String[] args) {
        // Question : Finding Index of the Target in a Mountain Array

        // ex : arr = [2, 4, 7, 9, 32, 21, 14, 4, 1], target = 4
        // Answer = 1 : Because at 1st and 7th Index the Target Element is present,
        // Returning the minimum index, which is 1.

        // ex: arr = [4, 8, 21, 65, 87, 98, 102, 123, 93, 0] target = 21.
        // answer = 2 : Because at 2nd index the Target Element is present, returning
        // the index value that is 2.

        // ex: arr = [4, 8, 21, 65, 87, 98, 102, 123, 93, 0] target = 96.
        // answer = -1 : Returning -1, because target value is not present in the given
        // array.

        int arr[] = InputUser.IntegerArrayInput();

        int target = InputUser.singleIntegerInput();

        int Peak = PeakMountainArray.peakIndexInMountainArray(arr);

        System.out.println("Peak" + Peak);

        int index = findingTarget(arr, target, Peak);

        System.out.printf("Target is present at index %d in the Given Array.", index);
    }

    public static int findingTarget(int[] arr, int target, int Peak) {

        int index = -1;

        index = binarySearchInRange(arr, target, 0, Peak);
        if (index == -1)
            index = binarySearchInRange(arr, target, Peak+1, arr.length - 1);

        return index;
    }

    public static int binarySearchInRange(int[] arr, int target, int starting, int ending) {
        System.out.printf("start %d - End %d \n", starting, ending);

        boolean isAsc = arr[starting] < arr[ending];

        int start = starting;
        int end = ending;
        // while(start <= end){

        // // int mid = ( start + end ) / 2;
        // // int has a range if the range exceeds it will become a problem
        // // To overcome this problem we are just applying the simple formula of
        // int mid = start + (end - start) / 2;
        // System.out.printf("Mid : %d, Start: %d, End: %d \n", mid, start, end);
        // // start + (end - start) / 2 =>
        // // 2start + (end - start) /2 => in this equation 2start and - start will get
        // cancelled
        // // finally we will get start + end / 2

        // if(target == arr[mid]){
        // System.out.printf("Entered Mid %d \n",arr[mid]);
        // return mid;
        // }else if(target < arr[mid]){
        // end = mid - 1;
        // }else{
        // start = mid + 1;
        // }

        // }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // System.out.println("mid "+ mid);
            System.out.printf("Mid : %d, Start: %d, End: %d \n", mid, start, end);

            if (arr[mid] == target) {
                return mid;
            } else if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;

    }

}
