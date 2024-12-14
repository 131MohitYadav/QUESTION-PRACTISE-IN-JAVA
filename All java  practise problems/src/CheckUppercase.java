// Write a java programme  to check given string is uppercase or not


import java.util.Scanner;
public class CheckUppercase {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ANY STRING: ");
        String s = sc.nextLine();

        System.out.println(s.toUpperCase().equals(s));

    }
}
