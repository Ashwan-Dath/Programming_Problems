import java.util.Scanner;

// print the Alternative Armstrong Numbers between the Given Values

class QuestionFive 
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {

        
        // Question : Write a program to print the Alternative Armstrong Numbers between the Given Values?
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        //                   Second Line of Input Consists of One Integer Value.
        // Output        :- Print the All Alternative Armstrong Numbers.
        // Constraints  :- Either of the Given Inputs is Equal to Zero then Print "Invalid Inputs".
        //          If there is No Armstrong Numbers Between the Given Values then print "No Armstrong Numbers Between Given Values.".
        //          If Either of the Given Inputs is Negative then Convert into Positive and then Print the Alternative Armstrong Numbers.
        
        // Example:
        // Input 1  :    1 , 200
        // Output 1:    Alternative Armstrong Numbers between the Given Values is 2, 4, 6, 8, 153.
        // Explanation:
        // Amrstong Numbers between the 1 to 200 is 2, 3, 4, 5, 6, 7, 8, 9, 153.
        // Alternative Armstrong Numbers between the Given Values is 2, 4, 6, 8, 153.


        // Input 2  :   500, 150
        // Output 2:  Alternative Armstrong Numbers between the Given Values is 153, 371.
        // Explanation:
        // Amrstong Numbers between the 150 to 500 is 153, 370, 371, 407.
        // Alternative Armstrong Numbers between the Given Values is 153, 371.


        // Input 3  :    8208, 93084
        // Output 3:    Alternative Armstrong Numbers between the Given Values is 9474, 92727.
        // Explanation:
        // Amrstong Numbers between the 8208 to 93084 is 9474, 54748, 92727.
        // Alternative Armstrong Numbers between the Given Values is 9474, 92727.        
        

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
	        int alternative = 0;
	        
	        if(startingRange > endingRange)
	        {
	            int a = startingRange;
	            startingRange = endingRange;
	            endingRange = a;
	        }
	        
	        for ( int i = startingRange + 1 ; i <= endingRange ; i++ ) {
	            
	            power = NoOfDigits(i);
	            int dup = Armstrong(i, power);
	            if(dup == i){
	                
	                alternative++;
	                System.out.print( alternative % 2 == 1 ? alternative == 1 ? "Alternative Armstrong Numbers between the Given Values is "+i : ", "+i : "");
	            } 
	        }
	        
	        System.out.print( alternative == 0 ? "No Armstrong Numbers." : "." );

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
