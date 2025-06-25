package Programming_Problems.BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionThree
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Question : Write a program to print all alternative even numbers in the given range 
        //            if no numbers then print NO NUMBERS if starting range is greater than ending range print INVALID INPUTS
        
        
        // Constraints:
        // Input :  First line contains an Integer n  represents starting range
        //          Second line contains an Integer n1 represent ending range
        
        // Output :         Print Alternative Even Numbers in Range
        
        // Example:
        // Input  :     10, 30
        
        // Output :     10 14 18 22 26 30
        
        
        // Explanation:
        // in the above example we have to print all the alternative even numbers 
        // in the range of 10 to 30 they are 10 14 18 22 26 30
        
        Answer();
        
	}
	
	
	
	public static void  Answer(){
        try{
            int startingrange = scan.nextInt();
            int endingrange = scan.nextInt();
        
            if(startingrange >= endingrange){  // Closing the program if the Starting range is greater than or equal to Ending range
                System.out.println("INVALID INPUTS");
                return;
            }
            
            for (int start = startingrange; start <= endingrange ; start++ ){
                if(start%2==0){
                    System.out.print(start + " ");
                    start += 2; // directly incrementing 2 so that next even number will not count
                }
            }
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
    }
	
	
}
