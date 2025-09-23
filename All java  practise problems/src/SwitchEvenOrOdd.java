import java.util.Scanner;

public class SwitchEvenOrOdd {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int n = sc.nextInt();

        switch (n%2){

            case 0:
                System.out.println("Even Number");
                break;
            case  1:
                System.out.println("Odd Number");
                break;

        }
    }
}
