// check strong number ( strong number mean  sum of factorial number 1 ! + 4 ! + 5 ! = 14
// ( Taking nothing return something
import  java.util.*;
public class OopsStrongN {

    int Strong(){

        //  declare a variable
        int sum = 0;
        int n;

        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number; ");
         n = sc.nextInt();

         int m = n;

        while (n != 0) {

            int r = n % 10;

            // factoral logic
             int fact = 1;
             for ( int i = r ; i >= 1; i--){
                 fact = fact * i;
             }
             sum = sum  + fact;
             n = n/10;
        }

        if ( m == sum)
            return  1;
        else
            return  0;
    }


    public static void main(String args[]){

        // create new object of class
         OopsStrongN s = new OopsStrongN();
         int result = s.Strong();
         if ( result == 1){
             System.out.println("Strong number");
         }
         else{
             System.out.println("Not a Strong number");
         }
    }


}
