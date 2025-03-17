import java.util.Scanner;

class Node14 {
    int data;
    Node14 next, prev;

    Node14(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

 class DoublyLinkedList14 {
    Node14 head, tail;

    void insertAtBeginning(int data) {
        Node14 newNode = new Node14(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void insertAtEnd(int data) {
        Node14 newNode = new Node14(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void insertAtMiddle(int data) {
        if (head == null) {
            head = tail = new Node14(data);
            return;
        }
        Node14 slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node14 newNode = new Node14(data);
        newNode.next = slow;
        newNode.prev = slow.prev;
        if (slow.prev != null) {
            slow.prev.next = newNode;
        } else {
            head = newNode;
        }
        slow.prev = newNode;
    }

    void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
    }

    void deleteMiddleNode() {
        if (head == null || head.next == null) {
            System.out.println("List is too small to delete the middle node.");
            return;
        }
        Node14 slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow.prev != null) {
            slow.prev.next = slow.next;
        }
        if (slow.next != null) {
            slow.next.prev = slow.prev;
        }
    }

    void deleteLastNode() {
        if (tail == null) {
            System.out.println("List is already empty.");
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
    }

    boolean search(int key) {
        Node14 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void display() {
        Node14 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class DoublyLinkedListMain14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList14 list = new DoublyLinkedList14();

        System.out.print("Input the number of nodes: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Input data for node " + i + ": ");
            int data = scanner.nextInt();
            list.insertAtEnd(data);
        }

        System.out.println("\nData entered in the list:");
        list.display();

        System.out.println("\nInserting at the beginning...");
        list.insertAtBeginning(100);
        list.display();

        System.out.println("\nInserting at the middle...");
        list.insertAtMiddle(200);
        list.display();

        System.out.println("\nDeleting the first node...");
        list.deleteFirstNode();
        list.display();

        System.out.println("\nDeleting the middle node...");
        list.deleteMiddleNode();
        list.display();

        System.out.println("\nDeleting the last node...");
        list.deleteLastNode();
        list.display();

        System.out.print("\nEnter an element to search: ");
        int searchKey = scanner.nextInt();
        if (list.search(searchKey)) {
            System.out.println("Element found in the list.");
        } else {
            System.out.println("Element not found in the list.");
        }
    }
}
