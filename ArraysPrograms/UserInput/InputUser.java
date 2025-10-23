package ArraysPrograms.UserInput;

import java.util.Scanner;

public class InputUser {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.print(Arrays.toString(IntegerArrayInput()));
        // IntegerArrayInput2D();
        // StringArrayInput();
        // System.out.print(Arrays.toString(StringArrayInput()));
        // This is to push the code to github
    }

    public static int[][] SortedRowAndColWiseIntegerArrayInput2D(int row, int col) {
        try {
            // System.out.print("Enter the row of the Array : ");
            // int row = sc.nextInt();
            // System.out.print("Enter the column of the Array : ");
            // int col = sc.nextInt();

            int[][] arr = new int[row][col];
            // Giving col is optional, row is mandatory

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("Enter the value of " + (i + 1) + " x " + (j + 1) + " : ");
                    arr[i][j] = sc.nextInt();
                    // if(j == 0 && i != 0){
                    // boolean b = arr[i][j] < arr[i][col - 1];
                    // if(b)
                    // throw new Error("Enter Only Sorted Row & Column Wise Numbers");
                    // }
                    if (i > 0 && arr[i][j] < arr[i - 1][j]) {
                        throw new IllegalArgumentException("Array must be sorted column-wise. Invalid value at (" + (i + 1) + ", " + (j + 1) + ")");
                    }

                    // Check if current value is >= the value to the left (row-wise sort)
                    if (j > 0 && arr[i][j] < arr[i][j - 1]) {
                        throw new IllegalArgumentException("Array must be sorted row-wise. Invalid value at (" + (i + 1) + ", " + (j + 1) + ")");
                    }
                    // if (i != 0) {
                    //     System.out.print("arr[i][j] & arr[i-1][j]" + arr[i][j] + " " + arr[i - 1][j]);
                    //     boolean b = arr[i][j] < arr[i -1][j];
                    //     if(!b)
                    //         throw new Error("Enter Only Sorted Row & Column Wise Numbers");
                    // }
                    // if (j != 0) {
                    //     System.out.print("arr[i][j] & arr[i][j - 1]" + arr[i][j] + " " + arr[i][j - 1]);
                    //     boolean b = arr[i][j] < arr[i -1][j];
                    //     if(!b)
                    //         throw new Error("Enter Only Sorted Row & Column Wise Numbers");
                    // }
                }
            }

            return arr;

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static int[][] IntegerArrayInput2D() {
        System.out.print("Enter the row of the Array : ");
        int row = sc.nextInt();
        System.out.print("Enter the column of the Array : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        // Giving col is optional, row is mandatory

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the value of " + (i + 1) + " x " + (j + 1) + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        // for(int i = 0; i < row; i++){
        // for(int j = 0; j < col; j++){
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        return arr;
    }

    public static int[] IntegerArrayInput() {
        System.out.print("Enter the Size of the Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %d element in the Array : ", (i + 1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static char[] CharacterArrayInput() {
        System.out.print("Enter the Size of the Array : ");
        int size = sc.nextInt();

        char[] arr = new char[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %d element in the Array : ", (i + 1));
            arr[i] = sc.next().charAt(0);
        }
        return arr;
    }

    public static int singleIntegerInput() {
        System.out.print("Enter the Target Number : ");
        return sc.nextInt();
    }

    public static char singleCharacterInput() {
        System.out.print("Enter the Target Character : ");
        return sc.next().charAt(0);
    }

    public static String[] StringArrayInput() {

        System.out.print("Enter the Size of the Array : ");
        int size = sc.nextInt();

        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %d element in the Array : ", (i + 1));
            arr[i] = sc.next();
        }
        return arr;

    }
}
