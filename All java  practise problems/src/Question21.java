

// WRITE A JAVA PROGRAMME TO COMPARE TO NUMBER
import java.util.*;
public class Question21 {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num1 , num2;

        System.out.print("ENTER A FIRST NUMBER: ");
        num1 = sc.nextInt();

        System.out.print("ENTER A SECOND NUMBER: ");
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("BOTH NUMBERS ARE EQUAL");

        }
        if(num1 != num2){
            System.out.println("BOTH NUMBERS ARE NOT EQUAL");
        }
    }
}
