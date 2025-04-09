import java.util.Scanner;

public class OopsFact {

    int fact( int n){
        int f = 1;
        for ( int i = n; i >= 1 ; i--){
            f = f * i;
        }
        return  f;
    }
    public static void main(String args[]){

        // create new object of class


        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number; ");
        int n = sc.nextInt();

         OopsFact fa = new OopsFact();

         int res = fa.fact(n);
        System.out.println("Factorial of given number is : " + res);
//        System.out.println(fa.fact(5));
    }

}
