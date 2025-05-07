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
        if(isFull()){
            System.out.println("Queue is overflow");
        }

        // step 3 -> check if queue is empty increase front and rear by 1;
        if ( isEmpty()){
            System.out.println("Queue is empty");
            front++;
            rear++;
        }
        else {
            rear++;
        }
    }
}
