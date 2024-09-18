package javabasics.LinkedLists;

public class RevereseLL {
    Node head;

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current= next;

        }
        head = prev ;

    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head ==  null){
            head = newNode ;
            return;
        }
        Node current = head ;
        while (current.next != null){
            current = current.next;

        }
        current.next = newNode;

    }
    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + "->");
            current = current.next;

        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        RevereseLL list = new RevereseLL();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverse();  // Reverse the linked list

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
