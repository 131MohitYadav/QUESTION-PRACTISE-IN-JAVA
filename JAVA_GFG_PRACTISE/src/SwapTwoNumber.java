import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         int temp = a;
         a = b;
         b = temp;

        System.out.println("The First number  " + a );
        System.out.println("The Second number " + b );
    }
}
