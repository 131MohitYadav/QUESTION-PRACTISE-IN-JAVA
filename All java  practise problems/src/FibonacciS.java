import java.util.Scanner;

public class FibonacciS {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        // declare a variable
        int t1, t2 , t3;

         t1 = 0;
         t2 = 1;
        System.out.print(t1 +" " + t2 + " "); // 0 1
        for(int i = 3; i <= n ; i++){
            t3 = t1 + t2; // 0 + 1 = 1
            System.out.print(t3+" ");
            t1 = t2;//1
            t2 = t3;//1
        }
    }
}
