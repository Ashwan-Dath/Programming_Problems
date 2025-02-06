import java.util.Scanner;

// Print Alternative Palindrome Numbers in a Given Range 

class QuestionSix
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a program to print Alternative Palindrome Numbers in the Given Range?
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        //                      Second Line of Input Consists of One Integer Value.
        // Output        :- Print the Alternative Palindromes in a Given Range.
        // Constraints  :- Given Inputs Must be Greater than or equal to Zero or else Print InvAlid InPUts.
        //                  If there is no Palindrome values in a Given Range then Print No Palindrome Values.
        
        // Example:
        // Input 1  :    100, 200
        // Output 1:   
        // 101, 121, 141, 161, 181. 
         
        // Input 2  :   -33, 20
        // Output 2:   InvAlid InPUts
        
        // Explanation:
        // Input 1  :    100, 200
        // Output 1:   
        // 101, 121, 141, 161, 181. 
        // Explanation : 
        // Palindrome Numbers in a Range of 100 and 200 is 101, 111, 121, 131, 141, 151, 161, 171, 181, 191.
        // Alternatve Palindrome Numbers in a Rnage of 100 and 200 is 101, 121, 141, 161, 181.
         
        // Input 2  :   -33, 20
        // Output 2:    InvAlid InPUts
        // Explanation : 
        // The Given Numbers are not Positive So print InvAlid InPUts.
        
        
        
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

    	    int Alternatve = 0;
    	    
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
        	        Alternatve++;
        	        System.out.print( Alternatve % 2 == 1 ? Alternatve == 1 ? i : ", "+i : "");
        	    } 
    	    }
    	    System.out.println(".");
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
