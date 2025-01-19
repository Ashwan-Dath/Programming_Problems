import java.util.Scanner;

class QuestionNine
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question :   Write program to print the following series which is shown in Given Examples.
        
        // Constraints:
        // Input    :-  First Line of Input Consists of One float Value.
        //              Second Line of Input Consists of One float Value.
        // Output        :- Print the Following Series.
        
        // Constraints  :- No 
        
        // Example:
        // Input 1  : 10.7, 12.1
        // Output 1 :  10.7^2, 10.9^2, 11.1^2,11.3^2, 11.5^2, 11.7^2, 11.9^2, 12.1^2.
        
        // Input 2  :    6.1, 8.9
        // Output 2:     6.1^2, 6.3^2, 6.5^2, 6.7^2, 6.9^2, 7.1^2, 7.3^2, 7.5^2, 7.7^2, 7.9^2, 8.1^2, 8.3^2, 8.5^2, 8.7^2, 8.9^2.
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    float startingRange = scan.nextFloat();
    	    float endingRange = scan.nextFloat();
    	    
    	    if(startingRange<=0 || endingRange <= 0){
    	        System.out.print("Invalid Input");
    	        return;
    	    }
    	    
    	    int count = 0;  // Taking count for ',' logic
    	    
    	    for( ; startingRange <= endingRange ; count++ ){
    	        
    	        if(count!=0) System.out.print(", ");    // Not printing "," at first.
    	        System.out.printf("%.1f^2",startingRange);  
    	        // printf using to print float values %.1f is saying just to print only 1 value after the '.' decimal point 
    	        startingRange+=0.2f;    // adding 0.2 value for current value
    	        
    	    }
    	    System.out.print(".");
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
