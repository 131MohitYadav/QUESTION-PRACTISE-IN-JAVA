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

    }
}
