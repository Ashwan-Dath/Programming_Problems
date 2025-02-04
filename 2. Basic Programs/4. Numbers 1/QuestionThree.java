import java.util.Scanner;

// Sum of the prime numbers in a range

class QuestionThree
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write a program to find Average of all Prime Numbers between the Given Values.
        //             (Print the value upto 3 digits after Decimal Point)
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Minimum Value ) .
        //                   Second Line of Input Consists of One Integer Value ( Maximum Value ) .
        // Output        :- Print All the Prime Number Between the Given Values.
        // Constraints  :- Given Inputs Must be Greater than Zero or else Print Invalid Inputs.
        
        
        // Example:
        // Input 1  :    25, 100
        // Output 1:    60
        
        // Input 2  :    -10, -90
        // Output 2:     Invalid Inputs
        
        // Input 3  :    19, 61
        // Output 3:    40.333
        
        // Explanation:
        // Input 1  :    25, 100
        // Output 1:    960
        
        // Explanation:
        // Prime Numbers :   29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        // sum = 29 + 31 + 37 + 41 + 43 + 47 + 53 + 59 + 61 + 67 + 71 + 73 + 79 + 83 + 89 + 97
        //       = 960
        
        // Input 2  :    -10,   -90
        // Output 2:     Invalid Inputs
        
        // Explanation:
        
        // Given Numbers are not a Positive Numbers
        
        // Input 3  :    19, 61
        // Output 3:    363
        
        // Explanation:
        // Prime Numbers:  23, 29, 31, 37, 41, 43, 47, 53, 59
        // sum = 23 + 29 + 31 + 37 + 41 + 43 + 47 + 53 + 59 
        //       =  363 

        
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
    	    
    	    int sum = 0;     // To store the sum of the prime Numbers
    	    startingrange++; 
    	    for ( ; startingrange < endingrange ; startingrange++ ){
    	        int prime = 0;
    	        for ( int i = 1 ; i <= startingrange ; i++ ){
    	            for ( int j = 1 ; j <= startingrange ; j++ ){
    	                if( i * j == startingrange ) prime++;
    	            } 
    	        } 
    	        if(prime == 2) sum += startingrange;
    	    } 
    	    System.out.print(sum);

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
