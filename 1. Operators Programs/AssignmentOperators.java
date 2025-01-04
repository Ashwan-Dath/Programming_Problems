public class AssignmentOperators
{
    
	public static void main(String[] args) {
	    Easy();
	    //  If you understood the EASY Level go for Medium Level or else just learn easy level again
	   
        Medium();
	    //  If you understood the MEDIUM Level go for HARD Level or else just learn MEDIUM level again

        Hard();
	    //  If you understood the HARD Level go for next file.

        //  CORRECT ME IF I'm WRONG. (⁠•⁠‿⁠•⁠)
	}

    
    // This method is to demonstrate how all the Assignment Operators works
    public static void Easy(){
        
        
        // 1. Simple Assignment Operator
        int a = 10;     // = is responsible for assigning the value '10' value to variable 'a'
        int b = 5;      // 'a' is stored in the STACK area responsible for storing the local variables
        
        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);
        
        
        // 2. Complex Assignment Operator
        int c = 10, d = 5;
        System.out.println("c += d : " + (c += d));  
        // c += d;    =>   c = c + d => 15  Here it combines the c and d so 10 + 5 = ?
        
        int e = 10, f = 5;
        System.out.println("e -= f : " + (e -= f));
        // e -= f;    =>   e = e - f => 5   Here it substracts f from e so 10 - 5 = ?

        int g = 10, h =5;
        System.out.println("g *= h : " + (g *= h));
        // g *= h;    =>   g = g * h => 50  Here it multiplies g with h so 10 * 5 = ?
        
        int i = 10, j = 5;
        System.out.println("i %= j : " + (i %= j));
        // i %= j;    =>    i = i % j => 0  Here it gets the remainder value of when i divided by j so 10 % 5 = ? 
        
        int k = 10, l = 5;
        System.out.println("k /= l : " + (k /= l));
        // k /= l;    =>    k = k / l => 2  Here it gets the Quotient value when k divided by l so 10 / 5 = ?
    }
    

    //  This Method is to demostrate the Medium Level complexity of the Assignment Operator
    public static void Medium() {


        int a = 10;
        System.out.println(" a += 5 - 2 * 4 => "+ ( a += 5 - 2 * 4) );   // answer is 7 
        //  Here the calculation is evaluated as 
        //  a = a + (5 - 2 * 4)
        //  1. BODMAS RULE first calculate the values inside BRACKET => (5 - 2 * 4 )
        //  2. Then 2 * 4 => (5 - 8)
        //  3. Then 5 - 8 => (-3)
        //  4. Now a = 10, so  a = 10 + (-3) => 7
        //  5. Now a = 7;
        
        
        //  Now Same as the above explanation calculte the below questions
        int b = 2;
        System.out.println(" b -= 5 + 3 * 4 => "+ ( b -= 5 + 3 * 4) );   
        // This is evaluated as : b = 2 - (5 + 3 * 4);  => answer is = ?
 
        int c = 4;
        System.out.println(" c *= 2 - 4 / 2 => "+ ( c *= 2 - 4 / 2) );   
        // This is evaluated as : c = 4 * (2 - 4 / 2)   => answer is = ?
    
        int d = 20;
        System.out.println(" d %= 2 * 5 + 3 => "+ ( d %= 2 * 5 + 3) );   
        // This is evaluated as : d = 20 % (2 * 5 + 3)  => answer is = ?

        int e = 50;
        System.out.println(" e /= 5 + 2 - 4 => "+ ( e /= 5 + 2 - 4) );   
        // This is evaluated  as : e = 50 / (5 + 2 - 4) => answer is = ?
    }
    
    
    //  This Method is to demostrate the HARD Level complexity of the Assignment Operator
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
