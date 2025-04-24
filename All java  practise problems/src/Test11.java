
// example of mulitple inheritance by suing interface


interface IA1{
    void a();
}

interface  IB1{
    void b();

}
interface  IC extends IA1,IB1{
    void c();
}


public class Test11 implements IC {

    public  void a(){
        System.out.println("This is IA1 interface in a method");

    }
    public void b(){
        System.out.println("This is IB1 interface in b method");
    }
    public  void c(){
        System.out.println("This is IC interface in c method");
    }

    public  void hello(){
        System.out.println("Hello Mohit Yadav");

    }

    public  static void main(String args[]){

        // we cannot create object of interface but it can store refernecnce of implemented
        //class

        Test11 t = new Test11();
        t.a();
        t.c();
        t.b();
        t.hello();

    }

}
