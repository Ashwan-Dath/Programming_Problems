package  OperatorsPrograms;

public class ConditionalOperators {
	public static void main(String[] args) {
	    Easy();
	   
	    Medium();
	   
	    Hard();
	}
	
	public static void Easy(){
	    
        // 1. "&&" Conditional-AND
        boolean a = true && true;
        System.out.println("Value of a is => " + (a));
        //  '&&' is a operator where it checks both the values right and left value are true
        //  If both the values are true then only it will return TRUE 
        //  In our case both right (true) and left (true) values are true, so it resulted in TRUE 
        
        boolean b = true && false;
        System.out.println("Value of b is => " + (b));
        // Here the values of true and false , 
        // IN '&&' operator both values have to be true then only it will return true 
        // If any of the values are false then it will return false
        
        
        // "||" Conditional-OR
        boolean c = true || false;
        System.out.println("Value of c is => " + (c));
        //  '||' is a operator where it checks any of the values right and left value are true
        //  If any of the values are true then only it will return TRUE 
        //  In our case both right (true) and left (false) values are true, so it resulted in TRUE   
        
        
        // "? :" Ternary (shorthand for if-then-else statement)
        boolean d = 10 == 10 ? true : false;
        System.out.println("Value of d is => " + (d));
        // "? :" This operator is shorthand for if else 
        // first it will evaluate the 10 == 10 calculation 
        // if the condition is true it will return the value present after '?'
        // if the condition is false it will return the value present after ':'
        // In our case 10 is equal to 10 so it will return the value present after ? which is true
        
        
        boolean e = 10 != 10 ? true : false;
        System.out.println("Value of e is => " + e );
        // first it will evaluate the 10 != 10 calculation 
        // In our case 10 is not equal to 10 so it will return the value present after : which is false
	}
	
	public static void Medium(){
	   boolean aa = (10==10) && (10 != 10);
	   System.out.println("Value of aa is => " + aa);
	   // Here first both the calculations are evaluated 
	   // In our case first condition is true => 10 is equal to 10
	   // Second condition is false => 10 is not equal to 10
	   // So if any of the condition is false then it will return false
	   
	   boolean bb = ( 10 > 6 ) || ( 1 > 23);
	   System.out.println("Value of bb is => " + bb);
	   // Here we are using '||' operator so if any of the condition is true it will return true
	   // in our case 10 > 6 is true so output will be true
	  
 	}
 	
 	public static void Hard(){
 	    boolean aaa = (10 > 9) && (1 < 3) && (2 > 5);
 	    System.out.println("Value of aaa is => " + aaa);
 	    // Here we are checking 3 conditions so all the condition has to be true then only our output will be true
 	    // Here 2 > 5 is false so total output will be false
 	    
 	    boolean bbb = ( 10 < 5) || (5 < 3) || (5 > 2);
 	    System.out.println("Value of bbb is => "+ bbb);
 	    // Here any one of the 3 conditions has to return true total output will be true
 	    // 5 > 2 is true so total output is true 
 	    
 	    boolean ccc = (2 > 1) && (1 < 4) && (10 != 10 ? true : false);
 	    System.out.println("Value of ccc is => " + ccc);
 	    
 	}
	
}
