package leetcode;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();

        int[] arr2 = new int[m];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        merge(arr1, n, arr2, m);

        scanner.close();
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
    }
}
