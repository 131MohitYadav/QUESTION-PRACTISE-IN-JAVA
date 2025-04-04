

public class MyThread extends Thread{
    Display d;
    String name;

    public MyThread(Display d , String name){
        this.d = d;
        this.name = name;
    }

    public  void run(){
        d.wish(name);
    }

    public static void main(String [] args){
        Display d1 = new Display();
        MyThread t1 = new MyThread(d1 , "DHONI");
        MyThread t2 = new MyThread(d1 , "Virat");
        MyThread t3 = new MyThread(d1 , "Rohit");
        t1.start();
        t2.start();
        t3.start();
    }
}
