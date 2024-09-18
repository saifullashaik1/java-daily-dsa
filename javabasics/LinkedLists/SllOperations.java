package javabasics.LinkedLists;
class Node {
    int data;
    Node next;  // Pointer to the next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;  // Initialize next as null
    }
}

public class SllOperations {
    Node head ;

    //insert new node at the beginning of the linked list
    public void insertAtBeginning(int data){
        Node newNode = new Node(data) ;

        newNode.next = head ;
        head = newNode;
    }

    //insert node at the end of the linked list

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;

        while(current.next != null){
            current = current.next;

        }
        current.next = newNode;

    }

    //delete a node by value

    public void deleteByValue(int key){
        Node current = head, prev = null;

        if(current != null && current.data == key){
            head = current.next;
            return;
        }
        while (current != null && current.data != key){
            prev = current ;
            current = current.next;

        }
        if (current == null){
            System.out.println("key is not found");
            return;
        }
        prev.next = current.next;
    }

    //print the linked list

    public void printList(){
        Node current = head ;
        while (current != null){
            System.out.print(current.data + " -> ");
            current=current.next;

        }
        System.out.println("null");
    }
    public static void main(String[] args){
        SllOperations list = new SllOperations();
        list.insertAtBeginning(9);
        list.insertAtBeginning(8);
        list.insertAtBeginning(7);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);

        System.out.println("Linked Lists");
        list.printList();

        System.out.println("After Deletion");
        list.deleteByValue(10);
        list.printList();

    }
}
