import java.util.Scanner;

// Factors of a given number
class QuestionOne
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   
        // Question : Write a program to print all factors of the Given Number.
	
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print All the Factors of a Given Number.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        
        // Example:
        // Input 1  :    18
        // Output 1:    1 2 3 6 9 18
         
        
        // Input 2  :    -6
        // Output 2:     Invalid Input
        
        
        // Explanation:
        // 18     -->   1 2 3 6 9 18   If u divide 18 with these Numbers(1 2 3 6 9 18) then u can get remiander as 0 in all these scenarios.
        // -6      -->   Invalid Input  ( Given Number is Not Greater than Zero )
        

        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();
    	    
    	    if(range <= 0){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    
    	    for ( int i = 1; i <= range ; i++ ){
    	        System.out.print( range % i == 0 ? i+" " : "");
    	       //                       |
    	       // This condition is to check whether our number is divisible by the the number or not
    	    } 

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
