package  NumberPrograms.Armstrong;

import java.util.Scanner;

//print the Armstrong Numbers between the Given two values

public class QuestionTwo
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
	   // Question : Write a program to print the Armstrong Numbers between the Given two values.
        
    //     Constraints:
    //     Input          :- First Line of Input Consists of One Integer Value.
    //                      Second Line of Input Consists of One Integer Value.
    //     Output        :- Print the All Armstrong Numbers.
    //     Constraints  :- Either of the Given Inputs is Equal to Zero then Print Invalid Inputs.
    //                  If there is No Armstrong Numbers Between the Given Values then print No Armstrong Numbers Between Given Values.
    //                  If Either of the Given Inputs is Negative then Convert into Positive and then Print the Armstrong Numbers.
        
    //     Example:
    //     Input 1  :    1, 200
    //     Output 1:    Armstrong Numbers between the Given Values is 2, 3, 4, 5, 6, 7, 8, 9, 153.
    //     Explanation:
    //     Amrstong Numbers between the 1 to 200 is 2, 3, 4, 5, 6, 7, 8, 9, 153.
    
    
    //     Input 2  :   500, 150
    //     Output 2:  Armstrong Numbers between the Given Values is 153, 370, 371, 407.
    //     Explanation:
    //     Amrstong Numbers between the 150 to 500 is 153, 370, 371, 407.

        
    //     Input 3  :    8208, 93084
    //     Output 3:    Armstrong Numbers between the Given Values is 9474, 54748, 92727.
    //     Explanation:
    //     Amrstong Numbers between the 8208 to 93084 is 9474, 54748, 92727.
        
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
	        
	        boolean armstrong = false;
	        int power = 0;
	        
	        if(startingRange > endingRange)
	        {
	            int a = startingRange;
	            startingRange = endingRange;
	            endingRange = a;
	        }
	        
	        for ( int i = startingRange + 1; i < endingRange ; i++ ) {
	            
	            power = NoOfDigits(i);
	            int dup = Armstrong(i, power);
	            if(dup == i){
	                System.out.print( !armstrong ? "Armstrong Numbers between the Given Values is "+i : ", "+i);
	                armstrong = true;
	            } 
	        }
	        
	        if(!armstrong) System.out.print("No Armstrong Numbers");
	        
	        System.out.print(".");
	        
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
