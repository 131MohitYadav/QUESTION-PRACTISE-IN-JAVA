
// Write a java programm to print the sum of array element
import java.util.Scanner;
public class ArraySum {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int arr[] = new int[5];

        for ( int i = 0; i<arr.length; i++){
            System.out.print("ENTER ELEMENT INDEX " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for ( int i = 0; i<arr.length; i++){
            sum += arr[i];
            System.out.println(i + " Index Element: " + arr[i]);
        }
System.out.println("Sum of All Array Element: " + sum);
        System.out.println("Average of All Array Element: " + sum/arr.length);
    }
}
