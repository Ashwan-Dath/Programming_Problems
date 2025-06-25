package  BasicPrograms.Level2;

import java.util.Scanner;

public class QuestionFour
{
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
	
	    // Question :  Write a program to find the count of even numbers in given range.
	    //             if no even numbers print NO NUMBERS if Strating range is greater than ending range
	    //             print INVALID RANGE
            
            
        //     Constraints:
        //     Input :  First line of input contains Integer n represent staring range
        //              Second line of input contains Integer n1 represent ending range
            
        //     Output : Print Count of the All even Numbers in a Given Range
            
        //     Example:
        //     Input :  10, 20
        //     Output : 6
            
            
        //     Explanation:
        //     In the above example there are 6(including 10,20) even numbers
        //      in range of 10 and 20 are 10,12,14,16,18,20
        
        Answer();
	}
	
	public static void Answer(){
	    try{
			int startingRange = scan.nextInt();
			int endingRange = scan.nextInt();
			
			int Count = 0;  // For storing the count of no.of even numbers
			
			if(startingRange > endingRange){
				System.out.println("INVALID RANGE");
				return;
			}
			
			for (int start = startingRange; start <= endingRange ; start++ ){
				if( start % 2 == 0 ){
					Count++;
				}
			} 
			
			System.out.print("Total no.of even numbers present in between "+ startingRange + ", "+endingRange + " = " + Count);
		}catch(Exception e){
            System.out.print("Exception occured : "+e);
        }
	}
	
	
}
