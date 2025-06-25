package  NumberPrograms.Palindrome;

import java.util.Scanner;

// Add Even Digits in a given Number 
public class QuestionNine
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a Program to Print Sum of the even digits in a Given Number?
        //              If your input is 212 then you have to Print 4 as Output.
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Sum of the Even Digits.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        // Example:
        // Input 1  :    212
        // Output 1:    4
        // Explanation:
        // 212  -->  2 + 2 = 4
        //  2 is a even number so 2 + 2 = 4

        // Input 2  :    -634
        // Output 2:     Invalid Input
        // Explanation:
        // -634 -->   Invalid Input  ( Given Value is Less than Zero )

        // Input 3  :    515
        // Output 3:    0
        // Explanation:
        // 515  -->  0 
        // There are no even numbers so output = 0
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int number = scan.nextInt();

    	    if(number <= 0 ){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 

    	    int sum = 0;

    	    while(true){
    	        int a = number % 10;
    	        
    	        number = number/10;
    	        
    	        if(a % 2 == 0){
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
