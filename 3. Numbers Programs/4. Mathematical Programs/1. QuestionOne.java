import java.util.Scanner;

// Sum of Arithmetic progression series

class QuestionOne
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a Program to Print sum of the first 'n' terms by taking input of 1st term(a), 
        //              common difference(d) and No of terms(n) in the Arithmetic progression series? 
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (1st Term (a)).
        //                  Second Line of Input Consists of One Integer Value (Common Difference (d)).
        //                  Third Line of Input Consists of One Integer Value (No of Terms (n)).
        // Output        :- Print Sum of the Arithmetic Progression Values.
        
        
        // Constraints  :- 'a' Value is an any Integer Value.
        //                 'd' Value is an any Integer Value.
        //                 'n' Value is Must be Greater than zero or else Print "Invalid input".
        
        
        // Example:
        // Input 1  :    2, 4, 8
        // Output 1:    2 + 6 + 10 + 14 + 18 + 22 + 26 + 30 = 128.
        
        
        // Input 2  :   -11, 6, 11
        // Output 2:   -11 + -5 + 1 + 7 + 13 + 19 + 25 + 31 + 37 + 43 + 49 = 209.
        
        
        // Input 3  :    5, 9, -2
        // Output 3:    Invalid input.
        
        
        // Explanation:
        // NA
        
        
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
	        int number = scan.nextInt();        // Starting  number
	        int difference = scan.nextInt();    // difference b/w the numbers
	        int range = scan.nextInt();         // How many numbers of values to do
	        
	        
	        LogicalWay(number, difference, range);
	        
	        
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
	public static void LogicalWay(int number, int difference, int range){
	    
	    int Sum = 0;
        
        for (int i = 1; i <= range ; i++ ){ 
            Sum += number;
            System.out.print( i == 1 ? number : " + "+number ); 
            number += difference;
        } 
        
        System.out.print(" = "+Sum+".");
	}
	
}
