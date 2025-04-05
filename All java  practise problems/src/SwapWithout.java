public class SwapWithout {

    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = 3;

        System.out.println("Befor Swapping A:  " + a);
        System.out.println(" Befor swaping B:  " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping A: " + a);
        System.out.println(" After swapping B: " + b);
    }
}

