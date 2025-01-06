public class UnaryOperator
{
    // UNARY Operators => ++, -- , !
	public static void main(String[] args) {
	    Easy();
	    //  If you understood the EASY Level go for Medium Level or else just learn easy level again
	   
        Medium();
	    //  If you understood the MEDIUM Level go for HARD Level or else just learn MEDIUM level again

        Hard();
	    //  If you understood the HARD Level go for next file.

        //  CORRECT ME IF I'm WRONG. (⁠•⁠‿⁠•⁠)
	}

    
    // This method is to demonstrate how all the UNARY Operators works
    public static void Easy(){

        // "++" OPERATOR
        int a = 10;    
        System.out.println(" a++ => " + (a++));
        // The ++ operator adds 1 value to the 'a' variable and makes the a = 11
        // ++ is a shortcut for this expression : a = a + 1 => a = 10 + 1 => a = 11

        int c = 3;
        System.out.println(" ++c => " + (++c));
        // If ++ operator comes before the variable it also does the same job of adding 1 value to the variable


        // "--" OPERATOR
        int b = 5;
        System.out.println(" b-- => " + (b--));
        // The -- operator substracts 1 value from the 'a' variable and makes the b = 4;
        // -- is a shortcut for this expression : b = b - 1 => b = 5 - 1 => b = 4


        int d = 6;
        System.out.println(" --d => "+ (--d));
        // If -- operator comes before the variable it also does the same job of substracting 1 value from the variable

        
    }
    

    //  This Method is to demostrate the Medium Level complexity of the UNARY Operator
    public static void Medium() {
        int a = 2;
        int b = 5;
        
        System.out.println(" a++ + --b => " + (a++ + --b));  // a = 3 , b = 4
        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);
        // In the above expression 
        // 1. a++: first a variable value is taken into consideration that is 
        // 2. --b: first 1 value is substracted from 5 so 5-1 = 4 so 4 is now taken into consideration
        // 3. 2 + 4 => ANSWER is 6
        // NOTE: if the "++, --" Operators comes first then the value is sub, add then the resulted value is taken into consideration
        // NOTE: if the "++, --" Operators comes after then the value is taken into consideration and the value is calculated later.

        int c = 10;
        int d = 3;
        System.out.println(" --d-++c---c+--d =>"+ (--d-++c---c+--d));
        System.out.println("Value of c : "+ c);
        System.out.println("Value of d : "+ d);
        // it is evaluated as --d - ++c - --c + --d

        int e = 8;
        int f = 56;
        System.out.println(" e++ - f++ - --e - --e - --e - --f - --f + ++f + ++e => " + (e++-f++---e---e---e---f---f+++f+++e));
        System.out.println("Value of e : " + e);
        System.out.println("Value of f : " + f );
    }
    
    
    //  This Method is to demostrate the HARD Level complexity of the UNARY Operator
    public static void Hard() {


        int a = 10;
        int b = 5;
        System.out.println(" a += 5 - 2 * 4 => "+ ( a += b -= 2 * 4) );  
        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);
        //  Here the calculation is evaluated as 
        //  a = a + ( b = 5 - (2 * 4))
        //  1. BODMAS RULE first calculate the values inside BRACKET, inner Bracket first => (2 * 4 )
        //  2. Then 2 * 4 => (5 - 8)
        //  3. Then 5 - 8 => NOW  b = -3
        //  4. Now a = 10, so  a = 10 + (-3) => 7
        //  5. Now a = 7, b = -3
        //  6. ( a += b -= 2 * 4) this expression first has the 'a' variable so the value inside the 
        //      'a' variable is printed.
        
        // //  Now Same as the above explanation calculte the below questions
        int c = 2;
        int d = 4;
        System.out.println(" c *= d /= 2 => "+ ( c *= d /= 2 ) );  
        System.out.println("Value of c : "+ c);
        System.out.println("Value of d : "+ d);
        // This is evaluated as : c = 2 * (d = 4 / 2);  => Answer is : c = ?, d = ?;
        
        
        
        int e = 5;
        int f = 15;
        System.out.println(" e %= f -= 10 => "+ ( e %= f -= 10 ) );  
        System.out.println("Value of e : "+ e);
        System.out.println("Value of f : "+ f);
        // This is evaluated as : e = 5 % (f = 15 - 10);  => Answer is : e =?, f =? ;
    }
}
