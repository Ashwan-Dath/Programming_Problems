package  NumberPrograms.Armstrong;

import java.util.Scanner;

// sum of Factorials upto N Numbers

public class QuestionTen
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {

        
        // Question : Write a program to find sum of Factorials upto N Numbers like 0! + 1! + 2! + 3! + 4! + 5! +....upto n!?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Sum of Factorials upto N Numbers.
        // Constraints  :- Given Inputs Must be Greater than or equal to Zero or else Print INvalid INput.
        
        // Example:
        
        // Input 1  :    6
        // Output 1:    874
        // Explanation :
        // Factorial = 0! + 1! + 2! + 3! + 4! + 5! + 6!
        //              = 1 + 1 + 2 + 6 + 24 + 120 + 720
        //              = 874
         
        // Input 2  :   5
        // Output 2:   154
        // Explanation :
        // Factorial = 0! + 1! + 2! + 3! + 4! + 5!
        //              = 1 + 1 + 2 + 6 + 24 + 120
        //              = 154    
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        int number = scan.nextInt();
	        
	        if(number<=0){
	            System.out.print("Invalid Input");
	            return;
	        }
	        
	       int sum = 0;
	       
	       for (int i = 0; i <= number ; i++ ){
	           
	           sum += RecurssiveFactorial(i);
	           
	       } 
	       
	       System.out.print(sum);
	       
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
	public static int RecurssiveFactorial(int number){
	    
        // factorial of 0 or 1 is 1
        if (number == 0 || number == 1) {
            return 1;
        }
        
        return number * RecurssiveFactorial(number - 1);
	    
	}
	

}
