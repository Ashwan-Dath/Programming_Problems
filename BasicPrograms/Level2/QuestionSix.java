package Programming_Problems.BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionSix
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	
        // Question :   write a program to print all character by using char variable
        
        // Constraints:
        // Input :    Take a input 'a' in a char variable
        
        // Example:
        // a b c d e f g h i j k l m n o p q r s t u v w x y z
        
        // Explanation:
        // print all alphabets
        
        Answer();
	}
	
	public static void Answer(){
		try{
			char c = scan.next().charAt(0);
			if((int)c <= 122 && (int)c >= 97){
				for ( int i = (int)c; i<=122 ; i++ ){
					System.out.print( (char)i + " ");
				} 
			}else{
				System.out.print("INVALID INPUT");
			}
		}catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	}
	
}
