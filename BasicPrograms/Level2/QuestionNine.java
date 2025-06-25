package  BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionNine
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	
        // Question :   Write a program to print sum of all even numbers in between the Given Numbers 
        //              if no even numbers print NO NUMBERS if starting range is greater than ending range then print INVALID RANGE
        
        
        // Constraints:
        // Input :      First line of input contains an Integer n reperesent starting range
        //              Second line of input contains an Integer n1 reperesent ending range
        
        // Output :     Print sum of all even numbers in given range
        
        // Example:
        // Input :      20, 40
        // Output :       270
        
        
        // Explanation:
        // in the above example we have to sum all the even numbers in between 20 and 40
        // 22+24+26+28+30+32+34+36+38=270
        
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
            
            int sum = 0;
            
            for( n++ ; n < n1 ; n++ ){
                sum += n % 2 == 0 ? n : 0;
            }
            
            // If there are no even numbers then we are printing NO NUMBERS
            if(sum == 0){
                System.out.println("NO NUMBERS");
                return;
            } 
            
            // Sum stores all the even numbers added in it.
            System.out.println(sum);
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	}
	
}
