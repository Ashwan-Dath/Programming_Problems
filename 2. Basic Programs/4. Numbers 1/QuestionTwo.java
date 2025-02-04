import java.util.Scanner;

// Find given numbers is prime or not
class QuestionTwo
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question :  Write a Program to Print the Given Number is Prime or not without using count?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Prime Number or Not a Prime Number.
        // Constraints  :- Given Input Must be Greater than Zero or else Print "Invalid Input".
        
        
        // Example:
        // Input 1  :    83
        // Output 1:    Prime Number
        
        
        // Input 2  :    -6
        // Output 2:     Invalid Input
        
        // Input 3  :    182        
        // Output 3:    Not a Prime Number
        
        
        // Explanation:
        // NA
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();
    	    
    	    if(range <= 0){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    int count = 0;
    	    for ( int i = range; i >= 1 ; i-- ){
    	        for ( int j = 1; j <= range ; j++ ){
    	           // System.out.printf( i * j == range ? j+" "  : "");
    	           if(i * j == range)   count++;
    	        } 
    	    } 
    	    System.out.print(count == 2 ? "Prime Number" : "Not a Prime Number");
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
