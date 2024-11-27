import java.util.*;
public class Result {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR MARKS: ");
        int x = sc.nextInt();

        if(x>=33 && x<=50){
            System.out.println("III DIVISION");

        } else if (x>=51 && x<=80) {
            System.out.println("II DIVISION");

        } else if (x>=81 && x<=100) {
            System.out.println("I DIVISION");

        }
sc.close();
    }
}
