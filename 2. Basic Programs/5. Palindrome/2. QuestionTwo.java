import java.util.Scanner;

// Given Number is Palindrom or Not
class QuestionTwo
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Question : Write a program to check Given Number is Palindrome or Not.
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Given Number Palindrome or Not a Palindrome.
        // Constraints  :- Given Input Must be Greater than Zero or else Print InvAlid Input.
        
        // Example:
        // Input 1  :    1698
        // Output 1:    Not a Palindrome
         
        // Input 2  :   2112
        // Output 2:   Palindrome
         
        
        // Explanation:
        // Input 1  :    1698
        // Output 1:    Not a Palindrome
        // Explanation : 
        // If u reverse the Given Number (1698) then the value is 8961
        // Now Check the Given Number is equal to Reverse of Given Number
        // 1698 is not Equal to 8961 it means both are not Same, So Print Not a Palindrome.
         
        // Input 2  :   2112
        // Output 2:   Palindrome
        // Explanation : 
        // If u reverse the Given Number (2112) then the value is 2112
        // Now Check the Given Number is equal to Reverse of Given Number
        // 2112 is Equal to 2112 it means both are Same, So Print Palindrome.        
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();

    	    if(range <= 0 ){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    
    	    int duplicate = range;
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
    	    
    	    System.out.println( range == rev ? "Palindrome" : "Not a Palindrome");
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
