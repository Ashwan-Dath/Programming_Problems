package ArraysPrograms.Search.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;

public class PeakMountainArray {
    public static void main(String[] args) {
        // Question : Peak Index in a Mountain Array

        //  ex : arr = [2, 4, 7, 9, 32, 21, 14, 1]
        //  Answer = 5 : Because at 5th Index the Largest Element in the Array is present. 

        //  ex: arr = [4, 8, 21, 65, 87, 98, 102, 123, 93, 21, 0]  
        //  answer = 7 : Because at 7th index the Largest Element in the array is present. 

        int arr[] = InputUser.IntegerArrayInput();

        int index = peakIndexInMountainArray(arr);
        System.out.println("The Peak Element is present at the index "+index);

    }

    public static int peakIndexInMountainArray(int []arr){

        // This logic only works when the array is ascending and descending but not continously having multiple peaks.
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
                // System.out.printf("End %d \n", end);
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }

        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans

        return start; // or return end as both are equal.

    }
}
