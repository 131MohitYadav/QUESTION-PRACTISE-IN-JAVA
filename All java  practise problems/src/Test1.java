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
        System.out.println("Additon:  "  + c);
    }

    // variable Argument
    public static  void main(String...args){
        Test1 t1 = new Test1();
        t1.add();
        t1.add(2, 3);
        t1.add(1,3,3,3);
    }
}
