import java.util.Scanner;

class Node10 {
    int data;
    Node10 next;

    Node10(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node10 head;

    void insert(int data) {
        Node10 newNode = new Node10(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node10 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node10 temp = head;
        while (temp != null) {
            System.out.println("Data = " + temp.data);
            temp = temp.next;
        }
    }
}

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.print("Input the number of nodes : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Input data for node " + i + " : ");
            int data = sc.nextInt();
            list.insert(data);
        }
        System.out.println("Data entered in the list :");
        list.display();
        sc.close();
    }
}
