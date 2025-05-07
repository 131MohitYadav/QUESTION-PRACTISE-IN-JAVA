public class QeueDemo {

    static int Q[] = new int[5];
    static  int front = -1;
    static int rear = -1;

    public static boolean isEmpty(){
        return  front == -1 && rear == -1;
    }
    public static boolean isFull(){
        return rear == Q.length-1;
    }

    // enque operation peform

    public int enq(int data){
        // step 1 -> check overflow condition
    }
}
