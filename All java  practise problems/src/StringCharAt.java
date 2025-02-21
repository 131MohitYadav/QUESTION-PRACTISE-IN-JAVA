import java.util.Scanner;

public class StringCharAt {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY STRING");
        String s = sc.nextLine();
       // for ( int i = 0; i < s.length(); i++){
        for ( int i = s.length()-1; i >= 0 ; i--){
            char x = s.charAt(i);
            System.out.println( x);

        }
    }
}
