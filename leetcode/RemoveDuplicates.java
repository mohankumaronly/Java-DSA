package leetcode;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(removeDuplicates(arr));


        scanner.close();
    }

     public static int removeDuplicates(int[] nums) {

        int left = 1;
        int right = 1;

        while (right < nums.length) {
            if (nums[right] == nums[right - 1]) {
                right++;
            }else{
                nums[left] = nums[right];
                left++;
                right++;
            }
        }
        return left;
    }
}
