import java.util.Scanner;


public class SwappingValues {
    public static void main(String [] args){
        // Question : Write a Program to Swap of every two elements in given array?

        // Constraints:
        // Input :             First Line of Input Consists of One Integer Value (Array Size).
        //                         Second Line of Input Consists of few Integer Values Separated by Space (Array Elements).
        // Output :          Print the array after swapping every two elements.
        // Constraints :   Array Size must be in between the 1 and 10 or else Print "Invalid Array Size.".

        // Example:
        // Input 1 :          7
        //                         8 7 5 1 5 2 6
        // Output 1 :      Before Swapping - 8 7 5 1 5 2 6
        //                     After Swappinng - 7 8 1 5 2 5 6

        
        // Input 2 :        8
        //                     65 11 27 31 86 5 93 62
        // Output 2 :     Before Swapping - 65 11 27 31 86 5 93 62
        //                     After Swappinng - 11 65 31 27 5 86 62 93

        // Explanation:
        // Input 1 :          7
        //                         8 7 5 1 5 2 6
        // Output 1 :      Before Swapping - 8 7 5 1 5 2 6
        //                     After Swappinng - 7 8 1 5 2 5 6
        // Explanation :

        // Here According to the Question we have to swap the Every Element with Next Element Like,
        // We have to Swap First element(0th Index) and Second Element(1st Index)
        // We have to Swap Third element(2nd Index) and Fouth Element(3rd Index)
        // We have to Swap Fiveth element(4th Index) and Sixth Element(5st Index)
        // Seventh Element(6st Index) Remains Same because we don't have one more Element to Swap so keep it same Index. 

        
        // According Above Explanation Points Array Values will Change Like this..
        // Given Array - 8 7 5 1 5 2 6
        //                     7 8 5 1 5 2 6
        //                     7 8 1 5 5 2 6
        //                     7 8 1 5 2 5 6
        // Final Array -  7 8 1 5 2 5 6
        

        // Input 2 :        8
        //                     65 11 27 31 86 5 93 62
        // Output 2 :     Before Swapping - 65 11 27 31 86 5 93 62
        //                After Swappinng - 11 65 31 27 5 86 62 93
        // Explanation :

        // Here According to the Question we have to swap the Every Element with Next Element Like,
        // We have to Swap First element(0th Index) and Second Element(1st Index)
        // We have to Swap Third element(2nd Index) and Fouth Element(3rd Index)
        // We have to Swap Fiveth element(4th Index) and Sixth Element(5st Index)
        // We have to Swap Seventh element(6th Index) and Eighth Element(7st Index)
        

        // According Above Explanation Points Array Values will Change Like this..
        // Given Array - 65 11 27 31 86 5 93 62
        //                     11 65 27 31 86 5 93 62
        //                     11 65 31 27 86 5 93 62
        //                     11 65 31 27 5 86 93 62
        //                     11 65 31 27 5 86 62 93
        // Final Array -  11 65 31 27 5 86 62 93


        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Length of the array");
        int Length = scan.nextInt();
        int arr[] = new int[Length];
        
        System.out.println("Enter the values ");
        for(int i = 0; i < Length; i++)
            arr[i] = scan.nextInt();

        System.out.print("Before Swapping -");

        for(int i = 0; i < Length; i++)
            System.out.print(" "+arr[i]);
        
        System.out.print("\nAfter Swappinng - ");

        for(int i = 0; i < Length; i++){

            if( i % 2 == 0 && i == Length-1){
                System.out.print(arr[i]);
                break;
            }else if(i % 2 == 0){
                int dup = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = dup;
                System.out.print(arr[i]+" ");
            }else{
                System.out.print(arr[i]+" ");
            }

        }

        scan.close();

    }
}
