package  NumberPrograms.Palindrome;

import java.util.Scanner;

// Palindrome Number in a given Range
 
public class QuestionThree
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Question : Write a program to print all Palindrome Numbers between the Given Numbers?
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        //                  Second Line of Input Consists of One Integer Value.
        // Output        :- Print the All Palindromes Between the Given Numbers.
        // Constraints  :- Given Inputs Must be Greater than or equal to Zero or else Print InvaliD InputS.
        //          If there is no Palindrome values between the Given Numbers then Print No Palindrome Values.
        //          if starting range is greater than ending range swap the inputs and print all palindromes in the range
        
        // Explanation: 
        // Input 1  :   100, 200 
        // Output 1:    101  111  121  131  141  151  161  171  181  191 
        // Explanation : 
        // Palindrome Numbers Between 100 and 200 is 101 111 121 131 141 151 161 171 181 191 
        
        
        // Input 2  :   -20, 20 
        // Output 2:    InvaliD InputS 
        // Explanation : 
        // The Given Numbers are not Positive So print InvaliD InputS. 
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingRange = scan.nextInt();
    	    int endingRange = scan.nextInt();

    	    if(startingRange < 0 || endingRange < 0 ){
    	        System.out.print("Invalid Inputs");
    	        return;
    	    } 
    	    
    	    for ( int i = startingRange ; i <= endingRange ; i++ ) {
    	        
        	    int duplicate = i;
        	    int rev = 0;
        	    
        	    while(true){
        	    
        	        int a = duplicate % 10;
        	        //           |
        	        //  We are getting the remainder by dividing the number with 10
        	        // ex: 321 % 10 = 32 is quotient and remainder will the 10
        	        // 1 is stored in the 'a'
        	       
        	        rev = rev * 10 + a;
        	        //   a is added to the 'rev' untill the number is reversed
        	        // ex: 12 => first   : 2 is extracted from the 12 and only 1 is left in range variable
        	        //           Second  : rev = 0 * 10 + 2 => rev = 2;
        	        //           Third   : 1 is extraced from range variable and 0 is left
        	        //           Fourth  : rev = 2 * 10 + 1 => 21
        	        //  The required number is reversed and stored in the rev variable.
        	        
        	        duplicate = duplicate/10;
        	        // This is for updating the value 
        	        // ex : 345 => first 5 is removed and range = 34
        	        //           => Second 4 is removed and range = 3
        	        //           => Third 3 is removed and range = 0
        	       
        	        // Once the range = 0 then we break the loop.
    
        	        if(duplicate == 0){
        	            break;
        	        }
        	    }
        	    
        	    System.out.print( i == rev ? i+" " : "");
    	    }
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
