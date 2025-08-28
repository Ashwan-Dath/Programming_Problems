package MyOwnQuestions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the Range Starting Character : ");
        char outerStart = input.next().charAt(0);
        System.out.println("\nEnter the Range Ending Character : ");
        char outerEnd = input.next().charAt(0);
        
        System.out.println("\nEnter the Range Starting Number : ");
        int innerStart = input.nextInt();
        System.out.println("\nEnter the Range Ending Number : ");
        int innerEnd = input.nextInt();

        input.close();

        int outerCount = 0;
        int innerCount = 0;
        
        ArrayList<String> allNumbers = new ArrayList<>();

        for(int i = (int) outerStart; i <=(int)outerEnd; i++){
            char a = (char)i;
            for(int j = innerStart; j <= innerEnd; j++){
                String x = a+""+j;
                allNumbers.add(x);
            }
        }

        System.out.println("allNumbers : " + allNumbers);

        for(int i = (int)outerStart; i <= (int)outerEnd; i++)
            outerCount++;

        for(int i = innerStart; i <= innerEnd; i++)
            innerCount++;

        System.out.println();

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int k = 1;
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < outerCount; i++ ){
            nums.add(i);
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < innerCount; j++){
                row.add(k++);
            }
            result.add(row);
        }

        System.out.println("Result"+ result);
        System.out.println("nums"+ nums);

        ArrayList<Integer> copyNums= new ArrayList<>(nums);
        System.out.println("Outer : " + outerCount);
        System.out.println("Inner : " + innerCount);

        Random rand = new Random();

        while (copyNums.size() != 0) {
            int value = rand.nextInt(copyNums.size());
            System.out.printf("%d, ", copyNums.get(value));
            copyNums.remove(value);
        }

                    if(copyNums.size() == 0)
                System.out.printf("\nThere are no Values Present in the array.\n");


        System.out.println();
        System.out.println(result.size());

        // while (numbers.size() != 0) {
        //     int value = rand.nextInt(numbers.size());
        //     System.out.printf("%d, ", numbers.get(value));
        //     numbers.remove(value);
        //     // if(numbers.size() == 0)
        //     //     System.out.printf("] \nThere are no Values Present in the array.");
        // }

        for(int i =0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}
