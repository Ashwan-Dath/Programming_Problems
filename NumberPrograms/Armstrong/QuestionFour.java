package  NumberPrograms.Armstrong;

import java.util.Scanner;

// print the All Odd Armstrong Numbers in the Given Range

public class QuestionFour
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {

        
        // Question : Write a program to print the All Odd Armstrong Numbers in the Given Range?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        //                  Second Line of Input Consists of One Integer Value.
        // Output        :- Print the All Armstrong Numbers.
        // Constraints  :- Either of the Given Inputs is Zero then Print "Invalid Inputs".
        //              If there is No Armstrong Numbers Between the Given Range then print "No Odd Armstrong Numbers.".
        //              If Either of the Given Inputs is Negative then Convert into Positive and then Print all Odd Armstrong Numbers.
        
        // Example:
        // Input 1  :    1, 200
        // Output 1:    Odd Armstrong Numbers in the Given Range is 1, 3, 5, 7, 9 ,153.
        // Explanation:
        // Amrstong Numbers in the Range of 1 to 200 is 1, 2, 3, 4, 5, 6, 7, 8, 9, 153.
        // Odd Armstrong Numbers in the Given Range is 1, 3, 5, 7, 9 ,153.
        
        
        // Input 2  :   500, 150
        // Output 2:    Odd Armstrong Numbers in the Given Range is 153, 371, 407.
        // Explanation:
        // Amrstong Numbers in the Range of 150 to 500 is 153, 370, 371, 407.
        // Odd Armstrong Numbers in the Given Range is 153, 371, 407.
        
        
        // Input 3  :    8208, 93084
        // Output 3:    Odd Armstrong Numbers in the Given Range is 92727.
        // Explanation:
        // Amrstong Numbers in the Range of 8208 to 93084 is 8208, 9474, 54748, 92727, 93084.
        // Odd Armstrong Numbers in the Given Range is 92727.
        
        
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
	        boolean armstrong = false;
	        
	        if(startingRange > endingRange)
	        {
	            int a = startingRange;
	            startingRange = endingRange;
	            endingRange = a;
	        }
	        
	        for ( int i = startingRange; i <= endingRange ; i++ ) {
	            
	            power = NoOfDigits(i);
	            int dup = Armstrong(i, power);
	            if(dup == i){
	                if(i % 2 == 1){
    	                System.out.print( !armstrong ? "Odd Armstrong Numbers in the Given Range is "+i : ", "+i);
    	                armstrong = true;
	                }
	            } 
	        }
	        
	        System.out.print( !armstrong ? "No Armstrong Numbers." : "." );

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
