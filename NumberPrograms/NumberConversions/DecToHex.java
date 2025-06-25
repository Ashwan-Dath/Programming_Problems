package  NumberPrograms.NumberConversions;

import java.util.Scanner;

// Convert the Decimal number to HexaDecimal number

public class DecToHex
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	    // Q3 - Convert the Decimal number to Hexa Decimal number
        // Write a program to Convert the Decimal number to Hexa Decimal number?
        
        
        // Constraints:
        // Input   :   First line of input consists of One integer value (Decimal).
        // Output :   Print the Hexa Decimal value of Given Number.
        // Constraints  :    If Given Number is a Negative Value then convert the Negative Value into Positive Value. 
        //                         If Given Number is 0 then Print "Given Input is InValid.".
        
        
        // Example:
        // Input 1    :    152
        // Output  1 :    98
        
        
        // Input 2    :    253
        // Output  2 :    FD
        
        
        // Explanation:
        // Input 1    :    152
        // Output  1 :    98
        // Explanation : 
        
        //                   Given Number is 152
        // 16 |   152   
        // ---|-----------------
        // 16 |    9    ->  8
        // ---|-----------------
        //    |    0     ->  9
        // ---|-----------------
        // Hexa Deicmal Value of a Given Number 152 is  -->  98
        
        
        // Input 2    :    253
        // Output  2 :    FD
        // Explanation : 
        
        //                   Given Number is 253
        // 16 |   253   
        // ---|-----------------
        // 16 |    15    ->  13
        // ---|-----------------
        //    |     0     ->  15
        // ---|-----------------
        // Hexa Deicmal Value of a Given Number 253 is   --> 13 = D and 15 = F => FD  
        
        
        // 0 1 2 3 4 5 6 7 8 9  A   B   C   D   E   F   - Hexa Decimal FORM
        // 0 1 2 3 4 5 6 7 8 9 10  11  12  13  14  15   - Decimal FORM
        
        
        
        // Public Test Cases:
        // #	Input	Expected Output
        // 1	 152         98
        // 2	 253         FD
        
        
        Answer();
	}
	
	public static void Answer(){
	    
	    try {
	        
	        int decimalNumber = scan.nextInt(); 
	        int duplicate = decimalNumber;
	        
            if(decimalNumber < 0) decimalNumber = - (decimalNumber);

	        String hexaDecimalNumber = "";
	       //  We have to divide with 8 inorder to get the OCTAL FORM.
	        
	        while(true){
	            
	            int remainder = decimalNumber%16;
	            // Getting the Remainder when divided with 2
	            
	            decimalNumber /= 16;
	            
	            if( remainder >= 10 ){
	                if(remainder == 10) hexaDecimalNumber = "A"+hexaDecimalNumber;
	                else if(remainder == 11) hexaDecimalNumber = "B"+hexaDecimalNumber;
	                else if(remainder == 12) hexaDecimalNumber = "C"+hexaDecimalNumber;
	                else if(remainder == 13) hexaDecimalNumber = "D"+hexaDecimalNumber;
	                else if(remainder == 14) hexaDecimalNumber = "E"+hexaDecimalNumber;
	                else hexaDecimalNumber = "F"+hexaDecimalNumber;
	            }
                else hexaDecimalNumber = remainder+hexaDecimalNumber;
                //  Adding remainder to the final binaryNumber (String).
	            
	            
	            if(decimalNumber==0) break;
	           // if the decimalNumber reaches to 0 while dividing with 2 then we are breaking the loop.
	           
	        }
	        
	        System.out.print("HexaDecimal Number of "+ duplicate +  " is : " + hexaDecimalNumber);
	        
	    } catch(Exception e) {
	        System.out.print("Error Occured : "+ e);
	    }

	}
	
}
