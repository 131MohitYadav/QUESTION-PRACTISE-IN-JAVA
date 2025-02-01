import java.util.Scanner;
public class ArrayAlternate {

    public static void main(String args [ ]){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

//        for ( int i = 0; i<arr.length;i++){
//            System.out.print("Enter Element at Index: " + i + ": ");
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Alternate Element of the Array: ");
//        for(int i = 0; i<arr.length; i = i + 2){
//            System.out.print(  arr[i] + " ");

        // print the element after two index skip

        for ( int i = 0; i < arr.length; i++){
            System.out.println("ENTER ELEMENT AT INDEX " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for ( int i = 0; i < arr.length; i += 3){
            System.out.println(arr[i] + " ");
        }

    }
}
