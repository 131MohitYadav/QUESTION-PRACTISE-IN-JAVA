import java.util.Scanner;

// Write a java program to check given number is palindrome or not

public class Palindrome {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int n  = sc.nextInt();

        int  m = n;
        int res = 0;
        while ( n != 0){

            int r = n % 10;
            res = res * 10 + r;
            n = n / 10;


        }

        if ( m == res){
            System.out.println("This is Palindrome number");
        }
        else{
            System.out.println("This is not a Palindrome number");
        }


    }
}
