package leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.println(lengthOfLongestSubstring(input));

        scanner.close();
    }

     public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size();
    }
}
