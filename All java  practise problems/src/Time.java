import java.util.Scanner;

public class Time {

    public static void main(String args[]){

        // delcare a variable
        int sec,min,hr,Totalseconds;

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF SECONDS: ");
        Totalseconds = sc.nextInt();

        // peform the operation

        hr = Totalseconds/3600;
        min = (Totalseconds % 3600)/60;
        sec = Totalseconds % 60;

        System.out.println("H.M.S - " + hr + ":" + min + ":" + sec);
    }
}
