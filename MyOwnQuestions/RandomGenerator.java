package MyOwnQuestions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {
    public static void main(String[] args) {

        // Question : 


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
        // ArrayList<String> outerLength = new ArrayList<>();


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
            int outerValue = rand.nextInt(copyNums.size());
            // System.out.printf("outerValue: %d, copynumsvalue :%d, copynumssize : %d",outerValue, copyNums.get(outerValue), copyNums.size());
            // System.out.print("\nresultArray at copyNums Index  " + result.get(copyNums.get(outerValue)));
            // System.out.println("  resultArray Size at copyNums Index  " + result.get(copyNums.get(outerValue)));
            // while (result.get(copyNums.get(outerValue)).size() != 0) {
                if(result.get(copyNums.get(outerValue)).size() == 0){
                    System.out.println("\n Now All values printed i have to break the loop");
                    break;
                }
                int innerValue = rand.nextInt(result.get(copyNums.get(outerValue)).size());
                int index = result.get(copyNums.get(outerValue)).remove(innerValue) - 1;
                System.out.printf("%s, ", allNumbers.get(index));
                
                // System.out.print("Inner Array - innerValue  " + innerValue);
                // System.out.printf("outerValue : %d, innerValue : %d\n", outerValue, innerValue);
                // System.out.println("  Inner Array - Result array  Removed Value  " + result.get(copyNums.get(outerValue)).remove(innerValue));
                // System.out.println("  Value  " + result.get(copyNums.get(outerValue)).remove(innerValue));
                
                // System.out.print("");
            // }


            // int innerValue = rand.nextInt(result.get(copyNums.get(outerValue)).size());
            // System.out.println("  innerValue  " + innerValue);

            // System.out.println("Remove Value  " + result.get(copyNums.get(outerValue)).remove(k));
            // System.out.println("Inner Size " + result.());
            // int innerValue = rand.nextInt(result.get(outerValue));

            

            copyNums.remove(outerValue);
            if(copyNums.size() == 0){
                copyNums = new ArrayList<>(nums);
            }
        }

        if(copyNums.size() == 0)
            System.out.printf("\nThere are no Values Present in the array.\n");


        System.out.println();
        System.out.println(result.size());

        for(int i =0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}
