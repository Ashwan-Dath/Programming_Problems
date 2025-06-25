package  Arrays.ArraysLevel1;

import java.util.*;
public class TwoSum
{
	public static void main(String[] args) {
        // Question :  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        // You may assume that each input would have exactly one solution, and you may not use the same element twice.
        // You can return the answer in any order.
        // Example 1:
        // Input: nums = [2, 7, 11, 15], target = 9
        // Output: [0, 1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        // Example 2:
        // Input: nums = [3, 2, 4], target = 6
        // Output: [1, 2]
        // Example 3:
        // Input: nums = [3, 3], target = 6
        // Output: [0, 1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        

        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nEnter the size of the Array : ");
        int size = scan.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("\nEnter the Elements in the Array : ");
        for(int i =0; i < size; i++)
            arr[i] = scan.nextInt();
            
        
        System.out.println("\nEnter the Target Value in the Array : ");
        int target = scan.nextInt();
        
        findingIndices(arr, target);

        int x[] = usingHashMap(arr, target);

        for(int i = 0; i<x.length; i++)
            System.out.printf("%d ",x[i]);
	}
	

    //  My Solution :
	public static void findingIndices(int []arr, int target){
	    //  Time Complexity : O(n^2)
	    //  Space Complexity : O(1)
	    aa:
	    for(int i = 0; i < arr.length; i++){
	        for(int j = 0; j < arr.length; j++){
	            if(i != j){
	                if(arr[i] + arr[j] == target){
	                    System.out.printf("The Index value of %d[%d], %d[%d] combines to form the target value : %d",i,arr[i],j,arr[j],target);
	                    break aa;
	                }
	            }
	        }
	    }
	}


    // Optimal solution
    public static int[] usingHashMap(int []arr, int target){

        Map<Integer, Integer> storingValueToFetch = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++){
            int difference = target - arr[i];   // Getting the Difference To find whether the diff is present in the array or not
            if(storingValueToFetch.containsKey(difference)){
                return new int[]{storingValueToFetch.get(difference), i};
            }
            storingValueToFetch.put(arr[i], i);
        }
        return new int[]{-1, -1}; // Return [-1, -1] if no solution is found
    }


}