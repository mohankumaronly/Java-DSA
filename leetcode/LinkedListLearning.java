package leetcode;
import java.util.Scanner;

public class LinkedListLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        ListNode head = insert(arr);
        printLinkedList(head);

        int target = scanner.nextInt();

        removeTargetValue(head, target);

        printLinkedList(head);
        scanner.close();
    }

    public static ListNode insert(int[] arr) {
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
            if(current.next != null) {
                System.out.print(current.val + " -> ");
            }else {
                System.out.print(current.val);
            }
            current = current.next;
        }
    }

    public static void removeTargetValue(ListNode head, int target) {
        ListNode current = head;
        ListNode temp = head;

        while (current != null) {
            if(current.val == target) {
                temp = current;
                current = current.next;
                temp.next = current;
            }
        }
    }
}



class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}