package Programming_Problems.BasicPrograms.Level1;

import java.util.Scanner;

public class QuestionNine
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        
        // Question :   Write a progrm to perform given tasks
        //              Declare & initialize a number.
        //              Check whether the number is in range 0-100 or not.
        //              If not in range print INVALID INPUT
        //              Else – if the number is in range 91-100 then print SUPER SMART,
        //              81-90 print SMART,
        //              71-80 print SMART ENOUGH,
        //              61-70 print JUST SMART,
        //              36-60 print NO SMART,
        //              0-35 print DUMB.
        
        
        // Constraints:
        // Input :          First line of input contains an Integer n reperesent number
        
        // Output :       Print their status
        
        
        // Example:
        // Input :       62
        
        // Output :   JUST SMART
        
        
        // Explanation:
        // here the input is in 61-70 range so you have to print JUST SMART
        
        Answer();
        
	}
	
	
	
	public static void  Answer(){
		try{
			int n = scan.nextInt();
			
			if(n < 0 || n >= 100){   // Checking whether the given number is in range
				System.out.println("INVALID INPUT");
				return;
			}
			else if(n>=91 && n<100){    // Number must be in between 91-100
				System.out.println("SUPER SMART");
			}
			else if(n>=81 && n<=90){    // Number must be in between 81-90
				System.out.println("SMART");
			}
			else if(n>=71 && n<=80){    // Number must be in between 71-80
				System.out.println("SMART ENOUGH");
			}
			else if(n>=61 && n<=70){    // Number must be in between 61-70
				System.out.println("JUST SMART");
			}
			else if(n>=36 && n<=60){    // Number must be in between 36-60
				System.out.println("NO SMART");
			}
			else{   // Number must be in between 0-35
				System.out.println("DUMB");
			}
			
		}catch(Exception e){
            System.out.print("Exception occured : "+e);
        }

	}
	
	
}
