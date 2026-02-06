import java.util.*;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    public static void main(String[] args) {

        Node n1 = new Node(11);
        Node n2 = new Node(12);
        Node n3 = new Node(13);
        Node n4 = new Node(14);
        Node n5 = new Node(15);
        Node n6 = new Node(16);
        Node n7 = new Node(17);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        System.out.println("Travelling linked list:");
        traverse(head);

        Scanner sc = new Scanner(System.in);

        // INSERTION
        System.out.println("\nEnter a number to insert:");
        int element = sc.nextInt();

        System.out.println("Enter the position to insert:");
        int pos = sc.nextInt();

        head = addition(head, element, pos);

        System.out.println("After insertion:");
        traverse(head);

        // DELETION
        System.out.println("\nEnter the position to delete:");
        int p = sc.nextInt();

        head = deletion(head, p);

        System.out.println("After deletion:");
        traverse(head);
    }

    // Traverse
    public static void traverse(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    // Insert
    public static Node addition(Node head, int data, int pos) {

        Node toAdd = new Node(data);

        if (pos == 0) {
            toAdd.next = head;
            return toAdd;
        }

        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }

        toAdd.next = prev.next;
        prev.next = toAdd;

        return head;
    }

    // Delete
    public static Node deletion(Node head, int pos) {

        if (pos == 0) {
            return head.next;
        }

        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
    }
}
