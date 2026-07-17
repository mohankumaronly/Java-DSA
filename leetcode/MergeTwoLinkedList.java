package leetcode;
import java.util.List;
import java.util.Scanner;

public class MergeTwoLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        ListNode list1 = insertingElement(arr1);

        int m = scanner.nextInt();

        int[] arr2 = new int[m];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        ListNode list2 = insertingElement(arr2);
        
        // printLinkedList(list1);
        // System.out.println();
        // printLinkedList(list2);

        mergeTwoLists(list1, list2);


        scanner.close();
    }

    public static ListNode insertingElement(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            current.next = temp;
            current = current.next;
        }

        return head;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);

        ListNode p1 = head;
        ListNode p2 = head;

        ListNode current = head.next;

        while (p1 != null || p2 != null) {

            int val1 = 0;
            int val2 = 0;

            if(p1.val < p2.val) {
                current.val = p1.val;
                p1 = p1.next;
            }else {
                current.val = p2.val;
                p2 = p2.next;
            }
            current = current.next;
        }

        while (p1 != null) {
            current.val = p1.val;
            p1 = p1.next;
            current = current.next;
        }

         while (p2 != null) {
            current.val = p2.val;
            p2 = p2.next;
            current = current.next;
        }

        return head.next;
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
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
