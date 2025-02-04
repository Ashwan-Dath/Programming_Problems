import java.util.Scanner;

// Given Number prime or not

class QuestionEight
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write a program to check given number is prime number or not.
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Prime Number or Not a Prime Number.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        // Example:
        // Input 1  :    83
        // Output 1:    Prime Number
        
        // Input 2  :    -6
        // Output 2:     Invalid Input
        
        // Input 3  :    182
        // Output 3:    Not a Prime Number
        
        // Explanation:
        // If the Given Input is greater than Zero then check the Given Number is Prime Number or Not a Prime Number.
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();

    	    if(range <= 0 ){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    
    	    int prime = 0;
    	    for ( int i = 1 ; i <= range ; i++ ){
    	        for ( int j = 1 ; j <= range ; j++ ){
    	            if(i * j == range) prime++;
    	        } 
    	    } 
    	    System.out.print( prime == 2 ? "Prime Number" : "Not a Prime Number");
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
	
}
