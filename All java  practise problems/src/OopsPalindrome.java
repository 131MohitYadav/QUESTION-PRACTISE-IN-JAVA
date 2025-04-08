//  check give number is palindrome or not by uisng function ( taking something and return nothing)


import java.util.Scanner;

public class OopsPalindrome {

     void Pali( int n){

        // declare a variable
         int m = n;
         int res = 0;



         // operation
         while( n != 0){ // 131
             int r = n % 10;
             res = res * 10 + r;
             n = n / 10;
         }

         if ( m == n)
             System.out.println("Palindrome Number");

         else
             System.out.println("Not a Palindrome Number");


    }
    public static void main(String args[]){
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
       int n = sc.nextInt();

       // create object of class

        OopsPalindrome p = new OopsPalindrome();
        p.Pali(n);
    }
}
