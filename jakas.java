// 	public static boolean ValidBinary(String number){
// 	    for(int i=0; i<number.length(); i++){
// 	        if(number.charAt(i) == '0' || number.charAt(i) == '1');
// 	        else return false;
// 	    }
// 	    return true;
// 	}
	
	
// 	public static String ReverseString(String number){
// 	    String temp = "";
// 	    for(int i = number.length()-1; i>=0;i--){
// 	        temp = temp+number.charAt(i);
// 	    }
// 	    return temp;
// 	}
	
	
// 	public static int BinaryToDecimal(String number){
// 	    int dec = 0;
//         for (int i = 0 ; i < number.length() ; i++ ){
//             char dup = number.charAt(i);
//             if(dup=='0');
//             else{
//                 dec = (dec + (int)Math.pow(2, i));
//             }
//         }   
        
//         return dec;

// 	}
	
// 	public static String DecimalToOctal(int number){
//         String octalNumer = "";

//         while(true){
            
//             int remainder = number % 8;
//             number /= 8;
            
//             octalNumer = remainder+octalNumer;
//             if(number==0) break;
//         }
//         return octalNumer;
// 	}



// 	public static String DecimalToHexaDecimal(int number){
// 	    String hexaDecimalNumber = "";
	    
//         while(true){
            
//             int remainder = number%16;
//             // Getting the Remainder when divided with 2
            
//             number /= 16;
            
//             if( remainder >= 10 ){
//                 if(remainder == 10) hexaDecimalNumber = "A"+hexaDecimalNumber;
//                 else if(remainder == 11) hexaDecimalNumber = "B"+hexaDecimalNumber;
//                 else if(remainder == 12) hexaDecimalNumber = "C"+hexaDecimalNumber;
//                 else if(remainder == 13) hexaDecimalNumber = "D"+hexaDecimalNumber;
//                 else if(remainder == 14) hexaDecimalNumber = "E"+hexaDecimalNumber;
//                 else hexaDecimalNumber = "F"+hexaDecimalNumber;
//             }
//             else hexaDecimalNumber = remainder+hexaDecimalNumber;
//             //  Adding remainder to the final binaryNumber (String).
            
            
//             if(number==0) break;
//            // if the decimalNumber reaches to 0 while dividing with 2 then we are breaking the loop.
           
//         }
//         return hexaDecimalNumber;
// 	}







// import java.util.Scanner;

// // Convert the Binary Number To hexa Decimal Number
// public class Main
// {
//     static Scanner scan = new Scanner(System.in);
    
// 	public static void main(String[] args) {
	    
//         // Q6 - Convert the Binary Number To hexa Decimal Number
//         // Write a program to Convert the Binary number to Hexa Decimal number?
        
        
//         // Constraints:
//         // Input   :   First line of input consists a String (Binary Value).
//         // Output :   Print the Hexa Decimal value of the Given Binary number.
//         // Constraints  :    Given Input consists of only 1's and 0's.
//         //              if the Given Input consists of any onther digit except 1 and 0 then print "Invalid input because of invalid Digits".
//         //              if the Given Input consists of small character then print "Invalid input because of small characters".
//         //              if the Given Input consists of capital character then print "Invalid input because of Capital characters".
//         //              if the Given Input consists of any Special characters then print "Invalid input because of Special characters".
        
        
//         // Example:
//         // Input 1    :    100111
//         // Output  1 :    27
        
         
        
//         // Input 2    :    1111
//         // Output  2 :    F
        
         
        
//         // Input 3    :    10011011
//         // Output  3 :    9B
        
        
//         // Explanation:
//         // Input 1    :    100111
//         // Output  1 :    27
//         // Explanation :
        
//         // Given Binary Number is 100111
//         //                   100111 = 1*20 + 1*21 + 1*22 + 0*23 + 0*24 + 1*25
//         //                               = 1 + 2 + 4 + 0 + 0 + 32
//         //                               = 39
//         // Decimal value of a Given Binary Number is 100111(2)  -->  39(10)
//         // Now, We have to find the Hexa Decimal value of this Decimal Number 
        
//         // 16 |   39   
//         // ---|-----------------
//         // 16 |   2    ->  7
//         // ---|-----------------
//         //     |    0     -> 2
//         // Hexa Decimal value of a Decimal Value is  39(10)  -->  27(16)
//         // Hexa Decimal Value of a Given Binary value is 100111(2)  -->  27(16)
        
         
        
         
        
//         // Input 2    :    1111
//         // Output  2 :    F
//         // Explanation :
//         // Given Binary Number is 1111
//         //                   1111 = 1*20 + 1*21 + 1*22 +  1*23
//         //                           = 1 + 2 + 4 + 8
//         //                           = 15
//         // Decimal value of a Given Binary Number is 1111(2)  -->  15(10)
//         // Now, We have to find the Hexa Decimal value of this Decimal Number 
//         // 16 |   15   
//         // ---|-----------------
//         //     |    0     -> 15
//         // Hexa Decimal value of a Decimal Value is 15(10)  -->  F(16)
//         // Hexa Decimal Value of a Given Binary value is 1111(2)  -->  F(16)
        
         
        
//         // Input 3    :    10011011
//         // Output  3 :    9B
//         // Explanation :
        
//         // Given Binary Number is 10011011
//         //                   10011011 = 1*20 + 1*2^1 + 0*2^2 +  1*2^3 + 1*2^4 + 0*2^5 + 0*2^6 + 1*2^7
//         //                                   = 1 + 2 + 0 + 8 + 16 + 0 + 0 + 128
//         //                                   = 155
//         // Decimal value of a Given Binary Number is 10011011(2)  -->  155(10)
//         // Now, We have to find the Hexa Decimal value of this Decimal Number 
//         // 16 | 155   
//         // ---|-----------------
//         // 16 |    9     -> B
//         // ---|-----------------
//         //     |    0     -> 9
//         // Hexa Decimal value of a Decimal Value is 153(10)  -->  9B(16)
//         // Hexa Decimal Value of a Given Binary value is 1111(2)  -->  9B(16)
        
         
        
        
//         // Public Test Cases:
//         // #	Input	  Expected Output
//         // 1	100111      27
//         // 2	1111        F
//         // 3	10011011    9B
        
//         Answer();
// 	}
	
//     public static String[] remove(String[] arr, int in) {

//         if (arr == null || in < 0 || in >= arr.length) {
//             return arr;
//         }

//           String[] arr2 = new String[arr.length - 1];

//         // Copy the elements except the index
//         // from original array to the other array
//         for (int i = 0, k = 0; i < arr.length; i++) {
//             if (i == in)
//                 continue;
            
//               arr2[k++] = arr[i];
//         }

//         return arr2;
//     }


// 	public static void Answer(){
	    
// 	    try {
	        
	        
// 	        String[] numberSystem = {"Binary", "Decimal", "Octal", "HexaDecimal"};
// 	        System.out.println("From which number system do you want to convert the number? ");
// 	        for (int i = 0; i< numberSystem.length ; i++ ){
// 	            System.out.println( i + 1 + ". " + numberSystem[i]);
// 	        } 
	        
// 	        System.out.println("Enter the Option Number : ");
// 	        int a = scan.nextInt();
	        
// 	        numberSystem = remove(numberSystem, a-1);
	        
// 	        System.out.println("To which number system do you want to convert the number? ");
//             for (int i = 0; i< numberSystem.length ; i++ ){
// 	            System.out.println( i + 1 + ". " + numberSystem[i]);
// 	        }

// 	        System.out.println("Enter the Option Number : ");
// 	        int b = scan.nextInt();
	        
	        
	        
// 	    } catch(Exception e) {
// 	        System.out.print("Error Occured : "+ e);
// 	    }
// 	}
	
	
// 	public static boolean ValidBinary(String number){
// 	    for(int i=0; i<number.length(); i++){
// 	        if(number.charAt(i) == '0' || number.charAt(i) == '1');
// 	        else return false;
// 	    }
// 	    return true;
// 	}
	
// 	public static boolean ValidHexaDecimal(String number){
// 	    for(int i=0; i<number.length(); i++){
// 	        if(number.charAt(i) == '0' || number.charAt(i) == '1' || number.charAt(i) == 'a' || number.charAt(i) == 'A' || number.charAt(i) == 'b' || number.charAt(i) == 'B' || number.charAt(i) == 'c' || number.charAt(i) == 'C' || number.charAt(i) == 'd' || number.charAt(i) == 'D' || number.charAt(i) == 'e' || number.charAt(i) == 'E' || number.charAt(i) == 'f' || number.charAt(i) == 'F');
// 	        else return false;
// 	    }
// 	    return true;
// 	}
	
	
// 	public static String ReverseString(String number){
// 	    String temp = "";
// 	    for(int i = number.length()-1; i>=0;i--){
// 	        temp = temp+number.charAt(i);
// 	    }
// 	    return temp;
// 	}
	
	
// 	public static int BinaryToDecimal(String number){
// 	    int dec = 0;
//         for (int i = 0 ; i < number.length() ; i++ ){
//             char dup = number.charAt(i);
//             if(dup=='0');
//             else{
//                 dec = (dec + (int)Math.pow(2, i));
//             }
//         }   
        
//         return dec;

// 	}
	
// 	public static String DecimalToHexaDecimal(int number){
// 	    String hexaDecimalNumber = "";
	    
//         while(true){
            
//             int remainder = number%16;
//             // Getting the Remainder when divided with 2
            
//             number /= 16;
            
//             if( remainder >= 10 ){
//                 if(remainder == 10) hexaDecimalNumber = "A"+hexaDecimalNumber;
//                 else if(remainder == 11) hexaDecimalNumber = "B"+hexaDecimalNumber;
//                 else if(remainder == 12) hexaDecimalNumber = "C"+hexaDecimalNumber;
//                 else if(remainder == 13) hexaDecimalNumber = "D"+hexaDecimalNumber;
//                 else if(remainder == 14) hexaDecimalNumber = "E"+hexaDecimalNumber;
//                 else hexaDecimalNumber = "F"+hexaDecimalNumber;
//             }
//             else hexaDecimalNumber = remainder+hexaDecimalNumber;
//             //  Adding remainder to the final binaryNumber (String).
            
            
//             if(number==0) break;
//            // if the decimalNumber reaches to 0 while dividing with 2 then we are breaking the loop.
           
//         }
//         return hexaDecimalNumber;
// 	}
// }



































// import java.util.Scanner;

// public class Main
// {
    
//     static Scanner scan = new Scanner(System.in);
    
// 	public static void main(String[] args) {
        	    
//         // 	Question : Write a program to print first n numbers in Fibonacci series by using Methods ?
        
        
//         // Constraints:
//         // Input :  First Line consists of Input 1(integer n).
//         // Output :  Print the first n fibonacci series.
//         // Constraints :  If the given value is lessthan Zero then convert into positive value.
//         //                If the given value is equal to zero Print "Invalid InPut".
        
        
//         // Example:
//         // Input 1 :    10
//         // Output 1 :    0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
        
         
        
//         // Input 2 :    16
//         // Output 2 :   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610.
        
//         Answer();
// 	}
	
// 	public static void Answer(){
	    
// 	    try {
	        
// 	        int range = scan.nextInt();
	        
// 	        int a = 0;
// 	        int b = 1;
// 	        System.out.print(a+" "+b);
// 	        for ( int i = 1 ; i <= range ; i++ ){
// 	            System.out.print(i==1 ? a : ", "+a);
// 	            a = a + b - (b = a + b);
// 	            b = a + b;
// 	        } 
	        
// 	    } catch(Exception e) {
// 	        System.out.print("Error Occured : "+ e);
// 	    }
// 	}
	
	
}




Importing java input/output library
import java.io.*;
 
class GFG {
 
    // Method to check whether number is neon or not
    // Boolean type
    public static boolean checkNeon(int n)
    {
        // squaring the number to be checked
        int square = n * n;
 
        // Initializing current sum to 0
        int sum = 0;
 
        // If product is positive
        while (square > 0) {
 
            // Step 1: Find remainder
            int r = square % 10;
 
            // Add remainder to the current sum
            sum += r;
 
            // Drop last digit of the product
            // and store the number
            square = square / 10;
        }
 
        // Condition check
        // Sum of digits of number obtained is
        // equal to original number
        if (sum == n)
 
            // number is neon
            return true;
        else
 
            // number is not neon
            return false;
    }
 
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input
        int n = 9;
 
        // Calling above function to check custom number or
        // if user entered number via Scanner class
        if (checkNeon(n))
 
            // Print number considered is neon
            System.out.println("Given number " + n
                               + " is Neon number");
        else
 
            // Print number considered is not neon
            System.out.println("Given number " + n
                               + " is not a Neon number");
    }
}



this is a new edit of the code after the ending of the day feels like tired and. didn't wanted to go the timing of the day shift making me feel like I didn't finished my thing's 