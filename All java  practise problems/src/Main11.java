import java.util.Scanner;

class Node11 {
    int data;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList_1 {
    Node11 head;

    void insert(int data) {
        Node11 newNode = new Node11(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node11 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node11 temp = head;
        while (temp != null) {
            System.out.println("Data = " + temp.data);
            temp = temp.next;
        }
    }

    void displayReverse(Node11 node) {
        if (node == null) return;
        displayReverse(node.next);
        System.out.println("Data = " + node.data);
    }

    void displayInReverse() {
        displayReverse(head);
    }
}

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList_1 list = new SinglyLinkedList_1();
        System.out.print("Input the number of nodes : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Input data for node " + i + " : ");
            int data = sc.nextInt();
            list.insert(data);
        }
        System.out.println("Data entered in the list :");
        list.display();
        System.out.println("The list in reverse are :");
        list.displayInReverse();
        sc.close();
    }
}