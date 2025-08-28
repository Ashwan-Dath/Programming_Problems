package MyOwnQuestions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UniqueRandomPickerRange {
    public static void main(String[] args) {
        // Question : Random Numbers Picker in a ranges
        // if i give a range [1, 2, 3, 4, 5, 6, 7, 9, 10]
        // it has to generate the random numbers within the range but everytime the number has to be unique
        // means if 2 comes at 1st time then it should not come again when generating another number
        // The output should come as [3, 8, 1, 4, 6, 9, 2, 5, 10, 7] ( unique random numbers in the range)

        // ex1  : start = 1, end = 10
        //  output [7, 1, 10, 5, 8, 6, 4, 9, 2, 3]

        // ex2 : start = 11, end = 20
        // output: [19, 12, 15, 20, 17, 14, 11, 18, 13, 16]

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the Range Starting Number : ");
        int start = input.nextInt();

        System.out.println("Enter the Range Ending Numbesr : ");
        int end = input.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        // ArrayList<Integer> numbersVerification = new ArrayList<>();


        for(int i = start; i <= end; i++){
            numbers.add(i);
        }
        System.out.print("[ ");
        for(int i = 0; i < numbers.size(); i++){
            System.out.printf("%d, ", numbers.get(i));
        }
        
        Random rand = new Random();
        System.out.println("]");
        System.out.print("[ ");

        while (numbers.size() != 0) {
            int value = rand.nextInt(numbers.size());
            System.out.printf("%d, ", numbers.get(value));
            numbers.remove(value);
            // if(numbers.size() == 0)
            //     System.out.printf("] \nThere are no Values Present in the array.");
        }

        input.close();

        System.out.print(" Size" + numbers);
    }
}
