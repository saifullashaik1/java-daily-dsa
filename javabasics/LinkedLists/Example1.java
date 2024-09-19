package javabasics.LinkedLists;
// Intersection of Two Linked Lists...
//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
// If the two linked lists have no intersection at all, return null.


public class Example1 {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if (headA == null || headB == null){
            return null;
        }
        ListNode pA = headA ;
        ListNode pB = headB ;
        while(pA != pB){

            pA = (pA == null) ? headB : pA.next;
            pB =(pB == null) ? headA :pB.next;
        }
        return pA;
    }


    public static void main(String[] args){
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode b1 = new ListNode(8);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);
        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);


        a1.next =a2;
        a2.next =c1;
        c1.next = c2;
        c2.next = c3;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        Example1 sol = new Example1();

        ListNode intersection = sol.getIntersectionNode(a1,b1);

        if(intersection != null){
            System.out.println("intersection at" + intersection.val );

        }
        else{
            System.out.println("no intersection");
        }



    }
}
