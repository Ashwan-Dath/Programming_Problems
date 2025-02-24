import java.util.Scanner;

class RightAnglePatternOne
{
    static Scanner scan = new Scanner(System.in);

    public static void mainnn(String [] args){
    // public static void main(String [] args){
	    
        // Question : Write a Program to Print the Following Pattern?

        // If Input is 5 then Print

        // 1
        // 3*2
        // 4*5*6
        // 10*9*8*7
        // 11*12*13*14*15


        // Constraints:
        // Input        :- First Line of Input Consists of One Integer Value ( Rows ).
        // Output       :- Print the Given Pattern.
        // Constraints  :- If Given Input Value is Zero then Print Invalid Input.
        //               If Given Input Value is Negative then convert that value to Positive and then Print Following Pattern.


        // Example:
        // Input 1  :    5
        // Output 1 : 

        // 1
        // 3*2
        // 4*5*6
        // 10*9*8*7
        // 11*12*13*14*15

        
        // Input 2  :    -8
        // Output 2 : 

        // 1
        // 3*2
        // 4*5*6
        // 10*9*8*7
        // 11*12*13*14*15
        // 21*20*19*18*17*16
        // 22*23*24*25*26*27*28
        // 36*35*34*33*32*31*30*29


        // Explanation:
        // Print the Following Right angle Triangle Pattern by taking Given Integer Value.
        
        
        Answer();
        
        
	}
	
	
	// public static void Answer(){
	public static void main(String[] args){

        int row = scan.nextInt();

        if(row == 0){
            System.out.print("Invalid Input.");
            return;
        }

        if(row < 0) row = -(row);

        int k = 0;
        int temp = 0;
        
        for( int i = 1; i <= row ; i++ ){

            if(i%2==0) temp = k+i;

            for(int j = 1; j <= i ; j++ ){
                if(i%2==1) System.out.print(temp++ + " ");
                else System.out.print(temp-- +" ");
            }

            k = k+i;
            System.out.println();

        }

	}
	
	
	
}
