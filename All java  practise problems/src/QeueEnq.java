 class QueueEnq {
    static int Q[] = new int[5];
    static int front = -1;
    static int rear = -1;

    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static boolean isFull() {
        return rear == Q.length - 1;
    }

    public static void Enque(int data) {
        if (isFull()) {
            System.out.println("Queue is overflow");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        Q[rear] = data;
        System.out.println("Inserted: " + data);
    }

    public static int deq() {
        if (isEmpty()) {
            System.out.println("Queue is underflow");
            return -1;
        }
        int r = Q[front];
        if (rear == front) { // If there's only one element
            front = rear = -1;
        } else {
            front++;
        }
        System.out.println("Deleted: " + r);
        return r;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return Q[front];
    }

    public static void main(String args[]) {
        Enque(10);
        Enque(20);
        Enque(30);
        Enque(40);
        Enque(50);


        System.out.println("Deleted: " + deq());
        System.out.println("Deleted: " + deq());
        System.out.println("Front Element: " + peek());

        System.out.println("Deleted: " + deq());
    }
}
