import java.util.*;

class Node21 {
    int data;
    Node21 next;
    Node21(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist21 {
    Node21 head;

    void insert(int data) {
        Node21 newNode = new Node21(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node21 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void sort() {
        List<Integer> list = new ArrayList<>();
        Node21 temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        for (int num : list) {
            temp.data = num;
            temp = temp.next;
        }
    }

    void display() {
        Node21 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SortLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist21 list = new linkedlist21();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }
        list.sort();
        list.display();
    }
}