package ArraysPrograms.Search.BinarySearchProblems;

import java.util.ArrayList;
import ArraysPrograms.UserInput.InputUser;

public class FirstLastTarget {
    public static void main(String[] args) {
        // Question : Find the First and Last Index of the Target in the Given Integer Array Input.

        //  ex : arr = [1, 3, 3, 5, 6, 7, 7, 8, 8, 8] target = 7
        //  Answer = [5, 6] : Because 5 in the Starting Index and 6 is the Ending Index of the target present in the Array. 

        //  ex: arr = [8, 8, 8, 7, 7, 6, 3, 3, 3, 1, 1, 0] , target = 8 
        //  answer = [0, 1] : Because 0 is the Starting Index and 1 is the Ending index of the Target present in the Array. 
        
        //  ex: arr = [-9, -7, -7, -3, -1, 2, 2, 2, 5, 5, 8] , target = 2
        //  answer = [5, 6, 7] : Becaue 5 is the Starting index and 7 is the Ending index of the Target present in the Array. 
        
        //  ex: arr = [-9, - 7, -7, -3, -1, 2, 2, 2, 5, 5, 8] , target = 9
        //  answer = -1 : because we dont have any number matching the target. 

        // Constraint:
        // If target is not found in the Array return -1;

        int arr[] = InputUser.IntegerArrayInput();
        int target = InputUser.singleIntegerInput();

        ArrayList<Integer> index = MySolution(arr, target);

        if(index.size() > 1)
            System.out.printf("The Target is present from %d to %d index in the given array.",index.get(0),index.get(index.size() - 1));
        else
            System.out.printf("The Target is present at %d index in the given array.",index.get(0));
            
            
        int []res = LittleOptimisedSolution(arr, target);
        
        if(res.length > 1)
            System.out.printf("The Target is present from %d to %d index in the given array.",res[0],res[res.length - 1]);
        else
            System.out.printf("The Target is present at %d index in the given array.",res[0]);

        int []ress = OptimisedSolution(arr, target);
        
        if(ress[0] != -1)
            System.out.printf("The Target is present from %d to %d index in the given array.",ress[0],ress[ress.length - 1]);
        else
            System.out.printf("The Target is not present in the given array.");
    }


    //  I think i used a method just like the two pointers
    public static int[] LittleOptimisedSolution(int []arr, int target){

        boolean isAsc = arr[0] < arr[arr.length - 1];

        if((isAsc && arr[arr.length - 1] < target) || (!isAsc && arr[0] > target)){
            return new int[]{-1};
        }
        
        int start = -1;
        int end = -1;

        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] == target && start == -1)
                start = i;

            if(arr[arr.length - (i + 1)] == target && end == -1)
                end = arr.length - (i + 1);

            if(i > arr.length - i)
                break;
        }

        return new int[]{start, end};

    }


    public static ArrayList<Integer> MySolution(int []arr, int target){
        // This Solution will take 
        //       Time complexity of : O(n) 
        //       Space Complexity of : O(n)

        boolean isAsc = arr[0] < arr[arr.length - 1];
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        
        if((isAsc && arr[arr.length - 1] < target) || (!isAsc && arr[0] > target)){
            indexes.add(-1); 
            return indexes; 
        }
            
        for( int i = 0; i < arr.length; i++ ){
            if(arr[i] == target){
                indexes.add(i);
            }
        }

        return indexes;
    }


    
    public static int[] OptimisedSolution(int []arr, int target){
        int []res = {-1, -1};

        int start = binSearch(arr, target, true);
        int end = binSearch(arr, target, false);
        
        res[0] = start;
        res[1] = end;

        return res;
    }

    public static int binSearch(int []arr, int target, boolean findingFirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else{
                ans = mid;
                if(findingFirstIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}
