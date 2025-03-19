public class Stringsplit {

    public static void main(String args[]){

        String s1 = "Welcome to Bhopal Mohit Yadav";
        String arr [] = s1.split("o");
       // System.out.println(arr[5]); // it give arrayindexoutofbound exception
        System.out.println(arr[0]);// wel
        System.out.println(arr[1]);// me t
        System.out.println(arr[2]); // bh
        System.out.println(arr[3]); // pal M
        System.out.println(arr[4]);// hit Yadav
    }
}
