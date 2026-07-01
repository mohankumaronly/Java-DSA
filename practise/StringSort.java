package practise;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String strings[] = new String[n];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        
        
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if(strings[i].length() > strings[j].length()){
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }



        scanner.close();

    }
}