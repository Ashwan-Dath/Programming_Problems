import java.util.Scanner;

public class SimpleArray {
    public static void main(String [] args){

        // Question : Write a Program to read the Array Size and Array Values from the User and Print Array Values?
        // Constraints:
        // Input :      First Line of Input Consists of One Integer Value (Array Size).
        //              Second Line of Input Consists of few Integer Values Separated by Spaces (Array Elements).
        // Output :     Print the All Array Elements.
        // Constraints :   No


        // Example:
        // Input 1 :       8    // Length of the array
        //               86 210 33 73 53 93 848 48  // values
        // Output 1 :    86 210 33 73 53 93 848 48


        // Input 2 :       6
        //                1 2 3 4 5 6
        // Output 2:      1 2 3 4 5 6

        // Input 3 :        5
        //                     5 10 88 2 5
        // Output 3 :     5 10 88 2 5

        Scanner scan = new Scanner(System.in);

        int Length = scan.nextInt();
        int arr[] = new int[Length];
        
        for(int i = 0; i< Length; i++)
            arr[i] = scan.nextInt();

        scan.close();

        for(int i= 0; i<Length; i++)
            System.out.print(arr[i]+" ");
    
    }
}
