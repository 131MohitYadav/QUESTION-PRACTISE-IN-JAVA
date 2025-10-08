
// write a java program to check give string is uppercase or lowercase without using logical operator or build in function

import java.util.Scanner;

public class LowerandUppercase {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Check Upper case and lower case of character");
        System.out.println("Enter any Character: ");
        char c  = sc.next().charAt(0);

        if ( c >= 'a' && c <= 'z'){
            System.out.println("Lower case");
        }
        else {
            System.out.println("Upper case");
        }
    }
}
