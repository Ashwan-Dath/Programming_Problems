package  NumberPrograms.Palindrome;

import java.util.Scanner;

// Add Odd position Digits in a given Number 

public class QuestionSeven
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a Program to Print Sum of all odd Positions in a Given Number?
        //              If the Input is 5432 then print output as 6.
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Sum of Digits.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        // Example:
        // Input 1  :    5432
        // Output 1:    6
        // Explanation:
        // 5432     -->   5  4  3  2
        // position -->   4  3  2  1
        // Odd Positions are 1 = 2 and 3 = 4 
        // Pic Odd Positions Digits-->2 + 4 = 6

        // Input 2  :    -6896
        // Output 2:     Invalid Input
        // Explanation: 
        // -6896     -->  Invalid Input

        // Input 3  :    6481
        // Output 3:    5
        // Explanation:
        // 6481      -->   6  4  8  1
        // position -->    4  3  2  1
        // Odd positions are 1 = 1 and 3 = 4 
        // Pic Odd Positions Digits-->1 + 4 = 5
        
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int number = scan.nextInt();

    	    if(number <= 0 ){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 

    	    int Alternatve = 0;
    	    int sum = 0;

    	    while(true){
    	        Alternatve++;
    	        int a = number % 10;
    	        
    	        number = number/10;
    	        
    	        if(Alternatve % 2 == 1){
    	            sum+=a;
    	        } 
    	        if(number == 0){
    	            break;
    	        }
    	    }
    	    System.out.print(sum);

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
