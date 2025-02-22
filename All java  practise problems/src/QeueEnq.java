public class QeueEnq {

    static int Q[] = new int[5];
    static int front = -1;
    static int rear = -1;

    public static boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public static  boolean isFull(){
        return rear == Q.length-1;
    }
    public static void Enque(int data){
        // STEP 1 -> FIRST CHECK OVERFLOW CONDITION
        if ( isFull()){
            System.out.println("Queue is overflow");
        }
        // STEP 2 -> IF QUEUE IS EMPTY INCREASE FRONT AND REAR BY 1
            else if(isEmpty()){
                front++;
                rear++;
        }
            else {
                // STEP 3 -> IF QUEUE IS NOT EMPTY INCREASE REAR BY 1
            rear++;

            // STEP 4-> INSERT DATA INTO THE QUEUE
            Q[rear] = data;
            System.out.println("Data insert after first element");
        }
    }


    public static void main(String args[]){
        Enque(10);
        Enque(20);
        Enque(30);
        Enque(40);
    }

}
