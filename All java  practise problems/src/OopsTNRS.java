

// TAKING NOTHIN RETURN SOMETHING

import java.util.*;

public class OopsTNRS {

    public int sub(){

        // declare a variable;
        int a , b , c;

        // input

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1; " );
        a = sc.nextInt();
        System.out.println("enter number 2 : ");
        b = sc.nextInt();

        // perform the operation
        c = a - b;
        return c;
    }

    public static void main(String args[]){

        // create new object of class
        OopsTNRS tnrs = new OopsTNRS();
        int r = tnrs.sub();
        System.out.println("Subtraction: "  + r);
    }
}
