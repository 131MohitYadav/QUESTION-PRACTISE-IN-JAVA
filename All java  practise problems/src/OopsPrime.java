
//  check prime number by using function ( taking nothing return nothing )
import  java.util.*;
public class OopsPrime {

    public void Prime(){

        // declare a varible
        int count = 0;

        // taking input
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = sc.nextInt();

        for ( int i = 1; i <= a; i++){
            if ( a % i == 0){
                count++;
            }
        }

        if ( count == 2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }

    public  static void main(String args[]){
        // create new object of class
        OopsPrime p = new OopsPrime();
        p.Prime();
        p.Prime();
    }
}
