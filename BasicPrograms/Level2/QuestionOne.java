package  BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionOne
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        
        // Question :   Write a program to print sum of squares of the numbers in given range.
        //              if starting range is Greater than ending range print "INVALID RANGE"
        
        
        // Constraints:
        // Input :  First line of input contains a integer that denotes strating range
        //          Second line of input contains a integer that denotes ending range
        
        // Output :           Integer that denotes sum
        
        // Example:
        // Input :          5, 23
        // Output :       4294
        
        
        // Explanation:
        // Input :        5 
        
        //                   23
        
        // Output :     4294
        
        // Explanation :
        // 5^2 + 6^2 + 7^2 + 8^2 + 9^2 + 10^2 + 11^2 + 12^2 + 13^2 + 14^2 + 15^2 + 16^2 + 17^2 + 18^2 + 19^2 + 20^2 + 21^2 + 22^2 + 23^2
        // = 25 + 36 + 49 + 64 + 81 + 100 + 121 + 144 + 169 + 196 + 225 + 256 + 289 + 324 + 361 + 400 + 441 + 484 + 529
        // =4294        
        
        Answer();
        
	}
	
	
	
	public static void  Answer(){
        try{
            int startingrange = scan.nextInt();
            int endingrange = scan.nextInt();
            int sum = 0; 
            if(startingrange >= endingrange){  // Closing the program if the Starting range is greater than or equal to Ending range
                System.out.println("INVALID RANGE");
                return;
            }
            for (int start = startingrange; start <= endingrange ; start++ ){
                sum += start * start;
            }
            System.out.println(sum);
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	}
	
	
}
