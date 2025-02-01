import java.util.Scanner;
public class ArrayOdd {

    public static void main(String args [ ]){

        Scanner sc = new Scanner(System.in);

//        int arr[] = new int[10];
//
//        for ( int i = 0; i<arr.length;i++){
//            System.out.print("Enter Element at Index: " + i + ": ");
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Odd Element of the Array: ");
//        for(int i = 0; i<arr.length; i++){
//            if ( arr[i] % 2 == 1) {
//                System.out.print(arr[i] + " ");
//            }
//        }

        int odd[] = new int[5];

        for ( int i = 0; i < odd.length; i++){
            System.out.print("ENTER ANY ELEMENT: " + i + ": ");
            odd[i] = sc.nextInt();
        }
        System.out.println("EVEN ELEMENT INSIDE THE ARRAY ");
        for ( int i = 0; i<odd.length; i++){
            if ( i % 2 == 0){
                System.out.print(odd[i] + " ");
            }
        }
    }
}
