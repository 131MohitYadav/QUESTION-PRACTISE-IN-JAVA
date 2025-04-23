// example of interface -> collection of method and declaration
// A class can implements more than one interface if any class implemnt interface override all interace method


interface IA{
    void a();
}
interface  IB{
    void b();
}

public class Test10 implements IA,IB {

    public void a(){
        System.out.println("This is IA interface method");
    }
    public void b(){
        System.out.println("This is IB interface method");
    }
    public void Hello(){
        System.out.println("Thiis ");
    }
    public static void main(String args[]){
        // we cannot create object of  interface but it can store reference of implemented class
//        IA obj = new Test10();
//        obj.a();

        // or

        Test10 t = new Test10();
        t.b();
    }
}
