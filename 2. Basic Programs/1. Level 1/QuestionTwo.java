import java.util.Scanner;

class QuestionTwo
{
    static Scanner scan = new Scanner(System.in);   // For Taking the inputs from USER

    public static void main(String[] args) {
        // Question :   Write a program to perform Addition, Subtraction, Multiplication and Division of 2 Numbers 
        //              based on the user inputs by using Switch condition.(+ , - , * , /, %).
        
        // Constraints:
        // Input :               First line of input contains an Integer 
        
        //                           Second line of input contains an Integer 
        
        //                           Third line of Input Consists of Operator
        
        // Output :            Print Respective Output.
        
        // Constraints :    Operators Must accept only one of this Operators( +, -, *, /, % ) only.
        
        
        // Example:
        // Input  :     30 ,  10,  +
        // Output :   40 
        
        Answer();
	}
	
	public static void Answer(){
	    int firstNumber = scan.nextInt();
	    int secondNumber = scan.nextInt();
	    char symbol = scan.next().charAt(0);
	    if(symbol == '+'){
	        System.out.println("The symbol is "+symbol+" so we add : "+firstNumber+" + "+ secondNumber + " = " + (firstNumber + secondNumber));
	    }else if (symbol == '-' ){
	        System.out.println("The symbol is "+symbol+" so we substract : "+firstNumber+" - "+ secondNumber + " = " + (firstNumber - secondNumber));
	    }else if(symbol == '*'){
	        System.out.println("The symbol is "+symbol+" so we multiply : "+firstNumber+" * "+ secondNumber + " = " + (firstNumber * secondNumber));
	    }else if (symbol == '/'){
	        System.out.println("The symbol is "+symbol+" so we divide : "+firstNumber+" / "+ secondNumber + " = " + (firstNumber / secondNumber));
	    }else if (symbol == '%'){
	        System.out.println("The symbol is "+symbol+" so we mod : "+firstNumber+" % "+ secondNumber + " = " + (firstNumber % secondNumber));
	    }else{
	        System.out.println("Invalid Symbol");
	    }
	}
}
