import java.util.Scanner;
public class ArrayOdd {

    public static void main(String args [ ]){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        for ( int i = 0; i<arr.length;i++){
            System.out.print("Enter Element at Index: " + i + ": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Odd Element of the Array: ");
        for(int i = 0; i<arr.length; i++){
            if ( arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
