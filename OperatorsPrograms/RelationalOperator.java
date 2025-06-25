package  OperatorsPrograms;

public class RelationalOperator {
	public static void main(String[] args) {
	    Easy();
	    
	    Medium();

	   	Hard();
	}
	
	
	
	public static void Easy(){
	   // 1. "==" Equal to Operator
	   boolean a = 10 == 9;
	   System.out.println("Value of a is => "+ (a));
	   // Here first the values are evaluated means
	   // it will check whether 10 equals to 9 or not (so 10 is not equal to 9)
	   // Which means the Operator just return the boolean value TRUE or FALSE based on the condition
	   // in this equation 10 is not equal to 9 so it will return FALSE
	   
	   // 2. "!=" Not equal to Operator
	   boolean b = 10 != 9;
	   System.out.println("Value of b is => " + (b));
	   // Here first the values are evaluated means
	   // it will check whether 10 is equals to 9 or not (so 10 is not equal to 9)
	   // Which means the Operator just return the boolean value TRUE or FALSE based on the condition
	   // in this equation 10 is not equal to 9 so it will return TRUE
	   
	   // 3. ">" Greater than
	   boolean c = 10 > 9;
	   System.out.println("Value of c is => "+ (c));
	   // Here it will check whether the RIGHT hand value (10) is GREATER THAN LEFT hand value (9)
	   // 10 is always GREATER THAN 9 so it will return TRUE
	   
	   // 4. ">=" Greater than or equal to
	   boolean d = 9 >= 9;
	   System.out.println("Value of d is => "+ (d));
	   // Here it will check whether the RIGHT hand value (9) is GREATER THAN  or EQUAL TO LEFT hand value (9)
	   // In this equation 9 is not GREATER THAN 9 but 9 is EQUAL TO 9 so 
	   // if any of the condition is TRUE it will return TRUE
	   // In our case 9 is EQUAL To 9 so the answer is TRUE
	   
	   // 5. "<" Less than
	   boolean e = 9 < 10;
	   System.out.println("Value of e is => "+ (e));
	   // Here it will check whether the RIGHT hand value (9) is LESS THAN LEFT hand value (10)
	   // 10 is always GREATER THAN 9 so it will return TRUE
	   
	   // 6. "<=" Less than or equal to
	   boolean f = 6 <= 4;
	   System.out.println("Value of f is => "+ (f));
	   // Here it will check whether the RIGHT hand value (6) is LESS THAN  or EQUAL TO LEFT hand value (4)
	   // In this equation 6 is not LESS THAN 4 and also 6 is NOT EQUAL TO 4 so 
	   // if any of the condition is TRUE it will return TRUE
	   // In our case nor it is less than or eqyal to so the answer is FALSE
	}
	
	public static void Medium(){
	   
	   boolean aa = 10 * 4 < 4 / 2;
	   System.out.println("Value of aa is => " + (aa));
	   // Here first the calculation is happened 10 * 4 = 40 and 4 / 2 = 2
	   // It resulted in 40 < 2 so the LESS THAN symbole returns the boolean value
	   // The answer will be FALSE
	   
	   boolean bb = 5 < 2 * 10 - 2;
	   System.out.println("Value of bb is => " + (bb) );
	   
	   
	   boolean cc = 4 + 5 * 5 > 5 - 10 + 32;
	   System.out.println("Value of cc is => " + (cc) );
	   
	   
	   boolean dd = 5 * 5 - 5 < 10 + 10 - 2;
	   System.out.println("Value of dd is => " + (dd) );
	}
	
	public static void Hard(){
	    boolean aaa = (5 * 2 % 3) > (90 - 5 / 2);
	    System.out.println("Value of aaa is => " + (aaa));
	   //  Here first the values are calculated inside the BRACKET and then compared RelationalOperator
	   //   (5 * 2 % 3) = 1  and  (90 - 5 / 2) = 86
	   // 0 > 86 = FALSE
	   
	   boolean bbb = (8 - 4 + (2 * (4 + 2 ))) == (5 - 55);
	   System.out.println("Value of bbb is => " + (bbb));
	   
	   boolean ccc = (90 - 90 * 2 % 5) != 45;
	   System.out.println("Value of ccc is => " + (ccc) );
	}
}