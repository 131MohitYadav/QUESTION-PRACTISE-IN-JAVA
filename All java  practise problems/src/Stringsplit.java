public class Stringsplit {

    public static void main(String args[]){

        String s1 = "Welcome to Bhopal Mohit Yadav";
        String arr [] = s1.split("o");
       // System.out.println(arr[5]); // it give arrayindexoutofbound exception
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
