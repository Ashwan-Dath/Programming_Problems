package Programming_Problems.BasicPrograms.Level1;

import java.util.Scanner;

public class QuestionEight
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        
        // Question :   Write a program to print all numbers which are divisible by 11 
        //              in given range if no such numbers print NO NUMBERS if starting 
        //              range is greater than ending range then print INVALID RANGE
        
        
        // Constraints:
        // Input :  First line of input contains an Integer n reperesent starting range
        //          Second line of input contains an Integer n1 reperesent ending range
        
        // output :         all numbers which are divided by 11 in range
        
        
        // Example:
        // Input :       30 100
        
        // Output :     33 44 55 66 77 88 99
        
        
        // Explanation:
        // in the above example you have to print all 11 divisiors in range of 30 and 100
        
        
        Answer();
        
	}
	
	public static void  Answer(){
	    try{
            int startingNumber = scan.nextInt();
            int endingNumber = scan.nextInt();
            
            for( int start = startingNumber ; start <= endingNumber ; start++ ){
                
                System.out.print(   start % 11 == 0 ? start+" " : "" );
                // Here i first confirmed whether the number is perfectly divisible by 11 
                // If it is divided perfectly then it is the divisor of 11 and printed the number
            } 
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
        
	}
}
