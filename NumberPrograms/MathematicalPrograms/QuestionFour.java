package  NumberPrograms.MathematicalPrograms;

import java.util.Scanner;

// LCM of given three numbers

public class QuestionFour
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a program to print the LCM of given three numbers.
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (n1).
        //                  Second Line of Input Consists of One Integer Value (n2).
        //                  Third Line of Input Consists of One Integer Value (n3).
        // Output        :- Print the LCM of given three values.
        
        // Constraints  :-
        //              'n1' Value is Must be Greater than zero or else Print "InvalId First Input".
        //              'n2' Value is Must be Greater than zero or else Print "Invalid Second Input".
        //              'n3' Value is Must be Greater than zero or else Print "InvaliD ThirD Input".
        //              In the Given Three Inputs if any of two or three values are less than or equal to zero then Print "Sorry Invalid Inputs!".
        
        
        // Example:
        // Input 1  :    2, 5, 6
        // Output 1:    30
        
        // Input 2  :   12, -2, 4
        // Output 2:    Invalid Second Input
        
        

        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
	        int n1 = scan.nextInt();    
	        int n2 = scan.nextInt();    
	        int n3 = scan.nextInt();
	        
	        if(( n1 <= 0 && n2 <= 0 && n3 <= 0) || (n1 <= 0 && n2 <= 0) || (n1 <= 0 && n3 <= 0) || (n2 <= 0 && n3 <= 0) ){
	            System.out.print("Sorry Invalid Inputs!");
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
	        
	        int range = n1 > n2 ? n1 > n3 ? n1 : n3 : n2 > n3 ? n2 : n3;
            //  Finding the Largest number from the given numbers to run the loop backwards.
	        
	        while(true){
	            if(range % n1 == 0 && range % n2 == 0 && range % n3 == 0 ){
	               // System.out.printf(" LCM of " n1 + n2  + " " + n3 +" = "+range);
	                System.out.printf("LCM of %d, %d, %d is = %d",n1,n2,n3, range);
	                break;
	            }
	            range++;
	        }
	        
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
