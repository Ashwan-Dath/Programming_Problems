import java.util.Scanner;

// Convert the Decimal number to Binary number

class DecToBin
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	   // Q1 - Convert the Decimal number to Binary number
    //     Write a program to Convert the Decimal number to Binary number?
        
        
    //     Constraints:
    //     Input   :   First line of input consists of One integer value (decimal).
    //     Output :   Print the Binary value of a Given Number.
        
    //     Constraints  :    If Given Number is a Negative Value then convert that Negative Value into Positive Value. 
    //                           If the Given Number is 0 then Print "Zero"
        
        
    //     Example:
    //     Input 1    :    25
    //     Output  1 :    11001
         
        
    //     Input 2    :    -16
    //     Output  2 :    10000
        
        
    //     Explanation:
    //     Input 1    :    25
    //     Output  1 :    11001
    //     Explanation : 
        
    //                       Given Number is 25
    //      2 |   25   
    //     ---|-----------------
    //      2 |   12    ->  1
    //     ---|-----------------
    //      2 |    6     ->  0
    //     ---|-----------------
    //      2 |    3     ->  0
    //     ---|-----------------
    //      2 |    1     ->  1
    //     ---|-----------------
    //      2 |    0     ->   1
    //     ---|-----------------
        
    //     Binary value of a Given Number 25  is      -->  11001
        
         
        
    //     Input 2    :    -16
    //     Output  2 :    10000
        
         
    //     Explanation : 
    //                       Given Number is -16 so convert this number to positive then the number is 16
    //      2 |   16   
    //     ---|-----------------
    //      2 |    8    ->  0
    //     ---|-----------------
    //      2 |    4    ->  0
    //     ---|-----------------
    //      2 |    2    ->  0
    //     ---|-----------------
    //      2 |    1    ->  0
    //     ---|-----------------
    //      2 |    0    ->   1
    //     ---|-----------------
    //     Binary value of a Given Number  -16 is --> 10000  
        
        
    //     Public Test Cases:
    //     #	Input	Expected Output
    //     1     25      11001
    //     2	-16      10000
    
    Answer();
        	    
	}
	
	public static void Answer(){
	    
	    try {
	        
	        int decimalNumber = scan.nextInt(); 
	        
            if(decimalNumber < 0) decimalNumber = - (decimalNumber);

	        String binaryNumber = "";
	       //  We have to divide with 2 inorder to get the BINARY FORM.
	        
	        while(true){
	            
	            int bin = decimalNumber%2;
	            // Getting the Remainder when divided with 2
	            
	            decimalNumber /= 2;
	            	           
	            
	            binaryNumber = bin+binaryNumber;
	           //  Adding remainder to the final binaryNumber (String).
	            
	            
	            if(decimalNumber==0) break;
	           // if the decimalNumber reaches to 0 while dividing with 2 then we are breaking the loop.
	        }
	        
	        System.out.printf(binaryNumber);
	        
	    } catch(Exception e) {
	        System.out.print("Error Occured : "+ e);
	    }

	}
	
}