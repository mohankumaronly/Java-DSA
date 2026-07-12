package leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        lengthOfLongestSubstring(input);

        scanner.close();
    }

     public static int lengthOfLongestSubstring(String s) {

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(s.charAt(j2));
                }
                System.out.println();
            }
        }

       return 0;
    }
}
