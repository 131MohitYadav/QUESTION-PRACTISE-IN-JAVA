// TAKING SOMETHING RETURN NOTHING

import java.util.*;

public class OopsTSRS {

    int add(int n1, int n2){

        // perform the operation
        int c = n1 + n2;

        return  c;
    }

    public static void main(String args[]){

        // create new object of class
        OopsTSRS tsrs = new OopsTSRS();

        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1; " );
        a = sc.nextInt();
        System.out.println("enter value 2 : ");
        b = sc.nextInt();
        int r = tsrs.add(a,b);
        System.out.println("Addition: " + r);

    }
}
