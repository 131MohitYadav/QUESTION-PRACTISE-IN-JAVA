import java.sql.SQLOutput;
import java.util.Scanner;

public class Days {

    public static void mian(String args[]){

        // delcare a variable
        int Y , M , D, TotalDays, RemainingDays;

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF DAYS : ");
        TotalDays = sc.nextInt();

        // peform the opeatin
        Y = TotalDays / 365;
        RemainingDays = TotalDays % 365;
        M = RemainingDays / 30;
        D = RemainingDays % 30;

        System.out.println("YEAR: " + Y);
        System.out.println("MONTH: " + M);
        System.out.println("DAYS: " + D);
    }
}
