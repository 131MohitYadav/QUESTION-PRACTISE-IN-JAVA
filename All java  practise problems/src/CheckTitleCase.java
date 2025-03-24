
import java.util.*;
public class CheckTitleCase {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ANY STRING FOR CHECK TITLE CASE OR NOT:  ");
        String s = sc.nextLine();

        boolean Titlecase = true;
        String w[] = s.split(" ");
        for ( String word : w){

            if ( !Character.isUpperCase(word.charAt(0)) || !word.substring(1).equals(word.substring(1).toLowerCase())){
                Titlecase = false;
                break;
            }

        }
        System.out.println(Titlecase);


    }

}
