import java.util.Scanner;

class UpPatternOne {
    
    public static void main(String[] args) {
	    
        // Question : Write a Program to Print the Following Pattern?
         
     //     If Input is 5 then Print
         
     //         1
     //        1 1
     //       1 2 1
     //      1 3 3 1
     //     1 4 6 4 1   
         
         
     //     Constraints:
     //     Input          :- First Line of Input Consists of One Integer Value ( Rows ).
     //     Output        :- Print the Given Pattern.
     //     Constraints  :- If the Given Input is Zero then Print "Invalid Input".
     //                  If the GIven value is Negative value then Print "Given Input is Negative".
         
         
     //     Example:
     //     Input 1  :    5
     //     Output 1: 
         
     //         1
     //        1 1
     //       1 2 1
     //      1 3 3 1
     //     1 4 6 4 1
         
         
     //     Input 2  :    -3
     //     Output 2 :    Given Input is Negative
         
        Scanner scan = new Scanner(System.in);
        
        int range = scan.nextInt();
        
        if(range == 0){
            System.out.print("Invalid Input.");
            return;
        }
        
        if(range < 0) range= - (range);
         
        for(int i=1;i<=range;i++)
        {
            int k=1;

            for(int e=1;e<=range-i;e++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k=(k*(i-j))/j;
            }
            
            System.out.println();
        
        }

    }
 
}
