 // write a java programme to print the reverse the arrayl list 1,2,3,4,4
 import java.util.ArrayList;
public class ArraylistReverse {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);



        for(int i = list.size() - 1 ; i >= 0; i--){
            System.out.print(list.get(i) + " ");
            System.out.println("all array list show here");
        }
    }
}
