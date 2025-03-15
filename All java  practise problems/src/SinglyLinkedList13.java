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

    void insertAtEnd(int data) {
        Node13 newNode = new Node13(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node13 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
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
            list.insertAtEnd(data);
        }

        System.out.println("Data entered in the list are:");
        list.display();

        System.out.print("Input data to insert at the beginning of the list: ");
        int newData = scanner.nextInt();
        list.insertAtBeginning(newData);

        System.out.println("Data after inserted in the list are:");
        list.display();
    }
}
