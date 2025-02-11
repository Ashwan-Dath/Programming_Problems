import java.util.Scanner;

// Convert the Decimal number to Octal number

class DecToOct
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        //     Q2 - Convert the Decimal number to Octal number
        // Write a program to Convert the Decimal number to Octal number?
        
        
        // Constraints:
        // Input   :   First line of input consists of One integer value (Decimal).
        // Output :   Print the Octal value of Given Number.
        // Constraints  :   If Given Number is a Negative Value then convert it into Positive Value and run the program.
        //                  If the Giiven Number is 0 then print "ZERO".
        
        
        // Example:
        // Input 1    :    26
        // Output  1 :    32
        
         
        
        // Input 2    :    -15
        // Output  2 :    INVALID Input
        
        
        // Explanation:
        // Input 1    :    26
        // Output  1 :    32
        // Explanation : 
        
        //                   Given Number is 26
        //  8 |   26   
        // ---|-----------------
        //  8 |    3    ->  2
        // ---|-----------------
        //     |    0    ->  3  
        // Octal value of a Given Number 26 is   -->  32
        
         
        
        // Input 2    :    -15
        // Output  2 :      17
        // Explanation : 
        //                   Given Number is -15 convert it into Positive 15.
        //  8 |   15   
        // ---|-----------------
        //  8 |    1    ->  7
        // ---|-----------------
        //     |    0    ->  1  
        // Octal value of a Given Number -15 is   -->  17


        // Public Test Cases:
        // #	Input	Expected Output
        // 1     26      32
        // 2	-15      17
        
        Answer();
	}
	
	public static void Answer(){
	    
	    try {
	        
	        int decimalNumber = scan.nextInt(); 
            
            int duplicate = decimalNumber;
	        
            if(decimalNumber < 0) decimalNumber = - (decimalNumber);

	        String octalNumber = "";
	       //  We have to divide with 8 inorder to get the OCTAL FORM.
	        
	        while(true){
	            
	            int bin = decimalNumber%8;
	            // Getting the Remainder when divided with 2
	            
	            decimalNumber /= 8;
	            
	            
	            octalNumber = bin+octalNumber;
	           //  Adding remainder to the final binaryNumber (String).
	            
	            
	            if(decimalNumber==0) break;
	           // if the decimalNumber reaches to 0 while dividing with 2 then we are breaking the loop.
	        }
	        
            System.out.print("Octal Number of "+ duplicate +  " is : " + octalNumber);

	    } catch(Exception e) {
	        System.out.print("Error Occured : "+ e);
	    }

	}
	
}