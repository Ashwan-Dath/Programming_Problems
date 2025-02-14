import java.util.Scanner;

class SquarePatternSix
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	    
        // Questions : Write a Program to Print the following Basic Pattern?
        
        // If Input is 5 then Print 
        
        // 1 0 1 0 1
        // 1 0 1 0 1
        // 1 0 1 0 1
        // 1 0 1 0 1
        // 1 0 1 0 1
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value ( Rows & Columns ).
        // Output        :- Print the Square Pattern.
        // Constraints  :- Given Input Must be Greater than Zero or else Print Invalid Input.
        
        
        // Example:
        // Input 1  :    5
        // Output 1: 
        
        // 1 0 1 0 1
        // 1 0 1 0 1
        // 1 0 1 0 1
        // 1 0 1 0 1
        // 1 0 1 0 1
        
        
        // Input 2  :    6
        // Output 2: 
        
        // 1 0 1 0 1 0
        // 0 1 0 1 0 1
        // 1 0 1 0 1 0
        // 0 1 0 1 0 1
        // 1 0 1 0 1 0
        // 0 1 0 1 0 1
        
        
        // Explanation:
        // Print a Square Pattern by taking One Integer Input
        
        
        
        Answer();
        
        
	}
	
	
	public static void Answer(){
	    
	    int row = scan.nextInt();   // Row and column are Same 

	    if(row <= 0 ){
	        System.out.print("Invalid Input.");
	        return;
	    }
	    
        // Checking whether the input is even or odd to print different pattern based on them.
	    if(row%2==1) OddPattern(row);   // If odd number Printing the Odd Pattern
	    else EvenPattern(row);          // If even number Printing the Even Pattern
	}
	
	public static void OddPattern(int row){
	    
	    for(int i = 1; i<= row; i++){
	        for(int j = 1; j <= row; j++){
	            if(j%2==1) System.out.print("1 ");
	            else System.out.print("0 ");
	        }
	        System.out.println();
	    }
	    
	}
	
	public static void EvenPattern(int row){
	    
	    for(int i = 1; i <= row ; i++ ){
	        
	        for(int j = 1 ; j <= row ; j++ ){
	            
	            if(i%2==1){
	                if(j%2==1) System.out.print("1 ");
	                else System.out.print("0 ");
	            }else{
	                if(j%2==1) System.out.print("0 ");
	                else System.out.print("1 ");
	            }
	            
	        }
	        System.out.println();
	        
	    }
	}
	
	
}
