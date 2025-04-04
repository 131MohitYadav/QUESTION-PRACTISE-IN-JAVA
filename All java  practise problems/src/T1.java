

// EXAMPLE 1 -> MULTITHREADNING USING EXTENDS THREAD
public class T1  extends  Thread{
    
    public void run(){
        for ( int i = 1; i<=5; i++){
            System.out.println("Child Thread: " + i);
        }
    }
    
    
    public static void main(String args[]){
        T1 t = new T1();
        t.start();
        for ( int i = 1; i <= 5; i++){
            System.out.println("Main Thread: ");
        }
    }
}
