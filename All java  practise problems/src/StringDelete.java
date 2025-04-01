import java.util.*;

public class StringDelete {
    public static void main(String args[]){

        StringBuffer s = new StringBuffer("Welcome to Bhopal");

        System.out.println("Enter any String: ");

        System.out.println("String Before the delete method: " + s);

        System.out.println("String After the delete method: " + s.delete(0, 6));
    }

}
