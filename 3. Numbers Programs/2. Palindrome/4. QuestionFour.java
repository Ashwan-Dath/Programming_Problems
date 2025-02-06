import java.util.Scanner;

// Sum of all Palindrome Numbers in a Given Range 

class QuestionFour
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Question : Write a program to find Sum of all Palindrome Numbers between the Given Numbers? 
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value. 
        //                   Second Line of Input Consists of One Integer Value. 
        // Output        :- Print the Sum of All Palindromes Between the Given Numbers. 
        // Constraints  :- Either of the Given Inputs Must not equal to Zero or else Print INVALID Inputs. 
        //              If there is no Palindrome values between the Given Numbers then Print No Palindrome Values. 
        //              If Either of the Given Inputs is Negative then convert those Negative Values to Positive Values. 
        
        // Example: 
        // Input 1  :    100, 200 
        // Output 1:   1460 
         
        // Input 2  :   -20, 25 
        // Output 2:    22 
        
        // Explanation: 
        // Input 1  :    100, 200 
        // Output 1:   1460 
        // Explanation : 
        // Palindromes Between 100 and 200 is 101 111 121 131 141 151 161 171 181 191 
        // sum = 101 + 111 + 121 + 131 + 141 + 151 + 161 + 171 + 181 + 191  = 1460 
         
        // Input 2  :   -20, 25 
        // Output 2:    22 
        // Explanation : 
        // Palindromes Between -20 and 25 is 22. 
        // sum = 22        
        
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
        	    
        	    if( i == rev ) sum+=i;
    	    }
    	    
    	    System.out.println(sum == 0 ? "No Palindrome Values" : sum);
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
