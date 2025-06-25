package Programming_Problems.BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionFive
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	
        // Question :   Write a Program to Print the following series 2*3,3*4,4*5,......16*17   
        //              (Print in two ways – Pattern & Multiplied value) .
        
        
        // Constraints:
        // Input   :  Two Integer Values
        
        // Output  :  Print the Respective Pattern from the Given Number(First Number) to the Given Number(Second Number), And
        //            Print the Respective Multiplied Value from the Given Number(First Number) to the Given Number(Second Number).
        
        
        // Example:
        // Input 1  :    2 16
        
        // Output 1 :    2*3, 3*4, 4*5, 5*6, 6*7, 7*8, 8*9, 9*10, 10*11, 11*12, 12*13, 13*14, 14*15, 15*16, 16*17
        //              = 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272

        
        // Input 2  :    10 1
        // Output 2 :   1*2, 2*3, 3*4, 4*5, 5*6, 6*7, 7*8, 8*9, 9*10, 10*11
        //            = 2, 6, 12, 20, 30, 42, 56, 72, 90, 110
        
        Answer();
	}
	
	public static void Answer(){
		try{
			
			int startingRange = scan.nextInt();
			int endingRange = scan.nextInt();
			
			if(startingRange > endingRange){
				solutionPrinting(endingRange, startingRange);
			}else{
				solutionPrinting(startingRange, endingRange);
			}
		}catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	    
	}
	
	public static void solutionPrinting(int start, int end){
	    
	    String values = "";
	    
	    for ( ; start <= end ; start++ ){
	        System.out.print( start + "*" + (start+1) + " ");
	        values += (start*(start+1)) + " ";
	    }
	    
	    System.out.print("\n "+values);
	}
	
	
}
