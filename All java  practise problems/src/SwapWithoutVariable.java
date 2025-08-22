public class SwapWithoutVariable {

    public static void main(String args[]){

        int a , b;
        a = 7;
        b = 5;
        System.out.println("Before Swapping");
        System.out.printf("A = %d b = %d " , a , b);

        a = a + b; // 7 + 5 - 12
        b = a - b; // 12 - 5 - 7
        a = a - b; //  12 - 7 - 5

        System.out.println("\nAfter Swapping");
        System.out.printf("A = %d b = %d " , a , b);

    }
}
