package leetcode;
import java.util.Scanner;

public class LinkedListQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        ListNode head = LinkedListInsertElements(arr);
        printLinkedList(head);
        ListNode newHead = removeNthFromEnd(null, 2);
        printLinkedList(newHead);
        scanner.close();
    }

    public static ListNode LinkedListInsertElements(int[] arr) {

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            current.next = temp;
            current = temp;
        }

        return head;

    }

    public static void printLinkedList(ListNode head) {

        ListNode current = head;

        while (current != null) {
            if (current.next != null) {
                System.out.print(current.val + " -> ");
            }else{
                System.out.print(current.val);
            }
            current = current.next;
        }
    }

     public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode current = new ListNode(0);
        current.next = head;
        ListNode left = current;
        ListNode right = current;

        for (int i = 0; i <= n; i++) {
            right = right.next;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return current.next;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}