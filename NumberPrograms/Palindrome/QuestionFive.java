package  NumberPrograms.Palindrome;

import java.util.Scanner;

// Average of All Palindrome Numbers in a Given Range 

public
class QuestionFive
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a program to find Average of all Palindrome Numbers between the Range?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        //                   Second Line of Input Consists of One Integer Value.
        // Output        :- Print the Average of All Palindromes Between the Given Range.
        // Constraints  :- Either of the Given Inputs Must not equal to Zero or else Print INVALID Inputs.
        //              If there is no Palindrome values between the Given Range then Print No Palindrome Values.
        //              If Either of the Given Inputs is Negative then convert those Negative Values to Positive Values.
        //              If the First Input is Greater then Second Input then Print Given Inputs are Swapped.
        
        
        // Example:
        // Input 1  :    100, 120
        // Output 1:    106.00
         
        
        // Input 2  :   -20, 45
        // Output 2:    33.00
        
        
        // Explanation:
        // Input 1  :    100, 120
        // Output 1:    106
        // Explanation :
        // Palindromes Between 100 and 120 is 101 111
        // sum = 101 + 111 = 212
        // Average = sum / 2
        //         = 212 / 2
        //         = 106.00
        
        
        // Input 2  :   -20, 45
        // Output 2:    33
        // Explanation :
        // Palindromes Between -20 and 45 is 22 33 44
        // sum = 22 + 33 + 44
        //     = 99
        // Average = sum / 3
        //         = 99 / 3
        //         = 33.00
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingRange = scan.nextInt();
    	    int endingRange = scan.nextInt();

    	    if(startingRange == 0 || endingRange == 0 ){
    	        System.out.print("Invalid Inputs");
    	        return;
    	    } 
    	    if(startingRange < 0 ) startingRange = -(startingRange);
    	    if(endingRange < 0 ) endingRange = -(endingRange);
    	    
    	    int sum = 0;
    	    int count = 0;
    	    
    	    for ( int i = startingRange ; i <= endingRange ; i++ ) {
    	        
        	    int duplicate = i;
        	    int rev = 0;
        	    
        	    while(true){
        	    
        	        int a = duplicate % 10;

        	        rev = rev * 10 + a;
        	        
        	        duplicate = duplicate/10;

        	        if(duplicate == 0){
        	            break;
        	        }
        	    }
        	    
        	    if( i == rev ){
        	        sum+=i;
        	        count++;
        	    } 
    	    }
    	    
    	    System.out.printf(sum == 0 ? "No Palindrome Values" : "%.2f",((float) sum/count));
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
