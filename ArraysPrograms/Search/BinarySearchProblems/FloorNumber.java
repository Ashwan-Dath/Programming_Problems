package ArraysPrograms.Search.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;

public class FloorNumber {
    public static void main(String[] args) {
        // Question : Find the greatest element in array smaller than or equal to the target

        // ex : arr = [2, 4, 5, 7, 7, 9, 12, 45, 75, 86, 87, 93] target = 24
        //  Answer = 12, Because 12 is the greatest element that is smaller than equal to the targert.

        // ex: arr = [98, 76, 54, 34, 23, 21, 14, 12, 6, 3, 1] , target = 19
        //  answer = 14, Because 14 is the greatest element that is smaller than or equal to the target.

        int arr[] = InputUser.IntegerArrayInput();
        int target = InputUser.singleIntegerInput();

        // int index = bruteForce(arr, target);
        // System.out.println("Answer From Brute Force : " + index);
        int indexx = optimalSolution(arr, target);
        System.out.println("Answer From Optimal Code : " + indexx);

    }


    public static int optimalSolution(int []arr, int target){
        
        boolean isAsc = arr[0] < arr[arr.length - 1];

        
        if(isAsc){
            // If the target is less than the starting number then there will be no floor number for the target in Ascending order so returning -1
            if(arr[0] > target)
            return -1;
        }
        else{
            // If the target is greater than the starting number then there will be no floor number for the target in Descending order so returning -1
            if(arr[arr.length - 1] > target)
                return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target)
            {
                System.out.println("Mid return"+ mid);
                return end;
            }else if(arr[mid] > target){
                System.out.println("Asc arr[mid] > target"+ arr[mid] + target);
                end = mid - 1;
            }
            else{
                System.out.println("Asc arr[mid] < target"+ arr[mid] + target);
                start = mid + 1;
            }
        }



        return end;
    }




    public static int bruteForce(int []arr, int target){
        
        boolean isAsc = arr[0] < arr[arr.length - 1];
        //  Checking Whether the Array is in Ascending or Descending in ORDER..

        int index = 0;
        int num;

        if(isAsc){
            
            // If the target is less than the starting number then there will be no floor number for the target in Ascending order so returning -1
            if(arr[0] > target)
            return -1;
            
            num = Integer.MIN_VALUE;
        }
        else{
            
            // If the target is greater than the starting number then there will be no floor number for the target in Descending order so returning -1
            if(arr[arr.length - 1] > target)
                return -1;

            num = Integer.MAX_VALUE;
        }
        

        for(int i = 0; i < arr.length; i++){
            
            if(isAsc){
                if( arr[i] <= target && num <= target){
                    num = arr[i];
                    index = i;
                }
            }else{
                if(arr[i] <= target && num >= target){
                    num = arr[i];
                    index = i;
                }
            }

        }

        return index;
    } 


}
