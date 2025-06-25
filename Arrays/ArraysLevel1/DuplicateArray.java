package  Arrays.ArraysLevel1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

    public static void main(String[] anything){
        // Question:  Given an integer array number nums, return true if any value appears at least twice in the array 
        //              and return false if every element is distinct.

        // Output: Return true or false based on the presence of duplicate elements.

        // Example 1: 
        //  Input : prices = [7, 1, 5, 3, 6, 4]
        //  output: False
        // Explain: No element is duplicate so return "FALSE"

        // Example 2: 
        //  Input : prices = [1, 6, 4, 3, 1]
        //  output: True
        // Explain: 1 is present two times so duplicate is present. So return "True".

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++)
            arr[i] = scan.nextInt();
        
        scan.close();

        boolean solutionOne = MySolution(arr);    // This is my solution

        System.out.println(solutionOne);
        // System.out.println();
        
        boolean solutionTwo = SortingSolution(arr);
        System.out.println(solutionTwo);
        
        
        boolean solutionThree = optimalSolution(arr);   // Learnt a new way of solution.
        System.out.println(solutionThree);
    }


    public static boolean MySolution(int []arr){
        // In this way the time and space complexity are
        //  Time : O(n^2)
        // Space : O(1), we are not storing any value.
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1 ; j < arr.length; j++){
                if(arr[i]== arr[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean SortingSolution(int []arr){
        // Time complexity = O( n log N)
        //  sorting takes nLOGn times and later we are iterating through array so O(n)
        // Total O(n Log n)
        // Space complexity : O(1) because we are not storing any value.
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(i < arr.length - 1 && arr[i]==arr[i+1])
                return true;
        }
        return false;
    }

    public static boolean optimalSolution(int []arr){
        // Time complexity will be O(n)
        // Because we only iterate through the array once and we keep on adding the values in Hashset
        // If we find any value in the HashSet we are returning the value, it will only take O(1) time for searching anything in the HashSet.
        // Space : O(1) using HashSet to store the array values.

        Set<Integer> Values = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(Values.contains(arr[i])){
                return true;
            }else{
                Values.add(arr[i]);
            }
        }

        return false;
    } 

    
}
