// write a java programme to sorting the arraylist -> 2, 5, 9,3,6

// import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistSorting {

    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();


        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println("ORIGINAL ARRAYLIST: " + list);
//        Collections.sort(list);// it print the arraylist in Ascending order
//        System.out.println("SORTING ARRAYLIST: " + list);

        // sorting in the descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("SORTING ARRAYLIST: " + list);
    }
}
