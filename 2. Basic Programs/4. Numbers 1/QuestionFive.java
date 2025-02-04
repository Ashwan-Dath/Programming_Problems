import java.util.Scanner;

// Print Alternative Prime numbers in a range

class QuestionFive
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write a program to print Alternative Prime Numbers between the Given Range.
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Minimum Value ) .
        //                      Second Line of Input Consists of One Integer Value ( Maximum Value ) .
        // Output        :- Print Alternate Prime Numbers Between the Given Range.
        // Constraints  :- Given Inputs Must be Greater than Zero or else Print Invalid Inputs.
        
        // Example:
        // Input 1  :    25, 100
        // Output 1:    29, 37, 43, 53, 61, 71, 79, 89 
        // Explanation:
        // Prime Numbers : 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        // Alternative Prime Numbers : 29, 37, 43, 53, 61, 71, 79, 89
        
        
        // Input 2  :    -6, -200
        // Output 2:     Invalid Inputs
        // Explanation :
        // Given Numbers are not a Positive Numbers

        
        // Input 3  :    19, 61
        // Output 3:    19, 29, 37, 43, 53, 61
        // Explanation :
        // Prime Numbers : 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61
        // Alternative Prime Numbers : 19, 29, 37, 43, 53, 61        

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
    	    int count = 0;
    	    for ( ; startingrange <= endingrange ; startingrange++ ){
    	        int prime = 0;
    	        for ( int i = 1 ; i <= startingrange ; i++ ){
    	            for ( int j = 1 ; j <= startingrange ; j++ ){
    	                if( i * j == startingrange) prime++;
    	            } 
    	        } 
    	        
    	        if(prime == 2){
    	            count++;
    	            System.out.print( count % 2 == 1 ? count == 1 ? startingrange : ", "+startingrange : "");
    	        }
    	    } 

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
