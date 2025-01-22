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

import java.util.*;   
public class SunnyNumberExample1  
{   
//driver code   
public static void main(String args[])   
{   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number to check: ");  
//reading a number from the user  
int N=sc.nextInt();  
//calling user-defined function   
isSunnyNumber(N);   
}       
//function checks whether the given is a perfect square or not   
static boolean findPerfectSquare(double num)   
{   
//finds the square root of the ggiven number  
double square_root = Math.sqrt(num);   
//if square root is an integer   
return((square_root - Math.floor(square_root)) == 0);   
}   
//function that checks whether the given number is Sunny or not  
static void isSunnyNumber(int N)   
{   
//checks N+1 is perfect square or not  
if (findPerfectSquare(N + 1))   
{   
System.out.println("The given number is a sunny number.");   
}   
//executes if N+1 is not a perfect square  
else  
{   
System.out.println("The given number is not a sunny number.");   
}   
}   
}  