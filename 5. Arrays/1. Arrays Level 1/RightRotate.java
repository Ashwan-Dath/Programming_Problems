import java.util.Scanner;

public class RightRotate {
    
        public static int[] shiftingArray(int []arr){ 

        int dup = arr[arr.length-1]; 

        for(int i = arr.length-1; i >= 0 ; i--){
            if(i == 0){
                arr[i] = dup;
            }else{
                arr[i] = arr[i-1];
            }
        }
        return arr;
    } 

    public static void main(String [] args){
        // Question :   Write a Program to find the Sum of Numbers upto the Given Key Value(index) in a Given Array.
        // Constraints:
        // Input :      First Line of Input Consists of One Integer Value (Array Size).
        //              Second Line of Input Consists of few Integer Values Separated by Spaces (Array Elements).
        // Output :         Print the sum of numbers upto the given key value (index).
        // Constraints :    Array Size must be greater than 3 or else Print "Invalid Array Size.".                  

        // Example:
        // Input 1 :        9
        //                  5 8 9 13 15 28 3 47 56
        // Output 1 :    The Given Array is : 5 8 9 13 15 28 3 47 56
        //               Left Rotated Array : 56 5 8 9 13 15 28 3 47
        // Explanation :
        // Here Left rotating the values for 1 index value forware like
        // 5 8 9 13 15 28 3 47 56 -->  56 5 8 9 13 15 28 3 47
        //          |                           |
        //     Given Array              Left rotated array (Shifted 1 index to the left)
        
        // Input 2 :       5
        //                 8 2 7 54 89
        // Output 2 :   The Given Array is : 8 2 7 54 89
        //              Left Rotated Array : 89 8 2 7 54
        // Explanation :
        // Here Left rotating the values for 1 index value forware like
        //      8 2 7 54 89      -->     89 8 2 7 54
        //          |                           |
        //     Given Array              Left rotated array (Shifted 1 index to the left)
        

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter the Length of the Array");
        int Length = scan.nextInt();
        int arr[] = new int[Length];

        System.out.println("Enter "+Length+" values");
        for(int i = 0; i < Length; i++)
            arr[i] = scan.nextInt();

        scan.close();

        arr = shiftingArray(arr);

        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i]+" ");
    }

}


