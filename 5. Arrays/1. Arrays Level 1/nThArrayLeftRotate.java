import java.util.Scanner;

public class nThArrayLeftRotate {

    public static void rotateArray(int arr[], int rotate){

        int rotatedArr[] =  new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            
        }

    }
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the Size of the Array : ");
        int size = scan.nextInt();

        System.out.print("\nEnter the Array Element Values : ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = scan.nextInt();

        System.out.print("\nEnter the Index Number To Left Rotate : ");
        int rotate = scan.nextInt();

        scan.close();

        arr = rotateArray(arr, rotate);
        
    }
}
