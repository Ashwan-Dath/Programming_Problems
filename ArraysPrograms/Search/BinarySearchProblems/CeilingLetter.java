package ArraysPrograms.Search.BinarySearchProblems;

import ArraysPrograms.UserInput.InputUser;

public class CeilingLetter {
    public static void main(String[] args) {
        // Question : Find the smallest Letter Greater Than Target in a char array.

        // ex : arr = ['c', 'f', 'j'] target = 'a'
        //  Answer = 'c'  Because 'c' is the smallest element that is greater than the target.

        // ex: arr = ['c', 'f', 'j'] , target = 'd'
        //  answer = 'f' becaue 'f' is the smallest element that is greater than the target.
        
        // ex: arr = ['z', 'm', 'k', 'd', 'a'] , target = 'd'
        //  answer = 'k' becaue 'k' is the smallest element that is greater than the target.

        // Constraint:
        // If target === 'z' and letter === ['a', 'b'] the answer is 'a'.
        //  Because ther is no greater value than 'z' so arr[0] will be the answer
        
        char []arr = InputUser.CharacterArrayInput();
        
        char target = InputUser.singleCharacterInput();
        int index = optimalSolution(arr, target);
        System.out.println(arr[index]);
    }

    public static int optimalSolution(char arr[], char target){
        boolean isAsc = arr[0] < arr[arr.length - 1];

        int start = 0;
        int end = arr.length - 1;
        System.out.println(arr[end]<target);
        
        if(isAsc){
            if(arr[end] < target){
                System.out.println("arr[end] < target");
                return 0;
            }
        }else{
            if(arr[0] < target){
                System.out.println("arr[0] < target");
                return end;
            }
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }


        return start;
    }

}
