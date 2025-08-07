// write a java programme to find the maximum in arraylist 2,5,9,6,8
import java.util.ArrayList;

public class ArraylistMaximum {

    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(10);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max = Math.max(max,list.get(i));
        }
        System.out.println("MAX ELEMENT = " + max);
        System.out.println("hello Mohit Yadav");
        System.out.println("Nothing to have");
}
}
