
import java.util.*;
public class Arraysum1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] arr = {23,2,3,4,3};
        int sum = 0;

//        for ( int i = 0; i<arr.length; i++){
//            System.out.print("ENTER ANY ELEMENT: ");
//            arr[i] = sc.nextInt();
//        }
        for ( int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of element; " + sum);
        System.out.println("Average of element: " + sum/arr.length);
    }
}
