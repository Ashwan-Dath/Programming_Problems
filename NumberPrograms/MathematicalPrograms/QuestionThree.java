package  NumberPrograms.MathematicalPrograms;

import java.util.Scanner;

// GCD of given two numbers

public class QuestionThree
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a program to print the GCD of given two numbers?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (n1).
        //                  Second Line of Input Consists of One Integer Value (n2).
        // Output        :- Print the GCD of given two values.
        
        // Constraints  :-
        //              Both the values 'n1' & 'n2' must be Greater than zero or else Print "Invalid Inputs".
        //              'n1' Value is Must be Greater than zero or else Print "Invalid First Input".
        //              'n2' Value is Must be Greater than zero or else Print "Invalid Second Input.".
        
        
        
        // Example:
        // Input 1  :    12, 3
        // Output 1:    3
        
        
        // Input 2  :   12, 16
        // Output 2:    4
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
	        int n1 = scan.nextInt();    
	        int n2 = scan.nextInt();    
	        
	        if( n1 <= 0 && n2 <= 0 ){
	            System.out.print("Invalid Inputs.");
	            return;
	        }else if( n1 <= 0 ){
	            System.out.print("Invalid First Input.");
	            return;	            
	        }else if( n2 <= 0 ){
	            System.out.print("Invalid Second Input.");
	            return;	            
	        }
	        
	        for ( int i = (n1 > n2 ? n1 : n2)  ; i >= 1  ; i-- ) {
	            if(n1 % i == 0 && n2 % i == 0){
	                System.out.print(i);
	                break;
	            }
	        }
	        
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
