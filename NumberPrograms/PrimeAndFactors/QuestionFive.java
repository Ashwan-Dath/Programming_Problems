package  NumberPrograms.PrimeAndFactors;

import java.util.Scanner;

// Print Alternative Prime numbers in a range
public class QuestionFive
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
    	    
    	    // This logic is something you can understand a little easier.
    	    EasyLogic(startingrange, endingrange);
    	    
    	    
    	    
    	    //  Below are the Same process but with a little different logic

    	    FasterLogicInt(startingrange, endingrange);
    	   //       |
    	   //       |
    	   // Uncomment this code to see the working nature of the below code
    	   
    	   
    	   
    	    FasterLogicFloat(startingrange, endingrange);    
    	   //       | 
    	   //       |
    	   // Uncomment this code to see the working narute of the below code
    	    

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	public static void FasterLogicInt(int startingrange, int endingrange){
        int alternative = 0;
        for (int i = startingrange; i <= endingrange; i++) {
            if (i == 1) continue;  // 1 is not a prime number
            //           |
            //  Here continue statement will make the below code not run and immediately goes to the next iteration
            
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {  // Only go up to sqrt(i)
            //                   |
 	        // This is also same as the Math.sqrt(i), here we not not making the i Square root
 	        // Instead we are doubling the j value so that it will cut down the looping Process

                if (i % j == 0) {
                    prime = false;  // i is divisible by j, so it's not prime
                    break;  // No need to check further
                }
            }
            if (prime) {
                alternative++;
                System.out.print( alternative % 2 == 1 ? alternative == 1 ? i : ", "+i : "");
            }
        }
        System.out.println();
    }

	public static void FasterLogicFloat(int startingrange, int endingrange){
	    
	    int alternative = 0;    // This is to print the alternative Prime Numbers
	    
	    for ( int i = startingrange; i <= endingrange ; i++ ){
	        
	        boolean prime = true;
	        if(i==1) prime = false;
	        for ( int j = 2; j <= Math.sqrt(i) ; j++ ){ 
	        //                          |
	        // Here we are checking interger with a floating point (Math.sqrt(i))
	       // Which is a little slower like comparing int to float, than comparing int to int
	       // ex : Math.sqrt(23) = 4.795 so for j = 2 we have to compare 2 < 4.794 and so on 
	       //       So it will be a little difficult to compare interger value to a decimal value
	       
	            if( i % j == 0 ){
	                prime = false;
	                break;
	            } 
	        } 
	        
	        if(prime){
	            alternative++;
	            System.out.print( alternative % 2 == 1 ? alternative == 1 ? i : ", "+i : "" );
	        } 
	    } 
	    System.out.println();
	}
	
	public static void EasyLogic(int startingrange, int endingrange){
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
	    System.out.println();
	}
	
	
}
