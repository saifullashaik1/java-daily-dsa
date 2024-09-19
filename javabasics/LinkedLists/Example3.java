package javabasics.LinkedLists;

/**
 *
 */
//Delete Node in a Linked List..

public class Example3 {
    public void deletenode(ListNode node){
        node.val = node.next.val;
        node.next=node.next.next;

    }
    public static void main(String[] args){
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        Example3 sol = new Example3();
        sol.deletenode(node1);
        printList(head);
    }
    public static void printList(ListNode head){
        ListNode curr = head;
        while (curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;

        }
        System.out.println();
    }
}
