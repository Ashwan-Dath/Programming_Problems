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
        int aa = 2;
        int bb = 5;
        
        System.out.println(" aa++ + --bb => " + (aa++ + --bb));  // aa = 3 , bb = 4
        System.out.println("Value of aa : "+ aa);
        System.out.println("Value of bb : "+ bb);
        // In the above expression 
        // 1. aa++: first aa variable value is taken into consideration that is 
        // 2. --bb: first 1 value is substracted from 5 so 5-1 = 4 so 4 is now taken into consideration
        // 3. 2 + 4 => ANSWER is 6
        // NOTE: if the "++, --" Operators comes first then the value is sub, add then the resulted value is taken into consideration
        // NOTE: if the "++, --" Operators comes after then the value is taken into consideration and the value is calculated later.

        int cc = 10;
        int dd = 3;
        System.out.println(" --dd - ++cc - --cc + --dd =>"+ (--dd - ++cc - --cc + --dd));
        System.out.println("Value of cc : "+ cc);
        System.out.println("Value of dd : "+ dd);
        // it is evaluated as --dd - ++cc - --cc + --dd

        int ee = 8;
        int ff = 56;
        System.out.println(" ee++ - ff++ - --ee - --ee - --ee - --ff - --ff + ++ff + ++ee => " + (ee++ - ff++ - --ee - --ee - --ee - --ff - --ff + ++ff + ++ee));
        System.out.println("Value of ee : " + ee);
        System.out.println("Value of ff : " + ff );
    }
    
    
    //  This Method is to demostrate the HARD Level complexity of the UNARY Operator
    public static void Hard() {


        int aaa = 10;
        int bbb = 5;
        System.out.println(" aaa++ + --bbb * 4 / 2 => "+ ( aaa++ + --bbb * 4 / 2) );  
        System.out.println("Value of aaa : "+ aaa);
        System.out.println("Value of bbb : "+ bbb);
        //  Here the calculation is evaluated as 
        //  aaa = 10 + 4 * 4 / 2 
        //  1. BODMAS RULE first calculate the values inside BRACKET, inner Bracket first => (2 * 4 )
        //  2. Then 2 * 4 => (5 - 8)
        //  3. Then 5 - 8 => NOW  bbb = -3
        //  4. Now aaa = 10, so  aaa = 10 + (-3) => 7
        //  5. Now aaa = 7, bbb = -3
        //  6. ( aaa += bbb -= 2 * 4) this expression first has the 'aaa' variable so the value inside the 
        //      'aaa' variable is printed.
    }
}
