// Enter the n number to print the pattern :
// 7
// ********
// ********
// ********
// ********
// ********
// ********
// ********

import java.util.*;

class GenerateSquarePattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n number to print the pattern : ");
        int n = scanner.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}