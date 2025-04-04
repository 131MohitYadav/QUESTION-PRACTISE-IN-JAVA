
import  java.util.logging.Level;
import  java.util.logging.Logger;

public class Display {

    public  synchronized void wish(String name)  {

        System.out.println("=====> Good Evening========>");
        for ( int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" " + name);
        }
    }
}
