import java.util.Scanner;

public class AvgPrimeNumbers {
    public static void main(String [] args){
        
        // Question : Write a Program to Find the average of all Prime Numbers from a Given Array?

        // Constraints:
        // Input :             First Line of Input Consists of One Integer Value (Array Size).
        //                     Second Line of Input Consists of few Integer Values Separated by Space (Array Elements).
        // Output :          Print the Average of All Prime Number from the Array Elements.

        // Constraints :   Array Size must be Greater than 3 or else Print "Invalid Array Size.".
        //                     Print the Average value upto 3 Decimal points.
        //                     All the Given Array Values Must be greater than ONE, or else print "Invalid Array Elements". 
        //                     If there is no Prime Numbers in a Given Array then Print "No Prime Numbers!".


        // Example:
        // Input 1 :       6
        //                     10 02 20 21 11 54
        // Output 1 :    Average of Prime Numbers in a Given Array Elements is 6.500.

        
        // Input 2 :       4
        //                     55 2 3 11
        // Output 2 :    Average of Prime Numbers in a Given Array Elements is 5.333.

        // Explanation:
        // Input 1 :       6
        //                     10 02 20 21 11 54
        // Output 1 :    Average of Prime Numbers in a Given Array Elements is 6.500.
        // Explanation :
        //                     Prime Numbers in a Given Array is 02 11.
        //                     Sum of Prime Numbers in a Given Array Elements = 02 + 11 = 13
        //                     Average of Prime Numbers in a Given Array Elements = 13 / 2 = 6.500.
        

        // Input 2 :       4
        //                     55 2 3 11
        // Output 2 :    Average of Prime Numbers in a Given Array Elements is 5.333.
        // Explanation :
        //                     Prime Numbers in a Given Array is 2 3 11.
        //                     Sum of Prime Numbers in a Given Array Elements = 2 + 3 + 11 = 16
        //                     Average of Prime Numbers in a Given Array Elements = 16 / 3 = 5.333.

        Scanner scan = new Scanner(System.in);

        int Length = scan.nextInt();
        int arr[] = new int[Length];

        for(int i = 0; i < Length; i++)
            arr[i] = scan.nextInt();
        
        scan.close();

        float sum = 0;
        float count = 0;

        for(int i = 0;i < Length; i++){
            boolean b = true;
            for(int j = 2; j < Math.sqrt(arr[i]); j++){
                if( arr[i] % j == 0){
                    b = false;
                    break;
                }
            }
            if(b && arr[i] != 1){
                sum += arr[i];
                count++;
            }
        }

        System.out.printf("Average of Prime Numbers in a Given Array Elements is %.3f.",((float)sum/count));

    }
}
