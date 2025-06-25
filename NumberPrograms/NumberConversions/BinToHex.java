package  NumberPrograms.NumberConversions;

import java.util.Scanner;

// Convert the Binary Number To hexa Decimal Number
public class BinToHex
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Q6 - Convert the Binary Number To hexa Decimal Number
        // Write a program to Convert the Binary number to Hexa Decimal number?
        
        
        // Constraints:
        // Input   :   First line of input consists a String (Binary Value).
        // Output :   Print the Hexa Decimal value of the Given Binary number.
        // Constraints  :    Given Input consists of only 1's and 0's.
        //              if the Given Input consists of any onther digit except 1 and 0 then print "Invalid input because of invalid Digits".
        //              if the Given Input consists of small character then print "Invalid input because of small characters".
        //              if the Given Input consists of capital character then print "Invalid input because of Capital characters".
        //              if the Given Input consists of any Special characters then print "Invalid input because of Special characters".
        
        
        // Example:
        // Input 1    :    100111
        // Output  1 :    27
        
         
        
        // Input 2    :    1111
        // Output  2 :    F
        
         
        
        // Input 3    :    10011011
        // Output  3 :    9B
        
        
        // Explanation:
        // Input 1    :    100111
        // Output  1 :    27
        // Explanation :
        
        // Given Binary Number is 100111
        //                   100111 = 1*20 + 1*21 + 1*22 + 0*23 + 0*24 + 1*25
        //                               = 1 + 2 + 4 + 0 + 0 + 32
        //                               = 39
        // Decimal value of a Given Binary Number is 100111(2)  -->  39(10)
        // Now, We have to find the Hexa Decimal value of this Decimal Number 
        
        // 16 |   39   
        // ---|-----------------
        // 16 |   2    ->  7
        // ---|-----------------
        //     |    0     -> 2
        // Hexa Decimal value of a Decimal Value is  39(10)  -->  27(16)
        // Hexa Decimal Value of a Given Binary value is 100111(2)  -->  27(16)
        
         
        
         
        
        // Input 2    :    1111
        // Output  2 :    F
        // Explanation :
        // Given Binary Number is 1111
        //                   1111 = 1*20 + 1*21 + 1*22 +  1*23
        //                           = 1 + 2 + 4 + 8
        //                           = 15
        // Decimal value of a Given Binary Number is 1111(2)  -->  15(10)
        // Now, We have to find the Hexa Decimal value of this Decimal Number 
        // 16 |   15   
        // ---|-----------------
        //     |    0     -> 15
        // Hexa Decimal value of a Decimal Value is 15(10)  -->  F(16)
        // Hexa Decimal Value of a Given Binary value is 1111(2)  -->  F(16)
        
         
        
        // Input 3    :    10011011
        // Output  3 :    9B
        // Explanation :
        
        // Given Binary Number is 10011011
        //                   10011011 = 1*20 + 1*2^1 + 0*2^2 +  1*2^3 + 1*2^4 + 0*2^5 + 0*2^6 + 1*2^7
        //                                   = 1 + 2 + 0 + 8 + 16 + 0 + 0 + 128
        //                                   = 155
        // Decimal value of a Given Binary Number is 10011011(2)  -->  155(10)
        // Now, We have to find the Hexa Decimal value of this Decimal Number 
        // 16 | 155   
        // ---|-----------------
        // 16 |    9     -> B
        // ---|-----------------
        //     |    0     -> 9
        // Hexa Decimal value of a Decimal Value is 153(10)  -->  9B(16)
        // Hexa Decimal Value of a Given Binary value is 1111(2)  -->  9B(16)
        
         
        
        
        // Public Test Cases:
        // #	Input	  Expected Output
        // 1	100111      27
        // 2	1111        F
        // 3	10011011    9B
        
        Answer();
	}
	
	public static void Answer(){
	    
	    try {
	        
	        String binaryNumber = scan.nextLine();
	        
	        if(!ValidBinary(binaryNumber)){
	            System.out.print("Invalid InPut.");
	            return;
	        }
	        
	       // System.out.print("Decimal Number of "+binaryNumber+" is : ");
	        
	        String reversedNumber = ReverseString(binaryNumber);
	        
	        int decimalNumber = BinaryToDecimal(reversedNumber);
	        
	        System.out.println(decimalNumber);
	        
	        String hexaDecimalNumber = DecimalToHexaDecimal(decimalNumber);
	        
	        System.out.print(hexaDecimalNumber);

	    } catch(Exception e) {
	        System.out.print("Error Occured : "+ e);
	    }
	}
	
	
	public static boolean ValidBinary(String number){
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
	
	
	public static int BinaryToDecimal(String number){
	    int dec = 0;
        for (int i = 0 ; i < number.length() ; i++ ){
            char dup = number.charAt(i);
            if(dup=='0');
            else{
                dec = (dec + (int)Math.pow(2, i));
            }
        }   
        
        return dec;

	}
	
	public static String DecimalToHexaDecimal(int number){
	    String hexaDecimalNumber = "";
	    
        while(true){
            
            int remainder = number%16;
            // Getting the Remainder when divided with 2
            
            number /= 16;
            
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
            
            
            if(number==0) break;
           // if the decimalNumber reaches to 0 while dividing with 2 then we are breaking the loop.
           
        }
        return hexaDecimalNumber;
	}
}

