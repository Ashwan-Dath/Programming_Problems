package ArraysPrograms.TwoDArrays.BinarySearchProblems;

import java.lang.annotation.Target;
import java.util.Scanner;
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

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the row of the Array : ");
        int row = sc.nextInt();
        System.out.print("Enter the column of the Array : ");
        int col = sc.nextInt();

        int arr2D[][] = InputUser.SortedRowAndColWiseIntegerArrayInput2D(row, col);

        int target = InputUser.singleIntegerInput();

        // int indexes[] = IterativeSolution(arr2D, target);

        // if(indexes == null)
        //     System.out.println("Target Not Found in the given 2D Array.");
        // else
        //     System.out.println("Target Found in the given 2D Array at Indexes :" + indexes[0] + " " + indexes[1]);

        OptimisedSolution(arr2D, target, row, col);

        sc.close();
    }


    public static int[] IterativeSolution(int [][]arr, int target){
        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target)
                {
                    // System.out.println("Target Found at index : "+ i + " " + j);
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static int[] OptimisedSolution(int [][]arr, int target, int row, int col){
        
        // int rowStart = 0;
        // int rowEnd = row;
        
        // int colStart = 0;
        // int colEnd = col;
        // int lowBound = arr[0][0];
        int lowBound = 0;
        int uppBound = arr[0].length - 1;
        // int uppBound = arr[arr.length - 1][arr[0].length - 1];

        System.out.println("LowB : " + lowBound);
        System.out.println("uppBound : " + uppBound);
        
        int mid = lowBound + (uppBound - lowBound) / 2;
        System.out.println("Mid : " + mid);
        // return null;
        
        
        while (lowBound > uppBound) {
            int midd = lowBound + (uppBound - lowBound) / 2;
            System.out.printf("\nMid : %d, lowBOund : %d, UppBo : %d" ,midd, lowBound, uppBound);
            // return 
            if(target == arr[lowBound][midd]){
                System.out.println("Target found"+ midd + " " + lowBound);
            }
            if(target > arr[lowBound][midd]){
                System.out.println("Target > "+ midd + " " + lowBound);
            }
        }
        return null;

        // while(rowEnd < rowStart || colEnd < colStart) {
        //     int rowMid = rowStart + (rowEnd - rowStart) / 2;
        //     int colMid = colStart + (colEnd - colStart) / 2;

        //     if(target == arr[rowMid][colMid]){
        //         return new int[]{rowMid, colMid};
        //     }

        //     if(){

        //     }

            
        // }
        // return null;
    }

}
