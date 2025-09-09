package ArraysPrograms.ArraysLevel1;

import java.util.ArrayList;

import ArraysPrograms.UserInput.InputUser;

public class SubArrays {
    public static void main(String[] args) {
        // Question : Print all the possible sub arrays for a given array

        // ex: Input: [1, 2, 3, 4, 5]
        // output: 1 & 2 & 3 & 4 & 5 - 1
        //         1,2 & 2,3 & 3,4 & 4,5 -2
        //         1,2,3 & 2,3,4 & 3,4,5 - 3
        //         1,2,3,4 & 2,3,4,5 - 4
        //         1,2,3,4,5 - 5 

        // ex Input: [23, 43, 64]
        // output: 23, 43, 64 - 1
        //         23, 43  &  43, 64 - 2
        //         23, 43, 64 -3 

        int arr[] = InputUser.IntegerArrayInput();

        MySolution(arr);

    }

    public static void MySolution(int arr[]){
        
        ArrayList<ArrayList> subArrayList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i+1; j++){
                ArrayList<Integer> tempArrayList = new ArrayList<>();
                for(int k = j; k < i+1 ; k++){
                    tempArrayList.add(arr[k]);
                }
                subArrayList.add(tempArrayList);
            }
        }
        System.out.println("ArrList" + subArrayList);
    }
}
