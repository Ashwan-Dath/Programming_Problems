import java.util.Scanner;

// LCM of given two numbers

class QuestionTwo
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a program to print the LCM of given two numbers
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value (n1).
        //                  Second Line of Input Consists of One Integer Value (n2).
        // Output        :- Print the LCM of given two values.
        
        // Constraints  :-
        //          Both the values 'n1' & 'n2' must be Greater than zero or else Print "Invalid Inputs.".
        //          'n1' Value is Must be Greater than zero or else Print "Invalid First Input".
        //          'n2' Value is Must be Greater than zero or else Print "InValid Second Input".
        

        
        // Example:
        // Input 1  :    2, 4
        // Output 1:    4
        
        
        // Input 2  :   12, -2
        // Output 2:  Invalid Second Input
        
        
        
        
        
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
	        
	        int range = n2;
	        
	        if( n1 > n2 ) range = n1;
	        
	        while(true){
	            
	            if(range % n1 == 0 && range % n2 == 0){
	           //   We are dividing the value with our both n1 and n2 numbers if any number is divided with both numbers 
	           //   Then we are printing the first number it is the LCM of the both numbers
	           
	                System.out.print(range);
	                break;
	               // Breaking the loop after we are printing the first LCM of the both values
	            }
	            
	            range++;
	        }

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
	
}
