import java.util.Scanner;

// Sum of Alternative Prime numbers

class QuestionNine 
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Question : Write a program to find the Sum of all Alternative Prime Numbers between Given Values.
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Minimum Value ) .
        //                  Second Line of Input Consists of One Integer Value ( Maximum Value ) .
        // Output        :- Print Sum of All Alternate Prime Numbers Between the Given Values.
        // Constraints  :- Given Inputs Must be Greater than Zero or else Print Invalid Inputs.
        //       If no Primes Numbers are identified in Between the Given Values then Print No Prime Numbers.
        
        // Example:
        // Input 1  :   25, 100
        // Output 1:    462
        // Explanation :
        // Prime Numbers : 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
        // Alternative Prime Numbers : 29, 37, 43, 53, 61, 71, 79, 89
        // Sum of Alternative Prime Numbers : 29 + 37 + 43 + 53 + 61 + 71 + 79 + 89 = 462
        
        
        // Input 2  :    -6, -200
        // Output 2:     Invalid Inputs
        // Explanation : 
        // Given Numbers are not a Positive Numbers
        
        
        // Input 3  :    19, 61
        // Output 3 :    201
        // Explanation :
        // Prime Numbers : 23, 29, 31, 37, 41, 43, 47, 53, 59
        // Alternative Prime Numbers : 23, 31, 41, 47, 59
        // Sum of Alternative Prime Numbers : 23 + 31 + 41 + 47 + 59 = 201
        
        
        // Input 4  :    90, 97
        // Output 4:    No Prime Numbers
        // Explanation :
        // Prime Numbers : No Prime Numbers between the Given Numbers
        // Alternative Prime Numbers : No Alternative Prime Numbers between the Given Numbers So Printing No Prime Numbers.
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingRange = scan.nextInt();
    	    int endingRange = scan.nextInt();

    	    if(startingRange <= 0 || endingRange <= 0 ){
    	        System.out.print("Invalid Inputs");
    	        return;
    	    } 
    	    
    	    int count = 0; 
    	    int sum = 0; 
    	    for ( int i = startingRange + 1; i < endingRange ; i++ ){ 
    	        
    	        int prime = 0; 
    	        
    	        for ( int j = 1; j <= i ; j++ ){ 
    	             if( i % j == 0) prime++;
    	        } 
    	        
    	        if( prime == 2 ){ 
    	            count++;
    	            if( count % 2 == 1 ){
    	                sum+=i; 
    	            } 
    	        } 
    	    } 
    	    
    	   // if(count == 0){
    	   //     System.out.print("No Prime Numbers");
    	   // }else{
    	   //     System.out.print(sum);
    	   // } 
    	   //
    	   //   The above commented code can be written in a single line below
    	   
    	   System.out.println( count == 0 && sum == 0 ? "No Prime Numbers" : sum);
    	   
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
