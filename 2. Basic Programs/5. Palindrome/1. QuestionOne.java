import java.util.Scanner;

// Reverse a given Number
class QuestionOne
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Question : Write a program to Print the Reverse of a Given Number?
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Reverse of a Given Number.
        // Constraints  :- Given Input Must be Greater than Zero or else Print InValid Input.
        
        
        // Example:
        // Input 1  :    1698
        // Output 1:    8961
         
        // Input 2  :   1004
        // Output 2:   4001
        
        // Explanation:
        // Printing the Reverse of Given Number
        
        
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();

    	    if(range <= 0 ){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    int rev = 0;
    	    
    	    while(true){
    	    
    	        int a = range % 10;
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
    	        
    	        range = range/10;
    	        // This is for updating the value 
    	        // ex : 345 => first 5 is removed and range = 34
    	        //           => Second 4 is removed and range = 3
    	        //           => Third 3 is removed and range = 0
    	       
    	        // Once the range = 0 then we break the loop.

    	        if(range == 0){
    	            break;
    	        }
    	    }
    	    System.out.print(rev);
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
