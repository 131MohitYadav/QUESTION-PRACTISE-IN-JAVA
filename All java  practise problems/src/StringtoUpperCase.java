import java.util.*;


public class StringtoUpperCase {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String1 in lowercase : ");
        String s = sc.nextLine();

        System.out.print("Enter any Strin2 in uppercase : ");
        String c = sc.nextLine();

        System.out.println(s.toUpperCase());
        System.out.println(c.toLowerCase());


    }

}
