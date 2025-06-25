package Programming_Problems.BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionEight
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	
        // Question : Write a program to print all Odd Numbers in Given Range.
        //            if starting range is greater than ending range print "INVALID RANGE"
        
        
        // Constraints:
        // Input :  First line of input contains Integer n represent starting index
        //          Second line of input contains Integer n1 represents ending index
        
        // Output :           Print All the Odd Numbers in a Given Range
        
        
        // Example:
        // Input :            1 10
        // Output :         1 3 5 7 9
        
        // Explanation:
        // in the above example you have to print all the odd numbers in range of 1 to 10 they are 1 3 5 7 9
        
        Answer();
	}
	
	public static void Answer(){
        try{
            int n = scan.nextInt();
            int n1 = scan.nextInt();
            if(n>n1){
                System.out.println("INVALID RANGE");
                return;
            }
            
            for( ; n<=n1 ; n++ ){
                System.out.print( n % 2 == 1 ? n + " " : "" );
            }
            
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	}
	
}
