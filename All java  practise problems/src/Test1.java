// static block example

public class Test1 {


    public static void add(){
        int a , b , c;
        a = 10;
        b = 23;
        c = a + b;
        System.out.println("Addition: " + c);
    }

    public static void add(int a , int b){

        int c = a + b;
        System.out.println("Addition: " + c);
    }

    public static void add ( int a ,  int b , int d , int e){
        int c = a + b + d + e;
    }
}
