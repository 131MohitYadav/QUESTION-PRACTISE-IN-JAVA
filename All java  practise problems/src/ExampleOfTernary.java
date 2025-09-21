//import java.util.Scanner;
//
//public class ExampleOfTernary {
//    public static void main (String args[]){
//
//        Scanner sc = new Scanner(System.in);
//        String resutl;
//
//        System.out.println("ENTER ANY NUMBER : ");
//        int n = sc.nextInt();
//
//         resutl = n % 2 == 0 ? "EVen Number" : "Odd Number";
//        System.out.println(resutl);
//
//    }
//}


import java.util.Scanner;

public class ExampleOfTernary {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        String result;

        System.out.println("ENTER ANY NUMBER : ");
        int n = sc.nextInt();

        if ( n % 2 == 0){
            System.out.println("Hello Mohit Yadav");
        }





        resutl = n >=18 ? "Eligible for voting " : "Not Eleigible for voting";
        System.out.println(resutl);
        System.out.println("Hello Mohit Yadav");

    }
}
