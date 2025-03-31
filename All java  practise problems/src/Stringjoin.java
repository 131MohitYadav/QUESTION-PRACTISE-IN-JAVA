import java.util.*;

public class Stringjoin {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String; ");
        String s = sc.nextLine();

        String arr[] = s.split(" ");
        String r = String.join(":" , arr);
//        String r = String.join("|" , arr[0] , arr[1] , arr[2]);
        System.out.println(r);
    }


}
