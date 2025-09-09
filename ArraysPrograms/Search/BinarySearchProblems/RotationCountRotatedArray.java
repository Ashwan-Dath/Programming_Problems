package ArraysPrograms.Search.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;

public class RotationCountRotatedArray {
    public static void main(String[] args) {
        // Question :  find the number of elements that are rotated in the rotated array
        
        // ex:
        // Input : [15, 18, 2, 4, 6]
        // output : 2 - Because, after 2 elements the array started like 15, 18 are placed in front of 2, 4, 6 so two elements came forward

        
        // Input : [34, 55, 66, 78, 94, 103, 0, 3, 12, 18, 23, 29] 
        // output : 6 - Because, after 6 elements the array started, like 34, 55, 66, 78, 94, 103 are placed in front of 0, 3, 12, 18, 23, 29 so 6 elements came forward

        // Input : [12, 19, 34, 55, 59, 66, 78, 109 ] 
        // output : -1 - Because, the array is not rotated
        
        int arr[] = InputUser.IntegerArrayInput();

        int index = findPivot(arr);

        System.out.println(index + " are the elements rotated in the array.");

    }

     public static int findPivot(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if the pivot is present exactly in the mid then it will definetely be more than its next value
            if (mid != end && arr[mid] > arr[mid + 1])
                return mid;

            // If the pivot is present exactly in the mid - 1 then it will definetely be less than its next values
            if (mid != start && arr[mid] < arr[mid - 1])
                return mid - 1;

            //  if the pivot is present somewhere in between mid & end then we don't need to check the values present from start to mid
            //  so we are moving our start to mid + 1 so that we can check the pivot in between mid to end.
            if (arr[start] < arr[mid])
                start = mid + 1;
            //  if the pivot is present somewhere in between start & mid then we don't need to check the values present from mid to end
            //  so we are moving our end to mid - 1 so that we can check the pivot in between start to mid.
            else
                end = mid - 1;
        }
        return -1;
    }

}
