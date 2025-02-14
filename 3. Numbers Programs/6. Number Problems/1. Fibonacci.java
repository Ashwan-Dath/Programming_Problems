import java.util.Scanner;

class Main
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
    // Questions : Write a program to print first n numbers in Fibonacci series by using Methods ?
        
        
    //     Constraints:
    //     Input :   First Line consists of Input 1(integer n).
    //     Output :  Print the first n fibonacci series.
    //     Constraints :  If the given value is lessthan Zero then convert into positive value.
    //     If the given value is equal to zero Print "Invalid InPut".
        
        
    //     Example:
    //     Input 1 :    10
    //     Output 1 :    0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
        
         
        
    //     Input 2 :    16
    //     Output 2 :   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610.

        
        Answer();
        
	}
	
	public static void Answer(){
	   try {
    	    int range = scan.nextInt();
    	    
    	    if(range<=0){
    	        System.out.print("Invalid Range Input.");
    	        return;
    	    }
    	    
    	    long a = 0;
    	    long b = 1;
    	    long temp = 0;
    	    for (int i = 1; i <= range ; i++ ){
    	        
    	        System.out.print( i == 1 ? a : ", " + a );
    	        temp = a;
    	        a = b;
    	        b = temp + a;
    	    } 
    	    System.out.print(".");
	       
	   } catch(Exception e) {
	       System.out.print("Error Occured : " + e );
	   }
	}
	
}