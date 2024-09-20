package javabasics.LinkedLists;
//Palindrome Linked List....


import java.util.List;

public class Example4 {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;


        }
        return prev;

    }
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next ==null )return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;


        }

        ListNode secondHalf = reverse(slow);

        ListNode firstHalf = head;
        ListNode secondHalfCopy = secondHalf;

        while (secondHalf != null){
            if (firstHalf.val != secondHalf.val){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.    next;

        }
        return  true;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Example4 sol = new Example4();
        boolean result = sol.isPalindrome(head);
        System.out.println(result);
    }

}

