import java.util.Scanner;

// Find given number Armstrong or not.

class QuestionOne
{
    
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
        	    
        // Question : Write a program to check Whether the Given Number(any number of digits) is Armstrong or Not.
        
        
        // Constraints:
        // Input          :- First Line of Input Consists of One Integer Value.
        // Output        :- Print the Armstrong Number or Not a Armstrong Number.
        // Constraints  :- Given Input is Must be Greater than Zero or else Print Invalid Input.
         
        // Example:
        // Input 1  :    253
        // Output 1:    253 is Not a Armstrong Number.
        // Explanation:
        // 253
        // 2^3  + 5^3 + 3^3   ( 2^3 = 2 power 3)
        // =8 + 125 + 27
        // =160
        // Here Given Number(253) and Sum of the Cubes of the Digits in Given Number(160) are not same So It is Not a Armstrong Number.


        // Input 2  :   153
        // Output 2:   153 is a Armstrong Number.
        // Explanation:
        // 153
        // 1^3 + 5^3 + 3^3
        // =1 + 125 + 27
        // =153
        // Here Given Number(153) and Sum of the Cubes of the Digits in Given Number(153) are same So It is a Armstrong Number.

        
        // Input 3  :    8208
        // Output 3:    8208 is a Armstrong Number.
        // Explanation:
        // 8208
        // 8^4 + 2^4 + 0^4 + 8^4
        // =4096 + 16 + 0 + 4096
        // =8208
        // Here Given Number(8208) and Sum of the Powers(No of Digits in Given Number) of the Digits in Given Number(8208) are same So It is a Armstrong Number.

        // Input 4  :   548834
        // Output 4:   548834 is a Armstrong Number.
        // Explanation:
        // 548834
        // 5^6 + 4^6 + 8^6 + 8^6 + 3^6 + 4^6
        // =15625 + 4096 + 262144 + 262144 + 729 + 4096
        // =548834
        // Here Given Number(548834) and Sum of the Powers(No of Digits in Given Number) of the Digits in Given Number(548834) are same So It is a Armstrong Number.
        
        
        Answer();
        
	}
	
	public static void Answer(){
	    try {
	        
	        int number = scan.nextInt();
	        
	        int power = 0;
	        int duplicate = number;
	        int sum = 0;
	        
	        while(true){
	            duplicate = duplicate / 10;
	            power++;
	            if(duplicate==0){
	                break;
	            }
	        }
	        

	        duplicate = number;
	        
	        for (int i = 1; i <= power ; i++ ){
	            int a = duplicate % 10;
	            int powerdigit = 1;
	            for(int j = 1; j <= power; j++){
	                 powerdigit *= a;
	            }  
	            sum += powerdigit;
	            duplicate = duplicate / 10;
	        } 
	        System.out.print(sum==number ? number+" is a Armstrong Number." : number + " is Not a Armstrong Number.");

	        
	    } catch(Exception e) {
	        System.out.print("Exception Occured : " + e);
	    }
	}
}
