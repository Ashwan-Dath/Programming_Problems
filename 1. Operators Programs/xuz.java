// Java Program to print pattern
// Number-increasing reverse pyramid
import java.util.*;

public class GeeksForGeeks {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = n; i >= 1; i--) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}



// Java Program to print pattern
// Number-changing pyramid
import java.util.*;

// Java code for printing pattern
public class GeeksForGeeks {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing value of num in each iteration.
                System.out.print(num + " ");
                // increasing the value of num.
                num++;
            }

            // printing new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}






// Java Program to print pattern
// Number-changing pyramid
import java.util.*;

// Java code for printing pattern
public class GeeksForGeeks {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing value of num in each iteration.
                System.out.print(num + " ");
                // increasing the value of num.
                num++;
            }

            // printing new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}






// Java Program to print pattern
// Palindrome triangle
import java.util.*;

public class GeeksForGeeks {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;

        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print the spaces
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // inner loop to print the second part
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }

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
Output 1:

ADVERTISEMENT
Enter a number to check: 80
The given number is a sunny number.
Output 2:

Enter a number to check: 670
The given number is not a sunny number.
Let's create another Java program and find all the sunny numbers between a given range.

SunnyNumberExample2.java

import java.util.Scanner;  
public class SunnyNumberExample2  
{  
//user-defined function that determines all the sunny numbers  
public static boolean isSunnyNumber(int number)   
{  
//determines the square root of number+1 using Math.sqrt() method  
if(Math.sqrt(number+1)%1 == 0)  
return true;  
else   
return false;  
}  
//driver code  
public static void main(String args[])   
{  
//lr is lower range and ur is upper range  
int lr = 0, ur = 0;  
Scanner scan = new Scanner(System.in);  
System.out.print("Enter lower range: ");  
//reads an integer (lr) from the user  
lr = scan.nextInt();  
System.out.print("Enter upper range: ");  
//reads an integer (ur) from the user  
ur = scan.nextInt();  
System.out.println("The Sunny number from "+ lr + " to "+ ur+" are: ");  
for(int i=lr; i<=ur; i++)   
{  
//calling user-defined number  
if(isSunny(i))  
System.out.print(i +" ");  
}  
}  
}  
Output:

Enter lower range: 1
Enter upper range: 1000
The Sunny number from 1 to 1000 are:
3 8 15 24 35 48 63 80 99 120 143 168 195 224 255 288 323 360 399 440 483 528 575 624 675 728 783 840 899 960
Next TopicTech Number in Java


← prevnext →


Learn Important Tutorial
Python
Python
Java
Java
Javascript
Javascript
Html
HTML
Database
Database
Php
PHP
C++
C++
React
React
B.Tech / MCA
DBMS tutorial
DBMS
Data Structures tutorial
Data Structures
DAA Tutorial
DAA
Operating System
Operating System
Computer Network Tutorial
Computer Network
Compiler Design Tutorial
Compiler Design
Computer Organization
Computer Organization
Discrete Mathematics
Discrete Mathematics
Ethical Hacking Tutorial
Ethical Hacking
Computer Graphics Tutorial
Computer Graphics
Web Technology Tutorial
Web Technology
Software Engineering Tutorial
Software Engineering
Cyber Security Tutorial
Cyber Security
Automata Tutorial
Automata
C Programming Tutorial
C Programming
C Plus Plus Tutorial
C++
Java Tutorial
Java
.Net Framework tutorial
.Net
Python tutorial
Python
List of Programs
Programs
Control System Tutorial
Control System
Data Warehouse Tutorial
Data Warehouse
Preparation
Aptitude
Aptitude
Reasoning
Reasoning
Verbal Ability
Verbal Ability
Interview Questions
Interview Questions
Company Questions
Company Questions






Advertisement
}2