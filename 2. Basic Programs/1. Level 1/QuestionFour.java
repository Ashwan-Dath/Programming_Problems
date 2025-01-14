import java.util.Scanner;

class QuestionFour 
{
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    
        // Question :  Write a program to print "HI" for 'N' times
        
        // Constraints:
        // Input :              One Integer Value Consists in First Line of Input.
        
        // Output :           Print HI for 'N' Times.
        
        // Constraints :    10<N<100
        
        // Example:
        // Input 1 :      11
        
        // Output 1 :  CVCORP, CVCORP, CVCORP, CVCORP, CVCORP, CVCORP, CVCORP, CVCORP, CVCORP, CVCORP, CVCORP
        
        // Input 2 :      111
        
        // Output 2 :   Invalid Input
        
        
        Answer();
	}
	
	public static void  Answer(){
	    int range = scan.nextInt(); 
	    
	    if(range <= 10 || range >= 100){   // Just confirming that the range is between 11 to 99 only
	        System.out.println("INVALID RANGE");
	        return;     // Ending the program if the range is too low or too high
	    }  
	    
	    for (int start = 1; start <= range ; start++ ){   // For running a loop through the numbers
	        System.out.println(start + " : HI");
	    } 
	    
	}
}
