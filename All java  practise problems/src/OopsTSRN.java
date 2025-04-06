

// TAKING SOMETHING AND RETURN NOTHING
import java.util.*;
public class OopsTSRN {

    public void mul(int a , int b){ // formal argument

        // delcare varible
        // perform the operation

        int c = a * b;
        System.out.println("Multiplication: " + c);


    }

    public static void main(String args[]){

        Scanner sk = new Scanner(System.in);

        System.out.println("ENTER NUMBER 1: ");
        int n1 = sk.nextInt();
        System.out.println("ENTER NUMBER 2 ; ");
        int n2 = sk.nextInt();

        // create new object of class

        OopsTSRN tsrn = new OopsTSRN();
        tsrn.mul(n1 , n2);
    }
}
