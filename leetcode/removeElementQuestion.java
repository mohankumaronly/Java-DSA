package leetcode;

import java.util.Scanner;

public class removeElementQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int val = scanner.nextInt();
        System.out.println(removeElement(arr, val));
        scanner.close();
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] == val) {
                right++;
            } else {
                nums[left] = nums[right];
                left++;
                right++;
            }
        }
        return left;
    }
}
