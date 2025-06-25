package  NumberPrograms.MathematicalPrograms;

import java.util.Scanner;

// GCD of given three numbers

public class QuestionFive
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a program to print the GCD of given three numbers?
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (n1).
        //                  Second Line of Input Consists of One Integer Value (n2).
        //                  Third Line of Input Consists of One Integer Value (n3).
        // Output        :- Print the GCD of given three values.
        
        // Constraints  :-
        //          'n1' Value is Must be Greater than zero or else Print "Invalid First Input".
        //          'n2' Value is Must be Greater than zero or else Print "Invalid Second Input".
        //          'n3' Value is Must be Greater than zero or else Print "Invalid Third Input".
        //          In the Given Three Inputs if any of two or three values are less than or Equal to zero then Print "Invalid Inputs".
        
        
        
        // Example:
        // Input 1  :    24, 34, 44
        // Output 1:    2
        
        
        // Input 2  :   12, 16, 48
        // Output 2:   4
        
        
        // Explanation:
        // NA        
        

        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
	        int n1 = scan.nextInt();    
	        int n2 = scan.nextInt();    
	        int n3 = scan.nextInt();
	        
	        if(( n1 <= 0 && n2 <= 0 && n3 <= 0) || (n1 <= 0 && n2 <= 0) || (n1 <= 0 && n3 <= 0) || (n2 <= 0 && n3 <= 0) ){
	            System.out.print("Invalid Inputs!");
	            return;
	        }else if( n1 <= 0 ){
	            System.out.print("Invalid First Input.");
	            return;	            
	        }else if( n2 <= 0 ){
	            System.out.print("Invalid Second Input.");
	            return;	            
	        }else if( n3 <= 0 ){
	            System.out.print("Invalid Third Input.");
	            return;	            
	            
	        }
	        
	        int range = n1 < n2 ? n1 < n3 ? n1 : n3 : n2 < n3 ? n2 : n3;
	        
	        
	        for (int i = range; i >= 1 ; i-- ){
	            if(n1 % i == 0 && n2 % i == 0  && n3 % i == 0 ){
	                System.out.printf("GCD of %d, %d, %d is : %d", n1, n2, n3, i);
	                break;
	            }
	        } 
	        
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
