package  NumberPrograms.Armstrong;

import java.util.Scanner;

// print the Armstrong Numbers in the Given Range.
public class QuestionSix
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {

        
        // Question : Write a program to print the Armstrong Numbers in the Given Range.
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        //                      Second Line of Input Consists of One Integer Value.
        // Output        :- Print the All Armstrong Numbers.
        // Constraints  :- Given Inputs is Must be Greater than Zero or else Print Invalid Inputs.
        //                       If there is No Armstrong Numbers Between the Given Range then print No Armstrong Numbers.
        
        // Example:
        // Input 1  :    1 , 200
        // Output 1:    Armstrong Numbers in the Given Range is 1, 2, 3, 4, 5, 6, 7, 8, 9, 153.
        // Explanation:
        // Amrstong Numbers in the Range of 1 to 200 is 1, 2, 3, 4, 5, 6, 7, 8, 9, 153.

         
        // Input 2  :   500 , 150
        // Output 2:  Armstrong Numbers in the Given Range is 153, 370, 371, 407.
        // Explanation:
        // Amrstong Numbers in the Range of 150 to 500 is 153, 370, 371, 407.

         
        // Input 3  :    8208 , 93084
        // Output 3:    Armstrong Numbers in the Given Range is 8208, 9474, 54748, 92727, 93084.
        // Explanation:
        // Amrstong Numbers in the Range of 8208 to 93084 is 8208, 9474, 54748, 92727, 93084.

        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
	        int startingRange = scan.nextInt();
	        int endingRange = scan.nextInt();
	        
	        if(startingRange == 0 || endingRange == 0){
	            System.out.print("Invalid Inputs");
	            return;
	        }
	        
	        if(startingRange < 0) startingRange = -(startingRange);
	        if(endingRange < 0) endingRange = -(endingRange);
	        
	        int power = 0;
	        boolean armstrong = true;
	        
	        if(startingRange > endingRange)
	        {
	            int a = startingRange;
	            startingRange = endingRange;
	            endingRange = a;
	        }
	        
	        for ( int i = startingRange ; i <= endingRange ; i++ ) {
	            
	            power = NoOfDigits(i);
	            int dup = Armstrong(i, power);
	            if(dup == i){
	                System.out.print( armstrong  ? "Armstrong Numbers in the Given Range is "+i : ", "+i);
	                armstrong = false;
	            } 
	        } 
	        
	        System.out.print( armstrong ? "No Armstrong Numbers." : "." );

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	public static int NoOfDigits(int number){

	    int power = 0;
	    
	    while(true){
	        number = number / 10;
	        power++;
	        if(number == 0) break;
	    }
	    
	    return power;
	}
	
	public static int Armstrong(int number, int power){
	    int arm = 0;
	    for ( int i = 1 ; i <= power ; i++ ) {
	        int lastdigit = number % 10;
	        int separateSum = 1;
	        for ( int j = 1; j<= power ; j++ ) {
	            separateSum *= lastdigit;
	        }
	        number /= 10;
	        arm += separateSum;
	    }
	    return arm;
	}
	
}
