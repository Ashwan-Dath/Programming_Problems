import java.util.Scanner;

// find Factorial of a Given Number

class QuestionNine 
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {


        // Question : Write a program to find Factorial of a Given Number?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Factorial of a Given Number.
        // Constraints  :- Given Inputs Must be Greater than or equal to Zero or else Print Invalid InPut.
        
        // Example:
        
        // Input 1  :    6
        // Output 1:    720
        // Explanation :
        // Factorial = 6 * 5 * 4 * 3 * 2 * 1
        //              = 720
         
        // Input 2  :   5
        // Output 2:   120
        // Explanation :
        // Factorial = 5 * 4 * 3 * 2 * 1
        //              = 120        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        int number = scan.nextInt();
	        
	        if(number<=0){
	            System.out.print("Invalid Input");
	            return;
	        }
	        
	        SimpleLogic(number);    // Logic 1
	       //  This is a simple logic of running a loop from 1 to number and multiplying.
	       
	       
	       // System.out.print( RecurssiveFactorial(number) );    // logic 2
	       // Uncomment this line to run and see how the code works.
	       //  This is a method where we used the Recurssive method to see how the recurssive method works?

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	public static void SimpleLogic(int number){
	    int factorial = 1;
	    for (int i = 1 ; i <= number ; i++ ){
	        factorial *= i;
	    } 
	    System.out.print(factorial);
	}
	
	
	
	public static int RecurssiveFactorial(int number){
	    
        // factorial of 0 or 1 is 1
        if (number == 0 || number == 1) {
            return 1;
        }
        
        return number * RecurssiveFactorial(number - 1);
	    
	}
	

}
