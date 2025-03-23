import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    StackNode top;

    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Push data " + data);
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Pop data: " + top.data);
        top = top.next;
    }

    boolean isEmpty() {
        return top == null;
    }

    void insertAtEnd(int data) {
        if (top == null) {
            push(data);
            return;
        }
        StackNode temp = top;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new StackNode(data);
    }

    void display() {
        StackNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Check a stack is empty or not?");
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
        }
        stack.insertAtEnd(22);
        stack.display();
    }
}
