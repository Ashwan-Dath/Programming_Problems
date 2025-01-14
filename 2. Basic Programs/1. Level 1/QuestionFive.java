import java.util.Scanner;

class QuestionFive
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	//     Question :   Write a Program to Print the Biggest Number out of the Given three Numbers?
        
    //     Constraints:
    //     Input      :  Three integer values.
        
    //     Output   :  Print the Biggest Number from the Given Numbers.
        
    //     Example:
    //     Input 1     :  25, 69, 819 
    //     Output 1  :  819 is a Biggest Number from the Given Numbers
        
        
    //     Input 2  :  100, 222, 212
    //     Output 2 :  222 is a Biggest Number from the Given Numbers
    
    
    //     Input 3    :  999, 565, 729
    //     Output 3 :  999 is a Biggest Number from the Given Numbers
    
        Answer();
	}
	

	public static void  Answer(){
	    int firstNumber = scan.nextInt();
	    int secondNumber = scan.nextInt();
	    int thirdNumber = scan.nextInt(); 
	    
	    if(firstNumber > secondNumber && firstNumber > thirdNumber){
	        System.out.print(firstNumber + " is a Biggest Number from the Given Numbers");
	    }else if(secondNumber > thirdNumber && secondNumber > firstNumber){
            System.out.print(secondNumber + " is a Biggest Number from the Given Numbers");
	    }else{
            System.out.print(thirdNumber + " is a Biggest Number from the Given Numbers");
	    }
	}
}
