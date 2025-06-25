package  OperatorsPrograms;

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


        int aa = 10;
        System.out.println(" aa += 5 - 2 * 4 => "+ ( aa += 5 - 2 * 4) );   // answer is 7 
        //  Here the calculation is evaluated as 
        //  aa = aa + (5 - 2 * 4)
        //  1. BODMAS RULE first calculate the values inside BRACKET => (5 - 2 * 4 )
        //  2. Then 2 * 4 => (5 - 8)
        //  3. Then 5 - 8 => (-3)
        //  4. Now aa = 10, so  a = 10 + (-3) => 7
        //  5. Now aa = 7;
        
        
        //  Now Same as the above explanation calculte the below questions
        int bb = 2;
        System.out.println(" bb -= 5 + 3 * 4 => "+ ( bb -= 5 + 3 * 4) );   
        // This is evaluated as : bb = 2 - (5 + 3 * 4);  => answer is = ?
 
        int cc = 4;
        System.out.println(" cc *= 2 - 4 / 2 => "+ ( cc *= 2 - 4 / 2) );   
        // This is evaluated as : cc = 4 * (2 - 4 / 2)   => answer is = ?
    
        int dd = 20;
        System.out.println(" dd %= 2 * 5 + 3 => "+ ( dd %= 2 * 5 + 3) );   
        // This is evaluated as : dd = 20 % (2 * 5 + 3)  => answer is = ?

        int ee = 50;
        System.out.println(" ee /= 5 + 2 - 4 => "+ ( ee /= 5 + 2 - 4) );   
        // This is evaluated  as : ee = 50 / (5 + 2 - 4) => answer is = ?
    }
    
    
    //  This Method is to demostrate the HARD Level complexity of the Assignment Operator
    public static void Hard() {


        int aaa = 10;
        int bbb = 5;
        System.out.println(" aaa += bbb -= 2 * 4 => "+ ( aaa += bbb -= 2 * 4) );  
        System.out.println("Value of aaa : "+ aaa);
        System.out.println("Value of bbb : "+ bbb);
        //  Here the calculation is evaluated as 
        //  aaa = aaa + ( bbb = 5 - (2 * 4))
        //  1. BODMAS RULE first calculate the values inside BRACKET, inner Bracket first => (2 * 4 )
        //  2. Then 2 * 4 => (5 - 8)
        //  3. Then 5 - 8 => NOW  b = -3
        //  4. Now aaa = 10, so  aaa = 10 + (-3) => 7
        //  5. Now aaa = 7, bbb = -3
        //  6. ( aaa += bbb -= 2 * 4) this expression first has the 'aaa' variable so the value inside the 
        //      'aaa' variable is printed.
        
        // //  Now Same as the above explanation calculte the below questions
        int ccc = 2;
        int ddd = 4;
        System.out.println(" ccc *= ddd /= 2 => "+ ( ccc *= ddd /= 2 ) );  
        System.out.println("Value of ccc : "+ ccc);
        System.out.println("Value of ddd : "+ ddd);
        // This is evaluated as : ccc = 2 * (ddd = 4 / 2);  => Answer is : ccc = ?, ddd = ?;
        
        
        
        int eee = 5;
        int fff = 15;
        System.out.println(" eee %= fff -= 10 => "+ ( eee %= fff -= 10 ) );  
        System.out.println("Value of eee : "+ eee);
        System.out.println("Value of fff : "+ fff);
        // This is evaluated as : eee = 5 % (fff = 15 - 10);  => Answer is : eee =?, fff =? ;
    }
}
