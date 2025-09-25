import java.util.Scanner;

public class SumofDigit {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number; ");
        int n = sc.nextInt(); // 1234

        int sum = 0;

        while( n != 0){

            int r = n % 10; // 1
            sum = sum + r; // 0 + 1
            n = n / 10;
        }
        System.out.println("Sum of digit: " + sum);
    }
}
