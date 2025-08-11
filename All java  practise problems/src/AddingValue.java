
import java.math.BigDecimal;
import java.util.Scanner;

public class AddingValue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TWO VALUE: ");
        System.out.println("ENTER YOUR NAME: ");
        System.out.println("ENTER YOUR SURNAME: ");
        int x = 23;
        int y = 44;
        BigDecimal bg1 = sc.nextBigDecimal();
        BigDecimal bg2 = sc.nextBigDecimal();
        System.out.println("Result is: " + bg1.subtract(bg2));
        System.out.println("The sum of : "  +  ( x + y));
    }
}
