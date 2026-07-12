package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        int[] result = twoSum(nums, target);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int completed = target - nums[i];

            if(map.containsKey(completed)){
                return new int[] {map.get(completed), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
    
}