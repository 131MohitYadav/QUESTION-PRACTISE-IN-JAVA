import java.util.Scanner;

// Write a java program check given number is krishnmurthy number  or not or Strong number liek give

// 145 =  1! + 4! + 5! = 145

public class KNumber {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        int sum =0;
        int m = n;

        int res = 0;
        while(n != 0){

            int r = n % 10;

            // factorial login
           int  fact = 1;
           for ( int i = n; i >= n ; i--){
               fact = fact * i;
           }
           sum = sum  + fact;
           n = n / 10;

        }
        if (m == sum){
            System.out.println("It is a Strong number");
        }
        else{
            System.out.println("It is not a Strong number");
        }
    }
}
