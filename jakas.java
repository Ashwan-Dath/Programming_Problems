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

public class PrimeExample{    
 public static void main(String args[]){    
  int i,m=0,flag=0;      
  int n=3;//it is the number to be checked    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
}    
}   

import java.io.*;
 
class GFG {
    public static void main(String[] args)
    {
 
        // f is to ensures that numbers are float DATA TYPE
        float f1 = 1.5f;
        float f2 = 2.0f;
 
        // to store the multiplied value
        float p = f1 * f2;
 
        // to print the product
        System.out.println("The product is: " + p);
    }
}