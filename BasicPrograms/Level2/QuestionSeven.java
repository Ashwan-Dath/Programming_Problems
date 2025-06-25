package Programming_Problems.BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionSeven
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	
        // Question :   Write a program to print A,B in given number of times alternatively
        
        // Constraints:
        // Input :  First line of input contains Integer n 
        // Output : Print A,B for n no of times
        
        // Example:
        // Input :  5
        // Output : A,B,A,B,A,B,A,B,A,B
        
        // Explanation:
        // N/A
        
        
        
        Answer();
	}
	
	public static void Answer(){
        try{
            int n = scan.nextInt();
            for(int index = 1; index<=n ; index++){
                if( index == n ){
                    System.out.print("A,B");
                }else{
                    System.out.print("A,B,");
                }
            }
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	}
	
}
