
import java.sql.SQLOutput;
import java.util.*;
public class CheckgivenStringisuppercaseornot {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ANY STRING: ");
        String s = sc.nextLine();

        System.out.println("Here it is UPpercase string entering string");
        System.out.println(s.toUpperCase().equals(s));
    }

}
