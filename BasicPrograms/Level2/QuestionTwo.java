package Programming_Problems.BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionTwo
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        
        // Question :   Write a program to find the average of all even numbers in the given range.
        //              if the strating range is Greater than ending range then print "INVALID RANGE"
        
        
        // Constraints:
        // Input :  First line of input contains Integer which denotes starting range
        //          Second line of input contains Integer which denotes ending range
        
        // Output :         Avarage(decimal value)
        
        // Example:
        // Input :         10, 30
        // Output :       20.0
        
        
        // Explanation:
        // in the above example even numbers in range are 10,12,14,16,18,20,22,24,26,28,30
        // avarage of those numbers is 20.0
        
        Answer();
        
	}
	
	
	
	public static void  Answer(){
        try{
            int startingrange = scan.nextInt();
            int endingrange = scan.nextInt();
            int sum = 0; 
            int count = 0;
            float avg = 0;
            
            if(startingrange >= endingrange){  // Closing the program if the Starting range is greater than or equal to Ending range
                System.out.println("INVALID RANGE");
                return;
            }
            
            for (int start = startingrange; start <= endingrange ; start++ ){
                sum += start;
                count++;
            }
            
            avg = (float) sum/count;
            System.out.println("The average of numbers from "+ startingrange +" - "+ endingrange +" = " + avg);
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }

	}
	
	
}
