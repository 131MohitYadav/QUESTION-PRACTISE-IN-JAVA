
import java.util.*;
public class Arraylist {

    public static void main(String args[]){

        //syntax of array list
        // to store integer value
        ArrayList<Integer> list = new ArrayList<>();

        // To store String value
        ArrayList<String> list2 = new ArrayList<>();

        // To store Boolean value
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add Operation
        list.add(1); // index 0
        list.add(2); // index 1
        list.add(3); // index 2
        list.add(4); // index 3
        list.add(5); // index 4

//       list.add(4,9);
//        System.out.println(list);

        // Get Operation - > it gives the index no.
//        int element = list.get(2);
//        System.out.println(element);

        // Remove operation
//        int element = list.remove(2);
//        System.out.println(element);

       // Set operation
//        list.set(2,10);
//        System.out.println(list);

        //contains operation
        System.out.println(list.contains(1)); // true
        System.out.println(list.contains(10)); // false

    }

}
