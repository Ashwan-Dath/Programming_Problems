package Programming_Problems.OperatorsPrograms;

public class MathematicalOperator
{
    //  This is experimenting the MATHEMATICAL OPERATOR  -, +, *, /, %
    public static void main(String [] args){ 
        // Easy Level
        Easy();

        // Medium Level
        Medium();

        // Hard Level
        Hard();
    }


    // This method is to demonstrate how all the Mathematical Operators works
    public static void Easy (){
        int a = 10;
        int b = 5;
        
        System.out.println(" a + b = " + (a + b));
        // This is just a normal '+' Addition operator which makes both the values add and result into a single value

        System.out.println(" a - b = " + (a - b));
        // This is just a normal '-' Substract operator which makes the 5 from 10 => 15

        System.out.println(" a * b = " + (a * b));
        // This is just a normal '*' Multiplication operator which makes  10 * 5 => 50

        System.out.println(" a / b = " + (a / b));
        // This is just a normal '/' Division operator which makes 10 divided by 5 but it gives 
        // the output of quotient like  10 / 5 => 2  

        System.out.println(" a % b = " + (a % b));
        // This is just a normal '%' Modulus operator which makes 10 divied by 5 but it gives the 
        // output of REMAINDER like 10 % 5 => 0
    }


    // Medium level: Demonstrating Mathematical operators
    public static void Medium (){
        int aa = 15;
        int bb = 10;

        // For complex expressions it will follow BODMAS rule 
        //  1. Bracket () : In any expression it will first do calculation present inside a bracket
        //  2. Order : Then it will look out for any roots and powers(exponents) and calculates
        //  3. Multiplication & Division : Then it will do calculation if both presents then it performs actions 
        //                                  from left to right 
        //  4. Addition & Substraction : Then it will do calculation if both presents then it performs actions 
        //                                  from left to right s
        
        System.out.println("aa + 10 * 5 - bb => " + (aa + 10 * 5 - bb));
        // First it will do Multiplication then substraction and addition 
        

        System.out.println("aa * bb - (10 - 5) => " + (aa * bb - (10 - 5)));
        // First it will do calculation present inside bracket (10 - 5) then it will do multiplication and sub


        // Practice questions
        System.out.println("5 - 7 * bb + (aa - 4) => " + (5 - 7 * bb + (aa - 4 )));
    }

    public static void Hard(){

        System.out.println(" 10 - 4 + (5 * (4 - (6 -3))) + 5 - (10 * (4 + (6 - (4 % 2) / (4 * 2)))) => " + (10 - 4 + (5 * (4 - (6 -3))) + 5 - (10 * (4 + (6 - (4 % 2) / (4 * 2))))));
        // First it will do calculations from the innermost brackets and then it will do Multiplication & division later it will Sub * Add and final result

    }
}