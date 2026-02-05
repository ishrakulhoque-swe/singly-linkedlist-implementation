import java.util.*;


class Node <E>{

    E data;
    Node next;

    public Node(E data){
        this.data = data;
    }
}


public class Tester {

    static void main() {

        Node<Integer> n1 = new Node<>(12);
        Node<Integer> n2 = new Node<>(13);
        Node<Integer> n3 = new Node<>(14);
        Node<Integer> n4 = new Node<>(15);
        Node<Integer> n5 = new Node<>(16);
        Node<Integer> n6 = new Node<>(17);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;
        // Travelling a linked list
        System.out.println("Travelling linkedlist : ");
        traverse(head);

        System.out.println();

        // Inserting element in linked list
        System.out.println("Inserting element in a linkedlist :");

        System.out.println("Enter an element to add in the linkedlist : ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println("Enter the postion to add ");
        int pos = sc.nextInt();
        insert(data,head,pos);
        System.out.println("Successfully inserted "+data+" at postion "+pos);
        System.out.println("Updated linkedlist ");
        traverse(head);

        // Deleting element from a linkedlist
        System.out.println();
        System.out.println("Deleting element from a linkedlist ");
        System.out.println("Enter a position to remove");
        int p = sc.nextInt();
        delete(p,head);
        System.out.println("Deletion successful");
        System.out.println("Updated linked list");
        traverse(head);



    }

    public static void traverse(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static <E> void  insert(E data,Node head, int pos ){
        Node toAdd = new Node<>(data);

        if(pos==0){
            toAdd.next = head;
            head = toAdd;
            return;
        }

        Node prev = head;

        for(int i=0;i<pos -1;i++){
            prev = prev.next;
        }


        toAdd.next = prev.next;
        prev.next = toAdd;

    }

    public static  void delete(int pos,Node head){
        if(pos==0){
            head= head.next;
            return;
        }
        Node prev = head;
        for(int i =0;i<pos-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
}
