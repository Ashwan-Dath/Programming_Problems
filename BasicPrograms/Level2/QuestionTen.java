package  BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionTen
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
	//      Question : Write a Program to Print the Alternative Even Numbers Between the Given Numbers?
        
        
    //     Constraints:
    //     Input        :  Two Integer Values
    //     Output       :  All Alternative Even Numbers Between the Given Numbers
        
    //     Constraints  :  All the Given inputs Must be Greater than Zero, or else Print "Invalid Inputs".
        
        
    //     Example:
    
    //     Input 1    :  10 30
    //     Output 1   :  12 16 20 24 28
    
    
    //     Input 2    :  5 25
    //     Output 2   :  6 10 14 18 22
    
    //     Input 3     :  -5 25
    //     Output 3    :  Invalid Inputs
        
        
    //     Explanation:
    //     NA
        
        Answer();
	}
	
	public static void Answer(){
        try{
            int n = scan.nextInt();
            int n1 = scan.nextInt();
            
            if( n < 0 || n1 < 0 ){
                System.out.println("INVALID INPUTS");
                return;
            }
            
            if(n>n1)
            {
                System.out.println("INVALID RANGE");
                return;
            }
            
            for( n++ ; n < n1 ; n++ ){
                if(n%2==0){
                    System.out.print(n+" ");
                    n+=2;
                }
            }
            
        }catch(Exception e){
            System.out.print("Exception occured : "+e);
        }

	}
	
}
