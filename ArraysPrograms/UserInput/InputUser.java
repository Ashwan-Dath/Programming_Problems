package ArraysPrograms.UserInput;

import java.util.Scanner;

public class InputUser {
    

    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.print(Arrays.toString(IntegerArrayInput()));
//        IntegerArrayInput2D();
//        StringArrayInput();
//        System.out.print(Arrays.toString(StringArrayInput()));
// This is to push the code to github
    }

    public static int[][] IntegerArrayInput2D(){
        System.out.print("Enter the row of the Array : ");
        int row =  sc.nextInt();
        System.out.print("Enter the column of the Array : ");
        int col = sc.nextInt();


        int [][] arr = new int[row][col];
        // Giving col is optional, row is mandatory

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("Enter the value of "+(i+1)+" x "+(j+1)+" : ");
                arr[i][j] = sc.nextInt();
            }
        }

//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < col; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        return arr;
    }

    public static int[] IntegerArrayInput(){
        System.out.print("Enter the Size of the Array : ");
        int size = sc.nextInt();

        int []arr =  new int[size];
        for(int i = 0; i < size; i++){
            System.out.printf("Enter the %d element in the Array : ", (i + 1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int singleIntegerInput(){
        System.out.print("Enter the Target Number : ");
        return sc.nextInt();
    }

    public  static String[] StringArrayInput(){

        System.out.print("Enter the Size of the Array : ");
        int size = sc.nextInt();

        String []arr =  new String[size];
        for(int i = 0; i < size; i++){
            System.out.printf("Enter the %d element in the Array : ", (i + 1));
            arr[i] = sc.next();
        }
        return arr;

    }
}
