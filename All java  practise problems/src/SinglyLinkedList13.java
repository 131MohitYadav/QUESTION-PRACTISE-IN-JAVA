import java.util.Scanner;

class Node13 {
    int data;
    Node13 next;

    Node13(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linked13 {
    Node13 head;

    void insertAtBeginning(int data) {
        Node13 newNode = new Node13(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtMiddle(int data) {
        if (head == null) {
            head = new Node13(data);
            return;
        }
        Node13 slow = head, fast = head;
        Node13 prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        Node13 newNode = new Node13(data);
        if (prev != null) {
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
        head = head.next;
    }

    void deleteMiddleNode() {
        if (head == null || head.next == null) {
            System.out.println("List is too small to delete the middle node.");
            return;
        }
        Node13 slow = head, fast = head;
        Node13 prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = slow.next;
        }
    }

    void display() {
        Node13 temp = head;
        while (temp != null) {
            System.out.println("Data = " + temp.data);
            temp = temp.next;
        }
    }
}

public class SinglyLinkedList13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Linked13 list = new Linked13();

        System.out.print("Input the number of nodes: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Input data for node " + i + ": ");
            int data = scanner.nextInt();
            list.insertAtBeginning(data);
        }

        System.out.println("\nData entered in the list are:");
        list.display();

//        System.out.println("\nDeleting the first node...");
//        list.deleteFirstNode();
//        System.out.println("\nData after first node deletion:");
//        list.display();

        System.out.println("\nDeleting the middle node...");
        list.deleteMiddleNode();
        System.out.println("\nData after middle node deletion:");
        list.display();
    }
}
