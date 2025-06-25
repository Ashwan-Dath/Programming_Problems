package  BasicPrograms.Level1;

import java.util.Scanner;

public class QuestionThree
{
    static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	    
	   // Question :    Write a program to find sum of all the numbers in 
	   //               given range if starting index is greater than ending index print INVALID RANGE
        
        
        // Constraints:
        // Input :  First line of input contains integer n represent strating range
        //          Second line of inputs contains integer n1 represent ending range
        
        // Output :            Print sum of numbers
        
        // Example:
        // Input :  10, 20
        // Output : 165
        
        // Explanation:
        // print sum of all numbers in given range
        
        Answer();
	}
	
	public static void  Answer(){
		try{
			int startingPoint = scan.nextInt();
			int EndingPoint = scan.nextInt();
			
			int sum = 0;    // Taking a 'sum' variable to store the sum of the values
			
			if(EndingPoint < startingPoint){
				System.out.println("INVALID RANGE");
				return;
			}
			
			for (int start = startingPoint; start <= EndingPoint ; start++ ){   // For running a loop through the numbers
				sum += start;   // storing the added values into 'sum' variable
			} 
			
			System.out.println("The sum of the numbers between given range "+startingPoint +" "+ EndingPoint+ " is = "+ sum);
			
		}catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	}
}
