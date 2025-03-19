import java.util.Scanner;

class Node15 {
    int data;
    Node15 next;

    Node15(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node15 last;

    void create(int n, Scanner scanner) {
        for (int i = 1; i <= n; i++) {
            System.out.print("Input data for node " + i + " : ");
            int data = scanner.nextInt();
            insert(data);
        }
    }

    void insert(int data) {
        Node15 newNode = new Node15(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    void display() {
        if (last == null) {
            return;
        }
        Node15 temp = last.next;
        int count = 1;
        do {
            System.out.println("Data " + count + " = " + temp.data);
            temp = temp.next;
            count++;
        } while (temp != last.next);
    }
}

public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();
        System.out.print("Input the number of nodes : ");
        int n = scanner.nextInt();
        list.create(n, scanner);
        System.out.println("Data entered in the list are :");
        list.display();
        scanner.close();
    }
}
