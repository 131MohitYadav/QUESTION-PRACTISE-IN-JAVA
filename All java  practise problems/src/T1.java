//
//
//// EXAMPLE 1 -> MULTITHREADNING USING EXTENDS THREAD
//public class T1  extends  Thread{
//
//    public void run(){
//        for ( int i = 1; i<=5; i++){
//            System.out.println("Child Thread: " + i);
//        }
//    }
//
//
//    public static void main(String args[]){
//        T1 t = new T1();
//        t.start();
//        for ( int i = 1; i <= 5; i++){
//            System.out.println("Main Thread: ");
//        }
//    }
//}



 // EXAMPLE 2 -> Multithreadning using implements Runnable interface it is a best as compare to extends thread

public class T1 implements Runnable{
    public  void run(){
        for ( int i = 1; i <= 5; i++){
            System.out.println("Child Thread: " + i);
        }
    }

    public static  void main(String args[]){
        Thread t2 = new Thread(new T1()){
            t2.start();
            for(int i = 1; i<=5; i++){
                System.out.println("Main Thread: " + i);
            }


    }
}