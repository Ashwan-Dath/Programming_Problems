package  NumberPrograms.NumberConversions;

import java.util.Scanner;

// Convert the Binary number to Decimal number
public class BinToDec
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {

        // Q4 - Convert the Binary number to Decimal number
        // Write a program to Convert the Binary number to Decimal number?
        
        
        // Constraints:
        // Input   :   First line of input consists a String (Binary Value).
        // Output :   Print the Decimal value of a Given Binary number.
        // Constraints  :    The input must contains only 1's and 0's or else Print "InvAlid Input.".
        
        
        // Example:
        // Input 1    :    1101
        // Output  1 :    13
        
         
        
        // Input 2    :    10011000
        // Output  2 :    152
        
        
        // Explanation:
        // Input 1    :    1101
        // Output  1 :    13
        // Explanation : 
        
        //                   Given Binary Number is 1101
        //                   1101 = 1*2^0  + 0*2^1  + 1*2^2 + 1*2^3
        //                          = 1 + 0 + 4 + 8
        //                           = 13
        
        // Decimal value of a Given Number is 1101   -->  13
        
         
        
        // Input 2    :    10011000
        // Output  2 :    152
        // Explanation : 
        //                   Given Binary Number is 10011000
        //                   10011000 = 0*2^0 + 0*2^1 + 0*2^2  + 1*2^3  + 1*2^4 + 0*2^5 + 0*2^6 + 1*2^7 
        //                            = 0 + 0 + 0 + 8 + 16 + 0 + 0 + 128 
        //                            = 152
        // Decimal value of a Given Number 10011000 is    -->  152
        
         
        
        
        // Public Test Cases:
        // #	Input	  Expected Output
        // 1	1101        13
        // 2	10011000    152
        
        
        Answer();
	}
	
	public static void Answer(){
	    
	    try {
	        
	        String binaryNumber = scan.nextLine();
	        System.out.print("Decimal Number of "+binaryNumber+" is : ");
	        
	        int decimalNumber = 0;
	        
	        String reversedNumber = ReverseString(binaryNumber);
	       // System.out.print(reversedNumber);
	        for (int i = 0 ; i < reversedNumber.length() ; i++ ){
	            char dup = reversedNumber.charAt(i);
	            if(dup=='0');
	            else{
	                decimalNumber = (decimalNumber + (int)Math.pow(2, i));
	            }
	        }
	        System.out.print(decimalNumber);

	    } catch(Exception e) {
	        System.out.print("Error Occured : "+ e);
	    }
	}
	
	public static String ReverseString(String number){
	    String temp = "";
	    for(int i = number.length()-1; i>=0;i--){
	        temp = temp+number.charAt(i);
	    }
	    return temp;
	}
	
}