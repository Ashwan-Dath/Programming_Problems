import java.util.Scanner;

class QuestionThree
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        // Question :   Write program to print the following series which is shown in Given Examples.
        
        // Constraints:
        // Input    :-  First Line Of Input consists of One Integer value.
        //              Second Line Of Input consists of One Integer value.
        
        // Output       :-   Print the Following Series.
        // Constraints :-   All the Values Should be Greater than Zero or else print "Invalid Inputs".
        
        
        // Example:
        // Input 1   : 100, 1000
        // Output 1 : 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000
        
        // Input 2   : 300, 2500
        // Output 2 : 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900, 2000, 2100, 2200, 2300, 2400, 2500
        
        // Explanation:
        // NA
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingRange = scan.nextInt();
    	    int endingRange = scan.nextInt();
    	    
    	    for ( ; startingRange <= endingRange ; startingRange++ ){
    	        
    	        System.out.print( startingRange % 100 == 0 ? startingRange != endingRange ? startingRange+", ": startingRange : "" );
    	        // In this line i am checking two conditions
    	        // 1. startingRange % 100 == 0 
                //      if it is FALSE i'm not printing anythin
    	        //      if it is TRUE then i am checking another conditions 
    	        //          2. startingRange != endingRange
    	        //              if it is TRUE then i am printing the number along with a ', '
    	        //              if it is FALSE then i am only printing the number - This is applicable only to the last number(endingRange) 
    	    } 
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    	
	}
}
