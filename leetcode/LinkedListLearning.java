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

        int m = scanner.nextInt();

        int[] arr1 = new int[m];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        ListNode node1 = insert(arr);
        ListNode node2 = insert(arr1);

        printLinkedList(node1);
        System.out.println();
        printLinkedList(node2);

        addTwoNumbers(node1, node2);
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

     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyhead = new ListNode(0);
        ListNode result = dummyhead;

        ListNode current1 = l1;
        ListNode current2 = l2;

        int carry = 0;

        while (current1 != null || current2 != null || carry != 0) {
            int val1 = 0;
            int val2 = 0;

            if(current1 != null) {
                val1 = current1.val;
                current1 = current1.next;
            }

            if(current2 != null) {
                val2 = current2.val;
                current2 = current2.next;
            }

            int sum = val1 + val2 + carry;

            carry = sum / 10;

            result.next = new ListNode(sum % 10);
            result = result.next;
        }

        return dummyhead.next;
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