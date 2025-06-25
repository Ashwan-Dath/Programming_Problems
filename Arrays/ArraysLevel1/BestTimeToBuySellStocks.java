package  Arrays.ArraysLevel1;

import java.util.Scanner;

public class BestTimeToBuySellStocks {

    public static void main(String[] anything){
        // Question: You are given an array of prices where prices[i] is the price of a given stock on the ith day
        //              You want to maximize your profit by choosing a single day to buy one stock and choosing a different 
        //              day in the future to sell that stock.

        // Output: Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit return 0.

        // Example 1: 
        //  Input : prices = [7, 1, 5, 3, 6, 4]
        //  output: 5
        // Explain: Buy on day 2 [price = 1] and sell on day 5 [price = 6], profit = 6 - 1 = 5.
        //          Note that buying on day 2 and selling  on day 1 is not allowed because you must buy before you sell
        
        // Example 2: 
        //  Input : prices = [7, 6, 4, 3, 1]
        //  output: 0
        // Explain: In this cases, no transactions are done and the max profit = 0.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++)
            arr[i] = scan.nextInt();
        
        scan.close();

        MySolution(arr);    // This is my solution

        System.out.println();

        optimalSolution(arr);   // Learnt a new way of solution.
    }

    public static void MySolution(int []arr){
        // In this method time complexity is : O(n^2)
        // Space complexity = 0(1) 
        int iIndex = -1;
        int jIndex = -1;
        int diff = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] - arr[i] > -1 && diff < arr[j] - arr[i])
                {
                    diff = arr[j] - arr[i];
                    iIndex = i;
                    jIndex = j;
                }
            }
        }
        if(diff == -1)
        {
            System.out.print("0 profit as there is no Buying and Selling  happened");
            return;
        }
        System.out.printf("%d, is the profit of buying the stock on day %d and selling on day %d", diff, (iIndex + 1), (jIndex + 1));
    }


    public static void optimalSolution(int []arr){
        // Time Complexity is : 0(n)
        // Space Complexity is : 0(1)
        int profit = 0;
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];

            profit = Math.max(profit, arr[i] - min);
        }       

        System.out.printf("Profit is %d.", profit);
        
    }

}
