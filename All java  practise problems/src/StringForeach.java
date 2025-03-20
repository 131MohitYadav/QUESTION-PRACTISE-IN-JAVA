import java.util.*;

public class StringForeach {
    public  static void  main(String [] args){
//        int arr[] = {10,20,30,40};
//        String s[] = {"hello"};
//        char [] c = {'M','O','H','I','T'};
//        for ( int a : arr){
//            System.out.println(a);
//
//        }
//        for ( String b : s){
//            System.out.println(b);
//        }
//        for ( char d : c){
//            System.out.print(d);
//        }

        int arr [] = {10,30,40,50,13};

        int sum = 0;
        for ( int x : arr){
            sum = sum + x;

        }
        System.out.println("Sum of : " + sum);
        System.out.println("Average of : " + arr.length/2);
    }
}
