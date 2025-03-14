import java.util.Scanner;

class Node_12 {
    int data;
    Node_12 next;

    Node_12(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinked_12 {
    Node_12 head;

    void insert(int data) {
        Node_12 newNode = new Node_12(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node_12 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node_12 temp = head;
        while (temp != null) {
            System.out.println("Data = " + temp.data);
            temp = temp.next;
        }
    }

    int countNodes() {
        int count = 0;
        Node_12 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class Main_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinked_12 list = new SinglyLinked_12();
        System.out.print("Input the number of nodes : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Input data for node " + i + " : ");
            int data = sc.nextInt();
            list.insert(data);
        }
        System.out.println("Data entered in the list :");
        list.display();
        System.out.println("Total number of nodes = " + list.countNodes());
        sc.close();
    }
}
