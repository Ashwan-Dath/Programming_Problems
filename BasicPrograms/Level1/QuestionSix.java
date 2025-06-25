package Programming_Problems.BasicPrograms.Level1;

import java.util.Scanner;

public class QuestionSix
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Question :write a program to perform all these tasks
        
        // a.     Store a number in a variable
        // b.    If value is not in range (100-1000) prints WRONG NUMBER else follows the steps
        // c.     Check even or odd
        // d.    If even divide the number by 3 and print the remainder
        // e.     If odd divide the number by 2 and print the remainder.
        
        // Constraints:
        // Input : First line of input contains an Integer n reperesent number
        
        // Example:
        // Input :         498
        
        // Output :      0
        
        // Explanation:
        // in the above example number is in range of 100-1000 and it is even we are dividing with 3 and printing remainder 0
        
        Answer();
        
	}
	
	public static void  Answer(){

        try{
            int number = scan.nextInt();
            
            if(number <= 100  || number >= 1000){   
                System.out.println("WRONG NUMBER");
                return;
            }
            
            // letting only numbers present between 101 - 999 only
            
            if(number%2 == 0){  // Checking whether the number is even or odd
                System.out.println( number % 3 );
            }else{
                System.out.println( number % 2 );
            }
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	}
}
