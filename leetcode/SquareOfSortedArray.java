package leetcode;

import java.util.Scanner;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println(Math.max(10, 20));
        
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = sortedSquares(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        scanner.close();
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        int[] result = new int[nums.length];

        while (left <= right) {

            int leftResult = nums[left] * nums[left];
            int rightResult= nums[right] * nums[right];

            if(leftResult > rightResult){
                result[index] = leftResult;
                left++;
            }else{
                result[index] = rightResult;
                right--;

            }
            index--;
        }
        return result;
    }
}
