import java.util.Scanner;

class Main
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        Answer();
	}
	
	public static void Answer(){
	    
	    try {
	        
	        String[] numberSystem = {"Binary", "Decimal", "Octal", "HexaDecimal"};
	        System.out.println("From which number system do you want to convert the number? ");
	        for (int i = 0; i< numberSystem.length ; i++ ){
	            System.out.println( i + 1 + ". " + numberSystem[i]);
	        } 
	        
	        System.out.print("Enter the Option Number : ");
	        int optionOne = scan.nextInt();
	        
	        numberSystem = remove(numberSystem, optionOne-1);
	        
	        System.out.println("To which number system do you want to convert the number? ");
            for (int i = 0; i< numberSystem.length ; i++ ){
	            System.out.println( i + 1 + ". " + numberSystem[i]);
	        }

	        System.out.print("Enter the Option Number : ");
	        int optionTwo = scan.nextInt();
	        
	        if(optionOne>0 && optionOne<= 4 && optionTwo>0 && optionTwo<=3) FirstOption(optionOne, optionTwo);
	        else System.out.print("Invalid Option.");

	    } catch(Exception e) {
	        System.out.print("Error Occured : "+ e);
	    }
	}
	
	public static void FirstOption(int optionOne, int optionTwo){
	    
	    if(optionOne == 1){
            
            System.out.print("Enter the Binary Number to convert : ");
            String bin = scan.next();
            if(!ValidBinary(bin)){
                System.out.println("Invalid Binary Number Input.");
                return;
            }

	        int dec = BinaryToDecimal(bin);
	        
	        if(optionTwo == 1){
	           // System.out.print(dec);
	            System.out.print("Decimal Form of "+bin+" is : "+dec);
	        }else if(optionTwo == 2){
	            String oct = DecimalToOctal(dec);
	           // System.out.print(oct);
	            System.out.print("Octal Form of "+bin+" is : "+oct);
	        }else if(optionTwo == 3){
	            String hex = DecimalToHexaDecimal(dec);
	           // System.out.print(hex);
	            System.out.print("HexaDecimal Form of "+bin+" is : "+hex);
	        }else{
	            System.out.print("Invalid Second Option.");
	        }


	    }else if ( optionOne == 2){

            System.out.print("Enter the Decimal Number to convert : ");
            int dec = scan.nextInt();
            
            if(!ValidDecimal(dec)){
                System.out.print("Invalid Decimal Input.");
                return;
            }
            
	        if(optionTwo == 1){
	            String bin = DecimalToBinary(dec);
	           // System.out.print(bin);
	            System.out.print("Binary Form of "+dec+" is : "+bin);
	        }else if(optionTwo == 2){
	            String oct = DecimalToOctal(dec);
	           // System.out.print(oct);
	            System.out.print("Octal Form of "+dec+" is : "+oct);
	        }else if(optionTwo == 3){
	            String hex = DecimalToHexaDecimal(dec);
	           // System.out.print(hex);
	            System.out.print("HexaDecimal Form of "+dec+" is : "+hex);
	        }else{
	            System.out.print("Invalid Second Options.");
	        }

	    }else if ( optionOne == 3 ){

            System.out.print("Enter the Octal Number to convert : ");
            int oct = scan.nextInt();
	        
	        if(!ValidOctal(oct)){
	            System.out.print("Invalid Octal Number Input.");
	            return;
	        }
	        
            int dec = OctalToDecimal(oct);
	        
	        if(optionTwo == 1){
	            String bin = DecimalToBinary(dec);
	           // System.out.print(bin);
	            System.out.print("Binary Form of "+oct+" is : "+bin);
	        }else if(optionTwo == 2){
	           // System.out.print(dec);
	            System.out.print("Binary Form of "+oct+" is : "+dec);
	        }else if(optionTwo == 3){
	            String hex = DecimalToHexaDecimal(dec);
	           // System.out.print(hex);
	            System.out.print("Binary Form of "+oct+" is : "+hex);
	        }else{
	            System.out.print("Invalid Second Option.");
	        }

	    }else {

            System.out.print("Enter the Hexa Decimal Number to convert : ");
            String hex = scan.next();
            if(!ValidHexaDecimal(hex)){
                System.out.println("Invalid HexaDecimal Number Input.");
                return;
            }
            
            int dec = HexaDecimalToDecimal(hex);
	        
	        if(optionTwo == 1){
	            String bin = DecimalToBinary(dec);
	           // System.out.print(bin);
	            System.out.print("Binary Form of "+hex+" is : "+bin);
	        }else if(optionTwo == 2){
	           // System.out.print(dec);
	            System.out.print("Decimal Form of "+hex+" is : "+dec);
	        }else if(optionTwo == 3){
	            String oct = DecimalToOctal(dec);
	           // System.out.print(oct);
	            System.out.print("Octal Form of "+hex+" is : "+oct);
	        }else{
	            System.out.print("Invalid Second Option.");
	        }
            
	    }
	}
	
    // This method is used to remove the Number system name once selected.
    public static String[] remove(String[] arr, int in) {

        if (arr == null || in < 0 || in >= arr.length) {
            return arr;
        }

          String[] arr2 = new String[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == in)
                continue;
            
              arr2[k++] = arr[i];
        }

        return arr2;
    }

	public static boolean ValidBinary(String number){
	    for(int i=0; i<number.length(); i++){
	        if(number.charAt(i) == '0' || number.charAt(i) == '1');
	        else return false;
	    }
	    return true;
	}
	
	public static boolean ValidDecimal(int number){
	    
	    if(number<0) number = -(number);
	    
	    while(true){
	        
	        int a = number % 10;
	        number /= 10;
	        if( a >= 0 && a <= 9 );
	        else return false;
	        
	        if(number == 0) break;
	        
	    }
	    
	    return true;
	}
	
	public static boolean ValidOctal(int number){
	    
	    if(number<0) number = -(number);
	    
	    while(true){
	        int a = number % 10;
	        
	        number /= 10;
	        
	        if(a>=0 && a<=7);
	        else return false;
	        
	        if(number == 0) break;
	        
	    }
	    return true;
	}
	
	public static boolean ValidHexaDecimal(String number){
	    for(int i=0; i<number.length(); i++){
	        if(number.charAt(i) == '0' || number.charAt(i) == '1' || number.charAt(i) == '2' || number.charAt(i) == '3' || number.charAt(i) == '4' || number.charAt(i) == '5' || number.charAt(i) == '6' || number.charAt(i) == '7' || number.charAt(i) == '8' || number.charAt(i) == '9' || number.charAt(i) == 'a' || number.charAt(i) == 'A' || number.charAt(i) == 'b' || number.charAt(i) == 'B' || number.charAt(i) == 'c' || number.charAt(i) == 'C' || number.charAt(i) == 'd' || number.charAt(i) == 'D' || number.charAt(i) == 'e' || number.charAt(i) == 'E' || number.charAt(i) == 'f' || number.charAt(i) == 'F');
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
	
	public static String DecimalToOctal(int number){

        String octalNumber = "";
       //  We have to divide with 8 inorder to get the OCTAL FORM.
        
        while(true){
            
            int bin = number%8;
            // Getting the Remainder when divided with 2
            
            number /= 8;
            
            
            octalNumber = bin+octalNumber;
           //  Adding remainder to the final binaryNumber (String).
            
            
            if(number==0) break;
           // if the decimalNumber reaches to 0 while dividing with 2 then we are breaking the loop.
        }

        return octalNumber;
	    
	}
	
	public static String DecimalToBinary(int number){
        
        String binaryNumber = "";
       //  We have to divide with 2 inorder to get the BINARY FORM.
        
        while(true){
            
            int bin = number%2;
            // Getting the Remainder when divided with 2
            
            number /= 2;
            	           
            
            binaryNumber = bin+binaryNumber;
           //  Adding remainder to the final binaryNumber (String).
            
            
            if(number==0) break;
           // if the decimalNumber reaches to 0 while dividing with 2 then we are breaking the loop.
        }
        
        return binaryNumber;
	}
	
	public static int BinaryToDecimal(String number){
        int dec = 0;
        number = ReverseString(number);
        for (int i = 0 ; i < number.length() ; i++ ){
            
            char dup = number.charAt(i);
            if(dup=='0');
            else{
                dec = dec + (int)Math.pow(2, i);
            }
        }   
            
        return dec;

	}
	
	public static int HexaDecimalToDecimal(String number){
	    
	    number = ReverseString(number);
	    int dec = 0;
	    
	    for (int i = 0; i < number.length() ; i++ ) {
	        
	        char a = number.charAt(i);
	        int b = 0;
	        
	        if (a >= '0' && a <= '9') b = a - '0';  // Convert the character to an integer
	        else{
	            if(a=='a' || a=='A') b = 10;
	            if(a=='b' || a=='B') b = 11;
	            if(a=='c' || a=='C') b = 12;
	            if(a=='d' || a=='D') b = 13;
	            if(a=='e' || a=='E') b = 14;
	            if(a=='f' || a=='F') b = 15;
	        }

	        dec = dec + ( b * (int)Math.pow(16, i));

	    }
	    
	    return dec;
	    
	}
	
	public static int OctalToDecimal(int number){
	    
	    int dec = 0;
	    int power = 0;
	    
	    while(true){
	        
	        int remainder = number%10;
	        
	        number /= 10;
	        
	        dec = dec + (remainder * (int)Math.pow(8, power++));
	        
	        if(number == 0) break;
	        
	    }
	    return dec;

	}
	
}