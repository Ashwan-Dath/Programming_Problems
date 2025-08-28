package MyOwnQuestions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class RandomSequenceGenerator {
    public static void main(String[] args) {

        // 1. Random Numbers Picker in a range
            // if i give a range [1, 2, 3, 4, 5, 6, 7, 9, 10]
            // it has to generate the random numbers within the range but everytime the number has to be unique
            // means if 2 comes at 1st time then it should not come again when generating another number
            // The output should come as [3, 8, 1, 4, 6, 9, 2, 5, 10, 7]
        
        // 2. Generate Numbers with combination of alphabets and numbers with range
            // if i give input as 'a' and 'e' letters and 1 and 3 numbers
            // Then it has to generate the number in a sequence of
            // [ [a1, a2, a3], 
            //   [b1, b2, b3], 
            //   [c1, c2, c3], 
            //   [d1, d2, d3], 
            //   [e1, e2, e3] ] 
            //  or else in a single array
            // [ a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2,d3, e1, e2, e3]

        Scanner input = new Scanner(System.in);

        char start = input.next().charAt(0);

        char end = input.next().charAt(0);

        int starting = input.nextInt();

        int ending = input.nextInt();

        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();
        // for (int i = 1; i <= 10; i++) {
        //     numbers.add(i);
        // }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();


        int outerCount = 0;
        // int innerCount = 0;

        for(int i = (int)start; i <= (int)end; i++ ){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = starting; j <= ending; j++){
                String x= start +""+j;
                numbers.add(x);
                System.out.printf("%s ",x);
            }
            outerCount++;
            start++;
        }

        System.out.println("outerCount" + outerCount);
        // int arr[] = new int[outerCount*end];

        // for(int i = 0; i < outerCount*end; i++){
        //     arr[i] = i+1;
        // }


        // for(int i = 0; i < numbers.size(); i++){
        //     System.out.print(numbers.get(i)+" ");
        // }

        // Random rand = new Random();

        // // Pick and remove random numbers until the list is empty
        // while (!numbers.isEmpty()) {
        //     int randomIndex = rand.nextInt(numbers.size()); // pick random index
        //     String pickedNumber = numbers.remove(randomIndex); // remove and get the number
        //     System.out.println("Picked: " + pickedNumber + ", Remaining size: " + numbers.size());
        // }
    }


//     import java.util.ArrayList;
// import java.util.Scanner;

// public class TwoDArrayListGenerator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Take row and column input from user
//         System.out.print("Enter number of rows: ");
//         int rows = scanner.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = scanner.nextInt();

//         ArrayList<ArrayList<Integer>> result = new ArrayList<>();

//         int num = 1;

//         // Fill the 2D ArrayList
//         for (int i = 0; i < rows; i++) {
//             ArrayList<Integer> row = new ArrayList<>();
//             for (int j = 0; j < cols; j++) {
//                 row.add(num++);
//             }
//             result.add(row);
//         }

//         // Print the 2D ArrayList
//         System.out.println("Generated 2D ArrayList:");
//         for (ArrayList<Integer> row : result) {
//             System.out.println(row);
//         }
//     }
// }

}
