
import java.math.BigDecimal;
import java.util.Scanner;

public class AddingValue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TWO VALUE: ");
        System.out.println("ENTER YOUR NAME: ");
        BigDecimal bg1 = sc.nextBigDecimal();
        BigDecimal bg2 = sc.nextBigDecimal();
        System.out.println("Result is: " + bg1.subtract(bg2));
    }
}
