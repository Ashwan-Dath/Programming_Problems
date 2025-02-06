import java.util.Scanner;

// Print Prime numbers present in a given range
class QuestionSix 
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write a program to print All the Prime Numbers between the Given Range.
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Minimum Value ) .
        //                   Second Line of Input Consists of One Integer Value ( Maximum Value ) .
        // Output        :- Print All the Prime Number Between the Given Range.
        // Constraints  :- Given Inputs Must be Greater than Zero or else Print Invalid Inputs.
        
        // Example:
        // Input 1  :    25, 100        
        // Output 1:    29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        
        
        // Input 2  :    -6, -200
        // Output 2:     Invalid Inputs
        
        
        // Input 3  :    19, 61
        // Output 3:    19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61
        
        
        // Explanation:
        // If the Given Inputs is greater than Zero then Print All the Prime Number between the Given Range.
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingrange = scan.nextInt();
    	    int endingrange = scan.nextInt();

    	    if(startingrange <= 0 || endingrange <= 0){
    	        System.out.print("Invalid Inputs");
    	        return;
    	    } 
    	    if(startingrange > endingrange){
    	        System.out.print("Given Range is incorrect");
    	        return;
    	    }
    	    
            SimpleLogic(startingrange, endingrange);
            
            // FasterLogic(startingrange, endingrange);
            //       |
    	   //        |
    	   // Uncomment this code to see the working nature of the below code
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	public static void FasterLogic(int startingrange, int endingrange){
	    
	    for ( int i = startingrange; i <= endingrange ; i++ ){
	        
	        if(i == 1) continue;
	        
	        boolean prime = true;
	        
	        for ( int j = 2 ; j * j <= i ; j++ ){
	            if( i % j == 0 ){
	                prime = false;
	                break;
	            }
	        } 
	        
	        if(prime) System.out.print( i == startingrange ? i : ", "+i);
	    } 
	}
	
	public static void SimpleLogic(int startingrange, int endingrange){
	    
	    for ( int i = startingrange; i <= endingrange ; i++ ){
	        
	        int prime = 0;
	        
	        for ( int j = 1 ; j <= i ; j++ ){
	            if( i % j == 0 ) prime++;
	        } 
	        
	        if(prime == 2)  System.out.print( i == startingrange  ? i : ", "+i);
	    } 
	    System.out.println();
	}
	
}
