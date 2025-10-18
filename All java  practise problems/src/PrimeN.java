import java.util.Scanner;

// Write a java program to check  give number is prime or not
public class PrimeN {
    public static  void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        int count = 0;
        while(n != 0){

            for ( int i = n; i < n ; i++){
                if ( n % i == 0){
                    count++;
                }
            }

            if ( count == 2){
                System.out.println("This is Prime number");
            }
            else {
                System.out.println("This is not prime number");
            }
        }
    }
}
