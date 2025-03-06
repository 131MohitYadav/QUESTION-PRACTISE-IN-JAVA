public class StringindexOf {

    // if string is not present it retrun -1
    public static void main(String args[]){

        String s1 = "welcome";// 0 1 2 3 4 5 6
        int a = s1.indexOf("e");//1
        int b = s1.indexOf("e",a+1);//6
        int c = s1.indexOf("me");// 5
        int d = s1.indexOf("zee");// -1
        int e = s1.indexOf("e",a+2);// 6
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
