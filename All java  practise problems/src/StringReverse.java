// write a java program to print reverse string
import java.util.Scanner;
public class StringReverse {

    public static void main(String args [ ]){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ANY STRING: ");
        String s = sc.nextLine();

        for ( int i = s.length() - 1; i >= 0; i--){
            char x = s.charAt(i);
            System.out.print(x);
        }
    }

}
