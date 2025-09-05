package ArraysPrograms.Search.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;

public class RotatedSortedDuplicateArraySearch {
    public static void main(String[] args) {
        // Question : Finding Index of the Target in a Rotated Sorted Array

        // ex : arr = [12, 12, 12, 12, 0, 4, 6, 12], target = 6
        // Answer = 6 : Because at 6th Index the Target Element is present,

        // ex: arr = [19, 65, 87, 98, 19, 19, 19, 19] target = 87.
        // answer = 2 : Because at 2nd index the Target Element is present

        // ex: arr = [8, 8, 21, 65, 87, 87, 98, 102, 123, 1, 4, 4, 6] target = 99.
        // answer = -1 : Returning -1, because target value is not present in the given


        int arr[] = InputUser.IntegerArrayInput();

        int target = InputUser.singleIntegerInput();

        int index = findTarget(arr, target);

        System.out.println("The Target is present at " + index +" index");
    }

    public static int findTarget(int arr[], int target) {
        int pivot = findPivotDuplicateArray(arr);

        if (arr[pivot] == target)
            return pivot;

        if (pivot == -1) {
            return searchingTarget(arr, target, 0, arr.length - 1);
        }

        if (target > arr[0]) {
            return searchingTarget(arr, target, 0, pivot - 1);
        } else {
            return searchingTarget(arr, target, pivot + 1, arr.length - 1);
        }

    }

    public static int searchingTarget(int arr[], int target, int start, int end) {

        while (start <= end) {

            // int mid = ( start + end ) / 2;
            // int has a range if the range exceeds it will become a problem
            // To overcome this problem we are just applying the simple formula of
            int mid = start + (end - start) / 2;
            // start + (end - start) / 2 =>
            // 2start + (end - start) /2 => in this equation 2start and - start will get
            // cancelled
            // finally we will get start + end / 2

            if (target == arr[mid]) {
                // System.out.printf("Given K value is %d, Present at index %d", k, mid);
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int findPivotDuplicateArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if the pivot is present exactly in the mid then it will definetely be more
            // than its next value
            if (mid != end && arr[mid] > arr[mid + 1])
                return mid;

            // If the pivot is present exactly in the mid - 1 then it will definetely be
            // less than its next values
            if (mid != start && arr[mid] < arr[mid - 1])
                return mid - 1;

            // if the start = mid = end have all the same numbers(duplicates then we have to
            // remove them)
            // ex [6, 8, 10, 6, 0, 1, 6]
            // here start = mid = end, now we have to remove them and check the remaining
            // elements so before removing them
            // we check whether start | end may be the pivot.
            // after removing(changing the start and end to checkt in the array) the array
            // will be like [8, 10, 6, 0] now we find pivot inside this
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Now we have to skip the duplicates
                // Before we remove these elements we first check whether they are pivot or not

                // we are checking whether the start is pivot or not by comparing it with its
                // next element,
                // If the start element itself is greater than its preceding element then
                // obviously the start will be the highest element in the array.
                // so we return start. (Take a sample array and debug it to see the results.)
                if (arr[start] > arr[start + 1])
                    return start;

                start++; // we are moving the start, 1 index forward

                // we are checking whether the end is pivot or not by comparing it with its
                // previous element,
                // If the end element itself is less than its previous element then obviously
                // the end - 1 will be the highest element in the array. Because it has Rotated
                // Array characteristics
                // so we return start. (Take a sample array and debug it to see the results.)
                if (arr[end] < arr[end - 1])
                    return end - 1;

                end--; // we are moving the end, 1 index backward
            }

            // Here we are checking whether the start is < to mid - or else - is start = mid
            // > end if it applies then we have to move the start to mid + 1 to check the
            // right side of the array
            else if (arr[mid] < arr[start] || (arr[mid] == arr[start] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                // Here we don't need to check whether the end is equal to mid - or else - is
                // start = mid = end if it applies then we have to move the end to mid - 1 to
                // check the Left side of the array
                end = mid - 1;
            }
            // // if the pivot is present somewhere in between mid & end then we don't need
            // to check the values present from start to mid
            // // so we are moving our start to mid + 1 so that we can check the pivot in
            // between mid to end.
            // if (arr[start] < arr[mid])
            // start = mid + 1;
            // // if the pivot is present somewhere in between start & mid then we don't
            // need to check the values present from mid to end
            // // so we are moving our end to mid - 1 so that we can check the pivot in
            // between start to mid.
            // else
            // end = mid - 1;
        }
        return -1;
    }
}
