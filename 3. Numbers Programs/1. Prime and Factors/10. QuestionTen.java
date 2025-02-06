import java.util.Scanner;

// Prime numbers present in the Factors of the given number
class QuestionTen
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
        // Question : Write a program to print all Prime Factors of a Given Number?
        
        // Constraints:
        // Input        :- First Line of Input Consists of One Integer Value.
        // Output       :- Print All the Prime Factors of a Given Number.
        // Constraints  :- Given Input is Equals to Zero then Print Invalid Input.
        //      If no Primes Factors are identified of a Given Number then Print No Prime Factors.
        //      If the Given Input is Negative then convert that number into Positive and Find Prime Factors.
        
        
        // Example:
        // Input 1  :   18
        // Output 1 :   2 3
        // Factors  :   1 2 3 6 9 18
        // Prime Factors : 2 3
        
        
        // Input 2  :   -10
        // Output 2 :   2 5
        // Explanation:
        // Given Number is Negative so Convert that Number into Positive Number and then Find Factors
        // Factors  : 1 2 5 10
        // Prime Factors : 2 5        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
    	    int range = scan.nextInt();

    	    if(range == 0 ){
    	        System.out.print("Invalid Input");
    	        return;
    	    } 
    	    
    	    if(range < 0) range = -(range);
    	    
    	    for ( int i = 1 ; i < range; i++ ){
				
    	        if(range % i == 0){
    	        
				    int Prime = 0;
    	        
				    for(int j = 1; j <= i; j++){
    	                if(i % j == 0 ) Prime++;
    	            }
    	        
				    if(Prime == 2){
    	                System.out.print(i+" ");
    	            }
    	        
				}
    	    } 
    	    
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
	
}
