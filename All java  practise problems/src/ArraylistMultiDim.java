// write a java programme to print the value of multidemisional arraylist
// list 1 = 1 , 2, 3, 4, 5
// list 2 = 2, 4, 6, 8 , 10
// list 3 = 3 , 6 , 9 , 12 , 15

import  java.util.ArrayList;
public class ArraylistMultiDim {

    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        Arraylist<Integer> list4 = new Arraylist<>();



        for(int i = 0 ; i<=5; i++){

            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
            list4.add( i * 4);

        }

        Mainlist.add(list1);
        Mainlist.add(list2);
        Mainlist.add(list3);
        Mainlist.add(list4);


        System.out.println(Mainlist);

    }
}
