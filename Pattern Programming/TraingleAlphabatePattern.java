import java.util.*;

public class TraingleAlphabatePattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n){
        for(int i = 1; i <= n; i++){
            for(char ch = 'A'; ch <= 'A' + n - 1; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}