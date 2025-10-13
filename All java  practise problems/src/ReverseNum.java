import java.util.Scanner;

// WRITE A JAVA PROGRAM TO PRINT THE REVERSE NUMBER
public class ReverseNum {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");//131
        int n = sc.nextInt();

        int res = 0;
        while( n != 0){
            int r = n % 10;//1
            res = res * 10 + r;// 0 + 1;
            n = n/10;

        }

        System.out.println("The REverse number: " + res);



    }
}
