
// How to take user input in the array element  and length of the array?.
import java.util.Scanner;
public class Array4 {

    public static void main(String args []){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter the Element at Index 0: ");
         arr[0] = sc.nextInt();

        System.out.println("Enter the Element at Index 1: ");
         arr[1] = sc.nextInt();

        System.out.println("Enter the Element at Index 2: ");
         arr[2] = sc.nextInt();

        System.out.println("Enter the Element at Index 3: ");
         arr[3] = sc.nextInt();

        System.out.println("######################################");

        System.out.println(arr.length);

        System.out.println("Element at the Index 0: " + arr[0]);
        System.out.println("Element at the Index 0: " + arr[1]);
        System.out.println("Element at the Index 0: " + arr[2]);
        System.out.println("Element at the Index 0: " + arr[3]);




    }
}
