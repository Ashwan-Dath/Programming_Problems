import java.util.Scanner;

// Print Sum of all the digits in a Given Number 
class QuestionEight
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a Program to Print Sum of the digits in a Given Number?
        //           If your input is 210 then you have to Print 3 as Output.
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Sum of Digits.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        // Example:
        // Input 1  :    210
        // Output 1:    3
        // Explanation:
        // 210  -->  2 + 1 + 0 = 3


        // Input 2  :    -6
        // Output 2:     Invalid Input
        // Explanation:
        // -6    -->   Invalid Input  ( Given Value is Less than Zero )


        // Input 3  :    648
        // Output 3:    18
        // Explanation:
        // 648  -->  6 + 4 + 8 = 18
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int number = scan.nextInt();

    	    if(number <= 0 ){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 

    	    int sum = 0;
    	    while(true){
    	        int a = number % 10;
    	        
    	        number = number/10;
    	        
    	        sum+=a;
    	        
    	        if(number == 0){
    	            break;
    	        }
    	    }
            
    	    System.out.print(sum);

	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
