package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PractisingSimpleQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }

       System.out.println(countStringFrequency(arr));
        
        scanner.close();
    }

    public static String countStringFrequency(String[] str) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if(!map.containsKey(str[i])) {
                map.put(str[i], 1);
            }else {
                int count = map.get(str[i]);
                count++;
                map.put(str[i], count);
            }
        }

        String result = "";
        int maxValue = 0;

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();             
            }
        }

        System.out.println(maxValue);

         for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == maxValue) {
                result = entry.getKey();             
            }
        }

        return result;
    }
}
