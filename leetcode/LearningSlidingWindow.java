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
        System.out.println(findMaxAverage(arr, 4));
        scanner.close();
    }

    public static void sliding(int[] nums, int size) {
       for (int i = 0; i < size; i++) {
        System.out.print(nums[i] + " ");
       }

       System.out.println();

       int left = 1;
       int right = size;

       while (right < nums.length) {
           for (int i = left; i <= right; i++) {
            System.out.print(nums[i] + " ");
           }
           System.out.println();
           left++;
           right++;
       }

    }

    public static void SumationWindow(int[] nums, int size){

        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        maxSum = sum;

        int left = 0;
        int right = size;

        while (right < nums.length) {
            sum = sum - nums[left] + nums[right]; 
            if(maxSum < sum) {
                maxSum = sum;
            }
            left++;
            right++;
        }
        System.out.println(maxSum);
    }

    public static double findMaxAverage(int[] nums, int k) {
        double maxAvgSum = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxAvgSum = sum;

        int left = 0;
        int right = k;

        while (right < nums.length) {
            sum = sum - nums[left] + nums[right];
            if (maxAvgSum < sum) {
                maxAvgSum = sum;
            }
            left++;
            right++;
        }

        return maxAvgSum/k;
    }
}
