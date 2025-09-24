import java.util.Scanner;

public class floatingNumber {
    public static void main(String args[]){

 Scanner sc = new Scanner(System.in);

 float n;

        System.out.println("ENTER ANY NUMBER: ");

        n = sc.nextInt();
        if ( n == 0){
            System.out.println("Zero");
        }
        else if( n > 0){
            System.out.print("Positive");
        }
        else{
            System.out.println("Negative");
        }
        if ( Math.abs(n) < 1){
            System.out.println("Small");
        }
        else if(Math.abs(n) > 1_000_000){
            System.out.println("large");
        }
        else{
            System.out.println();
        }

    }
}
