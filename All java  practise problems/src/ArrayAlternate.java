import java.util.Scanner;
public class ArrayAlternate {

    public static void main(String args [ ]){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for ( int i = 0; i<arr.length;i++){
            System.out.print("Enter Element at Index: " + i + ": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Alternate Element of the Array: ");
        for(int i = 0; i<arr.length; i = i + 2){
            System.out.print(  arr[i] + " ");
        }
    }
}
