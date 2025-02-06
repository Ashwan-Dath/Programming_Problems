import java.util.Scanner;

class QuestionFour
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        // Question :   Write a program to print following pattern 
        //              if input is 10 and -5
        //              output will be 10@9,9@8,8@7,7@6,6@5,5@4,4@3,3@2,2@1,1@0,0@-1,-1@-2,-2@-3,-3@-4,-4@-5,-5@-6
        
        // Constraints: Starting Range always has to be higher than Ending Range 
        // Input :  First line of input contains integer denotes starting range
        //          Second line of input contains integer denotes ending range
        // Output :      Print pattern
        
        // Example:
        //  Input : 10, -5
        // Output : 10@9,9@8,8@7,7@6,6@5,5@4,4@3,3@2,2@1,1@0,0@-1,-1@-2,-2@-3,-3@-4,-4@-5,-5@-6
        
        // Explanation:
        // N/A
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int startingRange = scan.nextInt();
    	    int endingRange = scan.nextInt();
    	    
    	    if(startingRange<endingRange){
    	        System.out.print("INVALID RANGE");
    	        return;
    	    }
    	    
    	    for ( ; startingRange >= endingRange ; startingRange-- ){
    	        
    	        System.out.print( startingRange+"@"+(startingRange-1) + (startingRange != endingRange ? ", " : "" ));
    	        //                      |                                               |
                // Print the pattern number                                             |
                //                                          Print the ", " except for the last number
    	    } 
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	    
	}
}
