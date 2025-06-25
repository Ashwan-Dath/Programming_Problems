package  BasicPrograms.Level1;

import java.util.Scanner;

public class QuestionTen
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        
        // Question :   Write a program to print all even numbers in range.
        //              if starting range is greater than ending range print "INVALID RANGE"
        
        // Constraints:
        // Input :  First line of input contains an Integer n represents starting range
        //          Second line of input contains an Integer n1 represents ending range
        
        // Output :            Print All the Even Numbers in a Given Range.
        
        // Example:
        // Input :      1 10
        // output :   2 4 6 8 10
        
        
        // Explanation:
        // In the above example we have to print all the even numbers in the range of 1 to 10 with spaces 
        
        
        Answer();
        
	}
	
	
	
	public static void  Answer(){
        try{ 
            int startingrange = scan.nextInt();
            int endingrange = scan.nextInt();
            
            if(startingrange >= endingrange){  // Closing the program if the Starting range is greater than or equal to Ending range
                System.out.println("INVALID RANGE");
                return;
            }
            
            for (int index = startingrange; index <= endingrange ; index++ ){
                System.out.print( index % 2 == 0 ? index+" " : "");
            }
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	}
	
	
}
