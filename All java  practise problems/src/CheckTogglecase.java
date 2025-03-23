
import java.util.*;
public class CheckTogglecase {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String : " );
        String s = sc.nextLine();

        String r = "";
        for ( int x : s.toCharArray()){
            if ( x >= 'a' && x <= 'z'){
                x = x - 32;
            }
            else if( x >= 'A' && x <= 'Z'){
                x = x + 32;
            }
                r = r + (char) x;
            }


        System.out.println(r);
    }
}
