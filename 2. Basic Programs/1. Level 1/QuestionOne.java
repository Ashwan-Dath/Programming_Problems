import java.util.Scanner;

class QuestionOne
{
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
		// Question : Write a program to convert kg values into gram values?
        // Constraints: n/a
        
        // Input :      First line of input contains a decimal value represent weight in kgs
        
        // Output :     Print weight in grams
        
        // Example:
        // Input :          5.6
        
        // Output :       5600 Grams
        
        
        // Explanation:
        // in the above example we have to convert the 5.6kg to grams so you have to print 5600Grams.	
        
        Answer();
	}
	
	public static void Answer(){
	    float input = scan.nextFloat();     // Taking input from the USER
	    int Grams = (int)(input * 1000);    // Converting KG's into GRAMS
	    System.out.println(input + " kgs is equal to " + Grams + " grams");
	   // To convert kgs into grams we just have to multiply the value by 1000
	   // The KG's in taken in decimal points to convert it into whole numbers we have to do type casting (int)
	}
}
