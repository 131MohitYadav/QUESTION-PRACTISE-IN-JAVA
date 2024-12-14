// Write a java program convert lowercase to uppercase string

import java.util.Scanner;
public class LowerToUpperCase {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ANY STRING: ");
        String s = sc.nextLine();

        String r = " ";

        for(int x : s.toCharArray()){
            if ( x >= 'a' && x <= 'z'){
                // same as it only x = x + 32 for uppercase to lowercase
                x = x - 32;
                r = r +(char) x;
            }
            else{
                r = r + (char)x;
            }
        }
        System.out.println(r);

    }

}
