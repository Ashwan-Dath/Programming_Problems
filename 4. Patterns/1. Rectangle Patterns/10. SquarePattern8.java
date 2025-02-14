import java.util.Scanner;

class SquarePatternEight
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	   // Description:
    //     Write a Program to Print the following Basic Pattern?
        
    //     If Input is 5 then Print 
    //     55555
    //     54444
    //     54333
    //     54322
    //     54321
        
        
    //     Constraints:
    //     Input          :- First Line of Input Consists of One Integer Value ( Rows & Columns ).
    //     Output        :- Print the Following Pattern.
    //     Constraints  :- Given Input Must be Greater than Zero or else if input is 0 then Print the InvaliD Input
    //                      convert the given input negative value to positive value and then print the Pattern.
        
        
    //     Example:
    //     Input 1  :    5
    //     Output 1: 
        
    //     55555
    //     54444
    //     54333
    //     54322
    //     54321
        
         
        
    //     Input 2  :    -8
    //     Output 2: 
        
    //     88888888
    //     87777777
    //     87666666
    //     87655555
    //     87654444
    //     87654333
    //     87654322
    //     87654321
        
        
    //     Explanation:
    //     Print the Given Pattern by taking one integer Input
        
        Answer();
        
        
	}
	
	
	public static void Answer(){
	    
	    int row = scan.nextInt();   // Row and column are Same 

	    if(row == 0 ){
	        System.out.print("Invalid Input.");
	        return;
	    }
	    if (row < 0) row = - (row);
	    
	    for (int i = row ; i >= 1 ; i-- ){
	        
	        for (int j = row ; j >= 1 ; j-- ){
	            
                if( i <= j ) System.out.print(j+" ");
                else System.out.print(i+" ");

	        } 
	        System.out.println();
	    } 
	    
	}
	
	
	
}
