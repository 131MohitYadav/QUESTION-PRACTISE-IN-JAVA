public class QeueDemo {

    static int Q[] = new int[8];
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
            System.out.println("insert first data in queue");

        } else {
            // if queue is not empety than rear increase by 1
            rear++;
            // step 4 -> insert data into queue
            Q[rear] = data;
            System.out.println("Data insert into after first element in queue");
        }
    }


    public static  int deq(){
        int r = 0;
        // step 1 -> first check underflow condition
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        else if( rear == front){
            // step 2 -> to chek queue contains only one element so value of front assign into another varible then front are rea is -1
            r = Q[front];
            front = -1;
            rear = -1;
            System.out.println("deleted last element");

        }
        else{

            // step 3-> if queeu contains more than one element then increase front by 1
            r = Q[front];
            front++;
            System.out.println("Deleted element from the queue");

        }
        return  r;
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
        public static  int peek(){
        int r = -1;
        if(isEmpty()){
            System.out.println("Queeue is emepty");

        }
        else{
            r = Q[front];
        }
        return  r;
        }

        public static void main (String args[]){

        enq(10);
        enq(20);
        enq(30);
        enq(40);
        enq(50);
        enq(60);
        enq(70);

            display();
            System.out.println("hello maosfds");
            System.out.println("deleted element from the queue: " + deq());
            System.out.println("deleted element from the queue: " + deq());
            System.out.println("Front ------> Element " + peek());
            System.out.println("deleted element from the queue: " + deq());
            System.out.println("deleted element from the queue: " + deq());
            System.out.println("deleted element from the queue: " + deq());
            System.out.println("This is a Stack and Queue");


        }



}
