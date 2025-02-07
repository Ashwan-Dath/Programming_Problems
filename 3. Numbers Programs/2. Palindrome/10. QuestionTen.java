import java.util.Scanner;

// Adding all alternative Palindromes in a given range 
class Main 
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a program to print Sum of all Alternative Palindrome Numbers Between the Given Numbers?
        
        // Constraints:
        // Input        :- First Line of Input Consists of One Integer Value.
        //                  Second Line of Input Consists of One Integer Value.
        // Output       :- Print the Sum of All Alternative Palindromes Between the Given Numbers.
        // Constraints  :- Either of the Given Inputs is equal to Zero then Print Invalid Inputs.
        //               If there is no Palindrome values between the Given Numbers then Print No Palindrome Values.
        //               If Either of the Given Inputs is Negative then convert those Negative Values to Positive Values.
        
        // Example:
        // Input 1  :    100, 200
        // Output 1:    Sum of Alternative Palindrome Numbers between the 100 and 200 is 101 + 121 + 141 + 161 + 181 = 705.
        // Explanation :
        // Palindromes Between 100 and 200 is 101 111 121 131 141 151 161 171 181 191
        // Alternative Palindromes Between 100 and 200 is 101 121 141 161 181 
        // sum = 101 + 121 + 141 + 161 + 181
        //       = 705
        
        
        // Input 2  :   -200, 25
        // Output 2:    Sum of Alternative Palindrome Numbers between the 25 and 200 is 33 + 55 + 77 + 99 + 111 + 131 + 151 + 171 + 191 = 1019.
        // Explanation :
        // Palindromes Between 25 and 200 is 33 44 55 66 77 88 99 101 111 121 131 141 151 161 171 181 191.
        // Alternative Palindromes Between 25 and 200 is 33 55 77 99 111 131 151 171 191.
        // sum = 33 + 55 + 77 + 99 + 111 + 131 + 151 + 171 + 191
        //       = 1019
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingRange = scan.nextInt();
    	    int endingRange = scan.nextInt();

    	    if(startingRange == 0 || endingRange == 0 ){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    
    	    if(startingRange < 0) startingRange = -(startingRange);
    	    if(endingRange < 0) endingRange = -(endingRange);
    	    
    	    if(startingRange<endingRange){
    	        AlternatPalindromeAddition(startingRange, endingRange);
    	    }else{
    	        AlternatPalindromeAddition(endingRange, startingRange);
    	    }

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	public static void AlternatPalindromeAddition(int startingRange, int endingRange){
	    int sum = 0;
	    int count = 0;
	    
	    for (int i = startingRange; i <= endingRange ; i++ ){
	        
	        int rev = 0;
	        int duplicate = i;
	        
    	    while(true){
    	        
    	        int a = duplicate % 10;
    	        
    	        duplicate = duplicate / 10;
    	        
    	        rev = rev * 10 + a;
    	        
    	        if(duplicate == 0){
    	            break;
    	        }
    	    }
    	    if( rev == i ){
    	        count++;
    	        if(count % 2 == 1){
    	            sum+=i; 
    	        } 
    	    } 
	    } 
	    System.out.print(sum);
	}
	
}
