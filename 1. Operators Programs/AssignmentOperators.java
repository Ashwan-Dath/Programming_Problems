public class AssignmentOperators
{
    
    // This method is to demonstrate how all the Assignment Operators works
    public static void Explanation(){
        
        // To understand Perfectly Please print the statements separately comment all other printing statements.
        
        // 1. Simple Assignment Operator
        int a = 10;     // = is responsible for assigning the value '10' value to variable 'a'
        int b = 5;      // 'a' is stored in the STACK area responsible for storing the local variables
        
        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);
        
        // 2. Complex Assignment Operator
        // a += b;    =>   a = a + b => 15  Here it combines the a and b so 10 + 5 = 15
        System.out.println("a += b : " + (a+=b));  
        
        // a -= b;    =>   a = a - b => 5   Here it substracts b from a so 10 - 5 = 5
        System.out.println("a -= b : " + (a-=b));

        // a *= b;    =>   a = a * b => 50  Here it multiplies a with b so 10 * 5 = 50
        System.out.println("a *= b : " + (a*=b));
        
        // a %= b;    =>    a = a % b => 0  Here it gets the remainder value of when a divided by b so 10 % 5 = 0
        System.out.println("a %= b : " + (a%=b));
        
        // a /= b;    =>    a = a / b => 2  Here it gets the Quotient value when a divided by b so 10 / 5 = 2
        System.out.println("a /= b : " + (a/=b));

System.out.print what is happening in this file;

because this is like the happening to me and I think I am just keeping my goals aside not giving any priority to them

int i, j;
        // outer loop to handle number of rows
        for (i = 0; i < n; i++) {
            //  inner loop to handle number of columns
            for (j = 0; j < n; j++) {
                // star will print only when  it is in first
                // row or last row or first column or last
                // column
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                // otherwise print space only.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);




int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
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





int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
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
    
	public static void main(String[] args) {
	    Explanation();
	}
}
