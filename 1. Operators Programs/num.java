class FibonacciExample1{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  


class FibonacciExample2{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){    
  int count=10;    
  System.out.print(n1+" "+n2);//printing 0 and 1    
  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
}  


import java.util.HashMap;  
import java.util.Map;  
public class Fibonacci {  
    private static Map<Integer, Integer> memo = new HashMap<>();  
    public static int fibonacci(int n) {  
        if (n <= 1)  
            return n;  
        if (memo.containsKey(n))  
            return memo.get(n);  
        int result = fibonacci(n - 1) + fibonacci(n - 2);  
        memo.put(n, result);  
        return result;  
    }  
    public static void main(String[] args) {  
        int n = 10;  
        for (int i = 0; i < n; i++) {  
            System.out.print(fibonacci(i) + " ");  
        }  
    }  
}  



public class PalindromeRecursion  
{  
  public static void main (String[]args)  
  {  
    //variables initialization  
    int num = 12021, reverse = 0, rem, temp;  
  
    // palindrome if num and reverse are equal  
    if (getReverse(num, reverse) == num)  
     System.out.println (num + " is Palindrome");  
    else  
      System.out.println (num + " is not Palindrome");  
  }  
//function to reverse the number    
  static int getReverse(int num, int rev){  
    if(num == 0)  
        return rev;      
    int rem = num % 10;  
    rev = rev * 10 + rem;  
    return getReverse(num / 10, rev);  
}  
}  