
import java.util.*;
public class StringtocharArray {
    public static void main(String args[]){

//        String s1 = "Welcome";
//
//        char[] arr = s1.toCharArray();
//        for ( int i = 0; i < arr.length; i++){
//            System.out.println("Using for Loop : " + arr[i]);
//        }
//        System.out.println("USING FOR EACH LOOP " );
//        for ( char x : arr){
//            System.out.print(x);
//        }


        // write a java programe convert lowercase string to uppercase without using pred
        // -fine method

        // CONVERT LOWERCASE TO UPPERCASE //
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String: " ); // mohit
        String s1 = sc.nextLine();

        String r="";
        for(int x : s1.toCharArray()){ // [m , o , h , t]

            // convert uppercase to lowercase
            //  if ( x >= 'A' && x <= 'Z')
            // x = x + 32;

            if ( x >= 'a' && x <= 'z'){ // a = 97 and m > a
                x = x - 32;
                r = r + (char)x; // typecasting

            }
            else{
                 r = r + (char)x;
            }
        }
        System.out.println(r);

    }
}
