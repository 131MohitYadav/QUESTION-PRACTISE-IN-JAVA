
// write a java programme to compute the integer value like n+nn+nnn
import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        int result = n + (n * 11) + (n * 111);

        System.out.println("Result: " + result);
    }
}
