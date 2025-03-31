import java.util.*;

public class Stringjoin {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String1; ");
        String s = sc.nextLine();

        System.out.println("Enter String2 : ");
        String a = sc.nextLine();

        String arr[] = s.split(" ");
        String arr1[] = a.split(" ");
        String r = String.join(":" , arr);
        String k = String.join("|" , arr1);
//        String r = String.join("|" , arr[0] , arr[1] , arr[2]);
        System.out.println(r);
        System.out.println(k);
    }


}
