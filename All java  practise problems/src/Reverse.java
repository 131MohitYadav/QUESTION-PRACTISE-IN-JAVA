
// Write java program to reverse the given number
import java.util.Scanner;
class Reverse{
    public static void main(String args [] ) {
        Scanner sk = new Scanner(System.in);

        System.out.println("ENTER ANY NUMBER: ");
        int n = sk.nextInt();

        int rev = 0;
        while( n != 0 ){
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("The Reverse number is: " + rev);
    }
}