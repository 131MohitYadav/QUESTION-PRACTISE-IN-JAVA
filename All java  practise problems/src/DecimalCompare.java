import java.util.Scanner;

public class DecimalCompare {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double n1, n2;
        System.out.println("Enter first floating number: ");
        n1 = sc.nextDouble();

        System.out.println("Enter Second floating number: ");
        n2  = sc.nextDouble();

        n1 = Math.round(n1 * 1000.0) / 1000.0;
        n2 = Math.round(n2 * 1000.0) / 1000.0;

        if ( n1 == n2){
            System.out.println("Ther are same");
        }
        else{
            System.out.println("They are different");
        }

    }
}
