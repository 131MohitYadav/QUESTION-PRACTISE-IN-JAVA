// Check EvenOrOdd by uisng function ( taking nothing and return nothing)

import java.util.*;

public class OopsEvenOrOdd {

    public  void  Even(){

        // declare a variable

        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number; " );
        int a = sc.nextInt();
        // perform the operation

       if( a % 2 == 0){
           System.out.println("Even");

        }
       else {
           System.out.println("Odd");
       }


    }

    public static void main(String args[]){

       OopsEvenOrOdd eo = new OopsEvenOrOdd();
       eo.Even();
       eo.Even();
       eo.Even();

    }
}
