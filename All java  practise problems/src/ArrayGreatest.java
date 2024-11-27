import java.util.Scanner;
public class ArrayGreatest {

    public static void main(String args [ ]){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];
        int max = arr[0];

        for ( int i = 0; i<arr.length;i++){
            System.out.print("Enter Element at Index: " + i + ": ");
            arr[i]=sc.nextInt();
        }
        for ( int i = 0; i<arr.length; i++){
            if ( arr[i] > max){
                max = arr[i];
            }
        }
 System.out.println("Greatest Element: " + max);

    }
}
