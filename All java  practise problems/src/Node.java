public class Node {

    int data;
    Node next;


    // make constructor (parameterized constructor)

    public  Node(int data){
        this.data = data;
        next = null;
        System.out.println("Node created success");
    }

    public void display(Node head){
        Node temp = head;
        while(temp != null) {
            System.out.print("==>" + temp.data);
            temp = temp.next;
        }
    }
    public Node addNodeAtStart(Node head, int data){
        // step 1 : Create a new node
        Node newNode = new Node(data);
        // step 2 : Make point NewNode to current node
        newNode.next = head;
        // step 3 : update head to newNode
        head = newNode;

        return head;
    }

    public void addNodeAtEnd(Node head , int data) {
        // step 1 : create a new node
        Node newNode = new Node(data);
        // step 2 : traverse the list
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // step 3: Setting the last node next pointer to the new node
        temp.next = newNode;
    }


    public static  void main(String args[]){
        Node first = new  Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Head point the first node of Linked list

        Node head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("\n Print data of singly linked list");
        head.display(head);
        head = head.addNodeAtStart(head,5);
        System.out.println("\n Print data of single linked list after node insert");
        head.display(head);

        System.out.println("\n Print data of single linked list add node at end");
        head.addNodeAtEnd(head,50);
        head.display(head);

    }
}
