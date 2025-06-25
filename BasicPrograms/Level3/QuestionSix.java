package Programming_Problems.BasicPrograms.Level3;

import java.util.Scanner;

public class QuestionSix
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question :   Write program to print the following series which is shown in Given Examples.
        
        // Constraints  :- if any negative number is given convert it into positive number and print.
        
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Following Series.
        
        
        // Example:
        // Input 1  :    36
        // Output 1 :  1, even, 3, even, 5, even, 7, even, 9, even, 11, even, 13, even, 15, even,
        //             17, even, 19, even, 21, even, 23, even, 25, even, 27, even, 29, even, 31, even, 33, even, 35, even
         
        
        // Input 2  :    -9        
        // Output 2 :    1, even, 3, even, 5, even, 7, even, 9
        
        
        // Explanation:
        // Just has to print even when it is even number.
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();
    	    
    	    range = range<0 ? -(range) : range; // convert to positive if it is negative
    	    
    	    for(int i = 1; i<= range; i++){
    	        System.out.print( (i % 2 == 0 ? "even" : i) + (i != range ? ", " : ""));
    	    }

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
