//

// EXAMPLE 1 -> MULTITHREADNING USING EXTENDS THREAD
// Example -> getName and setName of thread
public class T1  implements  Runnable{

    public void run(){
        for ( int i = 1; i<=5; i++){
            System.out.println("Child Thread: " + Thread.currentThread());
        }
    }

    public void start(){
        System.out.println("This is Start Method Overrdider");
    }


    public static void main(String args[]){
//        T1 t = new T1();
        Thread t = new Thread(new T1());
        // Override run method

        t.setName("Cybrom Thread");

        // create object of t1
//        T1 obj = new T1();
//        obj.start();
        t.start();
        for ( int i = 1; i <= 5; i++){
            System.out.println("Main Thread: " + Thread.currentThread());
        }
    }
}

//
//
// // EXAMPLE 2 -> Multithreadning using implements Runnable interface it is a best as compare to extends thread
//
//public class T1 implements Runnable{
//    public  void run(){
//        for ( int i = 1; i <= 5; i++){
//            System.out.println("Child Thread: " + i);
//        }
//    }
//
//    public static  void main(String args[]){
//        Thread t2 = new Thread(new T1()){
//            t2.start();
//            for(int i = 1; i<=5; i++){
//                System.out.println("Main Thread: " + i);
//            }
//
//
//    }
//}