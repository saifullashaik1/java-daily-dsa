package javabasics.LinkedLists;
//Split Linked List in Parts..
//Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
//
//The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.
//
//The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.
//
//Return an array of the k parts.

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class Example2 {
    public ListNode[] splitListToParts(ListNode head ,int k){
        int n = 0;
        ListNode curr = head;
        while (curr != null){
            n++;
            curr = curr.next;
        }

        int partSize = n/k;
        int remainder = n%k;

        ListNode[] result = new ListNode[k];
        ListNode node = head ;

        for (int i = 0 ; i < k ;i++){
            ListNode partHead = node;
            ListNode prev = null;
            int currentPartSize = partSize + (remainder > 0 ? 1 : 0) ;
            remainder--;

            for (int j = 0;j<currentPartSize;j++){
                prev = node;
                node = node != null ? node.next : null ;

            }

                result[i] = partHead;


        }
        return result;

    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next=new ListNode(3);

        int k = 5;

        Example2 sol = new Example2();
        ListNode[] parts = sol.splitListToParts(head,k);

        for(ListNode part : parts){
            printList(part);
        }
    }
    public static void printList(ListNode head){
        ListNode curr =head;
        while (curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
