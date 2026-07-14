package leetcode;

import java.util.Scanner;

public class LearningSlidingWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        sliding(arr, 3);
        scanner.close();
    }

    public static void sliding(int[] nums, int size) {
        if (nums == null || nums.length < size) return;

        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        for (int right = size; right < nums.length; right++) {
            int left = right - size + 1;
            for (int i = left; i <= right; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
    }
}
