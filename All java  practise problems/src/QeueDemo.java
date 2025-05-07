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

    public static void enq(int data) {
        // step 1 -> check overflow condition
        if (isFull()) {
            System.out.println("Queue is overflow");
        }

        // step 3 -> check if queue is empty increase front and rear by 1;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            front++;
            rear++;
            Q[rear] = data;
            System.out.println("insert first element in queue");

        } else {
            // if queue is not empety than rear increase by 1
            rear++;
            // step 4 -> insert data into queue
            Q[rear] = data;
            System.out.println("DAta insert into after first elemnt in queue");
        }
    }
        public static void display(){
            if ( isEmpty()){
                System.out.println("Queue is empty");
            }
            else{
                System.out.println("Elements of the Queue");
                for ( int i = front; i<= rear; i++){
                    System.out.print("-->" + Q[i]);

                }
            }
        }

        public static void main (String args[]){

        enq(10);
        enq(20);
        enq(30);
        enq(40);
        display();
        }



}
