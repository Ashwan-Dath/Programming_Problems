package  NumberPrograms.NumberConversions;

import java.util.Scanner;

// Convert the Binary number to Octal number
public class BinToOct
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Q5 - Convert the Binary number to Octal number
        // Write a program to Convert the Binary number to Octal number.
        
        
        // Constraints:
        // Input   :   First line of input consists a String (Binary Value).
        // Output :   Print the Octal value of a Given Binary number.
        // Constraints  : The input must contains only 1's and 0's or else Print "Invalid InPut".
        
        
        // Example:
        // Input 1    :    1101
        // Output  1  :    15
        
        
        // Input 2    :    1AB11
        // Output  2  :    Invalid InPut
        
        
        
        // Explanation:
        // Input 1    :    1101
        // Output  1  :    15
        // Explanation : 
        
        //                   Given Binary Number is 1101
        //                   1101 = 1*2^0 + 0*2^1 + 1*2^2 + 1*2^3
        //                        = 1 + 0 + 4 + 8
        //                        = 13
        // Decimal value of a Given Number 1101 is    -->  13
        
        // Now We have to Find Octal value of this Deicmal Value,
        //  8 | 13
        // ---|--------------
        //  8 |  1  -> 5
        // ---|--------------
        //    |  0  ->  1
        // Octal value of a Decimal Number 13 is  -->  15
        // So Octal value of a Given Binary Value 1101 is   -->   15
        
        
        // Input 2    :    1AB11
        // Output  2 :    Invalid InPut
        
        
        // Public Test Cases:
        // #	Input	Expected Output
        // 1	 1101        15
        // 2	 1AB11   Invalid InPut
        
        Answer();
	}
	
	public static void Answer(){
	    
	    try {
	        
	        String binaryNumber = scan.nextLine();
	        
	        if(!ValidString(binaryNumber)){
	            System.out.print("Invalid InPut.");
	            return;
	        }
	        
	        System.out.print("Decimal Number of "+binaryNumber+" is : ");
	        int decimalNumber = 0;
	        
	        String reversedNumber = ReverseString(binaryNumber);

	        for (int i = 0 ; i < reversedNumber.length() ; i++ ){
	            char dup = reversedNumber.charAt(i);
	            if(dup=='0');
	            else{
	                decimalNumber = (decimalNumber + (int)Math.pow(2, i));
	            }
	        }

	        String octalNumer = "";
	        
	        while(true){
	            
	            int remainder = decimalNumber % 8;
	            decimalNumber /= 8;
	            
	            octalNumer = remainder+octalNumer;
	            if(decimalNumber==0) break;
	        }
	        
	        System.out.print(octalNumer);

	    } catch(Exception e) {
	        System.out.print("Error Occured : "+ e);
	    }
	}
	
	public static boolean ValidString(String number){
	    for(int i=0; i<number.length(); i++){
	        if(number.charAt(i) == '0' || number.charAt(i) == '1');
	        else return false;
	    }
	    return true;
	}
	
	public static String ReverseString(String number){
	    String temp = "";
	    for(int i = number.length()-1; i>=0;i--){
	        temp = temp+number.charAt(i);
	    }
	    return temp;
	}
	
}