package ArraysPrograms.TwoDArrays.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;

public class FindTarget {
    public static void main(String[] args) {
        // Question : Find the Target in the Given row wise & col wise sorted Integer 2D Array Input.

        //  ex : arr = [ [10, 20, 30, 40], [15, 23, 36, 46], [18, 25, 38, 49] ] target = 18
        //  Answer = [2, 0] : Target found at row - 2 and col - 0. 

        //  ex : arr = [ [4, 8, 10], [5, 11, 13], [9, 14, 17] ] target = 15
        //  Answer = -1 : Target not found. 

        //  ex : arr = [ [3, 12, 20, 34], [5, 15, 25, 35], [8, 18, 28, 38], [11, 19, 31, 45] ] target = 31
        //  Answer = [3, 2] : Target found at row - 3 and col - 2. 

        //  ex : arr = [ [1, 7], [2, 9], [3, 10], [5, 21], [6, 34] ] target = 4
        //  Answer = -1 : Target not found. 

        // Constraint:
        // If target is not found in the Array return -1;
        // The 2D array should be sorted in row and column wise.

        System.out.println("Enter the size of the row");
        int arr2D[][] = InputUser.IntegerArrayInput2D();
        System.out.println(arr2D);
    }
}
