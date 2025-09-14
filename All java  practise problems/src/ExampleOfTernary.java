import java.util.Scanner;

public class ExampleOfTernary {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        S resutl;

        System.out.println("ENTER ANY NUMBER : ");
        int n = sc.nextInt();

         resutl = n % 2 == 0 ? "EVen Number" : "Odd Number";
        System.out.println(resutl);

    }
}
