import java.util.Scanner;

class QuestionOne
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	   // Question :    Write program to print the following series which is shown in Given Examples.

    //     Constraints: No
    
    //     Input    :- First Line of Input Consists of One Integer Value.
    //     Output   :- Print the Following Series.
        
    //     Example:
    //     Input 1  :    10
    //     Output 1 :    1, 2, factor of three, 4, 5, factor of three, 7, 8, factor of three, 10
        
        
    //     Input 2  :    24        
    //     Output 2 :    1, 2, factor of three, 4, 5, factor of three, 7, 8, factor of three, 10, 11, factor of three, 13, 14, factor of three, 16, 17, factor of three, 19, 20, factor of three, 22, 23, factor of three.
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int number = scan.nextInt();    // Taking INPUT from the user
    	    
    	    if(number<0){   // converting  negative number into positive number
    	        number = -(number);
    	    }

    	    for ( int index = 1 ; index <= number ; index++ ){
    	        
    	        if(index == number){    // This is to place a '.' at the end
        	        System.out.print(index % 3 == 0 ? "factor of three." : index+".");
    	        }else{  // This is to place a ',' in middel of the printing progress.
    	            System.out.print( index % 3 == 0 ? "factor of three, " : index+", ");
    	        }
    	        
    	    } 
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	    
	}
}
