import java.util.Scanner;

// print the Average of the Alternative Armstrong Numbers between the Given Range

class QuestionEight 
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {


        // Question : Write a program to print the Average of the Alternative Armstrong Numbers between the Given Range?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        //                      Second Line of Input Consists of One Integer Value.
        // Output        :- Print the Average of All Alternative Armstrong Numbers.
        // Constraints  :- Either of the Given Inputs is equal to Zero then Print "Invalid Inputs.".
        //              If there is No Armstrong Numbers Between the Given Range then print No Armstrong Numbers in a Given Range.
        //              If Either of the Given Inputs is Negative then Convert into Positive and then Print the Average of all Alternative Armstrong Numbers.
        
        
        // Example:
        // Input 1  :    1 , 200
        // Output 1:    Average of Alternative Armstrong Numbers in the Given Range is ( 1 + 3 + 5 + 7 + 9 ) / 5 = 5.00
        // Explanation:
        // Amrstong Numbers in the Range of 1 to 200 is 1, 2, 3, 4, 5, 6, 7, 8, 9, 153.
        // Alternative Amrstong Numbers in the Range of 1 to 200 is 1, 3, 5, 7, 9.
        // Sum of Alternative Amrstong Numbers in the Range of 1 to 200 is 1 + 3 + 5 + 7 + 9 = 25.
        // Average of Alternative Amrstong Numbers in the Range of 1 to 200 is ( 1 + 3 + 5 + 7 + 9 ) / 5  =>  25 / 5  =>  5.00
        
        
        
        // Input 2  :   500 , 150
        // Output 2:    Average of Alternative Armstrong Numbers in the Given Range is ( 153 + 371 ) / 2 = 262.00
        // Explanation:
        // Amrstong Numbers in the Range of 150 to 500 is 153, 370, 371, 407.
        // Alternative Amrstong Numbers in the Range of 150 to 500 is 153, 371.
        // Sum of Alternative Amrstong Numbers in the Range of 150 to 500 is 153 + 371 = 524.
        // Average of Alternative Amrstong Numbers in the Range of 150 to 500 is ( 153 + 371 ) / 2   =>  524 /2   =>  262.00
        
        
        
        // Input 3  :    8208 , 93084
        // Output 3:    Average of Alternative Armstrong Numbers in the Given Range is ( 8208 + 54748 + 93084 ) / 3 = 52013.33.
        // Explanation:
        // Amrstong Numbers in the Range of 8208 to 93084 is 8208, 9474, 54748, 92727, 93084.
        // Alternative Amrstong Numbers in the Range of 8208 to 93084 is 8208, 54748, 93084.
        // Sum of Alternative Amrstong Numbers in the Range of 8208 to 93084 is 8208 + 54748 + 93084 = 156040.
        // Average of Alternative Amrstong Numbers in the Range of 8208 to 93084 is ( 8208 + 54748 + 93084 ) / 3  =>  156040 / 3   => 52013.33
        
        
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
	        int sum = 0;
	        int count = 0;
	        
	        if(startingRange > endingRange)
	        {
	            int a = startingRange;
	            startingRange = endingRange;
	            endingRange = a;
	        }
	        
	        for ( int i = startingRange  ; i <= endingRange ; i++ ) {
	            
	            power = NoOfDigits(i);
	            int dup = Armstrong(i, power);
	            if(dup == i){
	                alternative++;
	                if(alternative % 2 == 1){
	                    sum+=i;
	                    System.out.print( count == 0 ? "Average of Alternative Armstrong Numbers in the Given Range is ( "+i : " + "+i);
	                    count++;
	                }
	                
	            } 
	        }
	        
	        System.out.printf( count == 0 ? "No Armstrong Numbers." : " ) / %d = %.2f.",count,((float) sum/count) );
	       //                                                               |
	       //                                                               |
	       // I am using the PRINTF method to print the digits in a single statement.
	       // first %d represent the printing of the count variable
	       // Second %.2f represents the printing of the Decimal value uptp 2 decimal points for the Average.
	       
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
