
import java.util.*;
public class Question12 {
    public static void main(String args[]){
        int x,y,z;

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A FIRST NUMBER: ");
        x = sc.nextInt();

        System.out.println("ENTER A SECOND NUMBER: ");
        y = sc.nextInt();

         z = x;
        x = y;
        y = z;

        System.out.println("SWAPPED X AND Y NUMBER: " + x + " " + y);


    }

}
