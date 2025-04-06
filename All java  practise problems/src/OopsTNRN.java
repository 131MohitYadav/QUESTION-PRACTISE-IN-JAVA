
// 1. Taking nothing return nothing

import  java.util.*;
public class OopsTNRN {

    public void add(){

        // declare variable
        int a , b , c;

        // input

        System.out.println("======> Add Function calld <======");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A : ");
         a = sc.nextInt();
        System.out.println("Enter value of B: ");
        b =sc.nextInt();

        // peform the operation

        c = a + b;
        System.out.println("Addition: " + c);
    }

    public static void main(String args[]){

        // create new object of class

        OopsTNRN tnrn = new OopsTNRN();

        // how to access of method class

        //objectname.methodname()

        tnrn.add();
        tnrn.add();

    }





}
