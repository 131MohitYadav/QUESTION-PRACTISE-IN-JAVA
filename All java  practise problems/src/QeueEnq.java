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

public static int deq(){
        int r = 0;
        // STEP 1 -> TO CHECK UNDERFLOW COONDITION
    if ( isEmpty()){
        System.out.println("Queue is underflow ");
    }
    else if ( rear == front){
        // STEP 2 -> Check if Queue contains only one element then front assign into another  variable and front and rear by -1;
        r = Q[front];
        front = -1;
        rear = -1;
        System.out.println("Deleted last element");
    }
    else{
        // step 3 -> if it contain multiple element then
        r = Q[front];
        front++;
        System.out.println("Delete Element from the Queue");
    }
    return r;
    }

    public static int peek(){
        int r=-1;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            r=Q[front];
        }
        return r;
    }
    public static void main(String args[]){
        Enque(10);
        Enque(20);
        Enque(30);
        Enque(40);
        System.out.println("Deleted Element from the queue: " + deq());
        System.out.println("Deleted Element from the queue: " + deq());
        System.out.println("Front======> " + peek());

    }

}
