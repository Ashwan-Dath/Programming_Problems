import java.util.Scanner;

public class SumOfArray {
    public static void main(String [] args){
        // Write a Program to find the Sum of Numbers upto the Given Key Value(index) in a Given Array.
        // Constraints:
        // Input :              First Line of Input Consists of One Integer Value (Array Size).
        //                         Second Line of Input Consists of few Integer Values Separated by Spaces (Array Elements).
        //                         Third Line of Input consists of One Integer value (Key value).
        // Output :           Print the sum of numbers upto the given key value (index).
        // Constraints :    Array Size must be in the Range of 1 and 10 or else Print "Invalid Array Size.".
        //                         Key Value must be greater than or equal to 0 and less than the Array size or else Print "Invalid Key Value.".

        // Example:
        // Input 1 :        9
        //                     5 8 9 13 15 28 3 47 56
        //                     4
        // Output 1 :    50

        
        // Input 2 :       5
        //                     18 2 7 54 89
        //                     0
        // Output 2 :   18

        // Explanation:
        // Input 1 :        9
        //                     5 8 9 13 15 28 3 47 56
        //                     4
        // Output 1 :    50
        // Explanation :
        // Here Key Value is 4 that means we Have to add the Elements from 0th Index to 4th Index
        // 5 + 8 + 9 + 13 + 15 = 50 
        // So we have to Print Output as 50

        // Input 2 :       5
        //                     18 2 7 54 89
        //                     0
        // Output 2 :   18
        // Explanation :
        // Here Key Value is 0 that means we Have to add the Elements from 0th Index to 0th Index
        // In 0th Index we Have Element Value 18, So we Have to Print Output as 18

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter the Length of the Array");
        int Length = scan.nextInt();
        int arr[] = new int[Length];

        System.out.println("Enter "+Length+" values");
        for(int i = 0; i < Length; i++)
            arr[i] = scan.nextInt();

        System.out.println("Enter the index value to add the values");
        int index = scan.nextInt();
        
        scan.close();

        if(index>Length){
            System.out.println("Index value is greater than Length of the array");
            return;
        }

        int sum = 0;
        
        for(int i=0; i<=index; i++)
            sum += arr[i];

        System.out.println("The Sum of the value upto the "+index+" index values is : "+sum);

    }
}
