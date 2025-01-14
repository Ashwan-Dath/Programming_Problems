import java.util.Scanner;

class QuestionSeven
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {

	//     Question :    Write a program to convert temperature from degree celcisu (C) to Farenheit (F).
        
    //     Constraints:
    //     Input           :    First line of input contains Integer 'n' represents temperature in celcius
        
    //     Output         :   Temperature in farenheit
    
    //     Example:
    //     Input     :   96
        
    //     Output  :   204.8F
        
        
    //     Explanation:
    //     In the above example input is 96,now you have to convert it into farenheit 
    //     if we convert the value of 96 to farenheit we will get 204.8
    //     note:  f=(c*9/5)+32  formula
    
        Answer();
        
	}
	
	public static void  Answer(){
	    int number = scan.nextInt();
	    float farenheit = (float)number*9/5+32;
	    System.out.println(number + " Celcius = "+ farenheit +"F");
	}
}
