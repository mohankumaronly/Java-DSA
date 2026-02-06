import java.util.*;
public class SqaureBinaryNumberPattern{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        PrintingPattern(n);
    }

    public static void PrintingPattern(int n){
        for(int i = 1; i <= n; i++){
            int value = 1;
            for(int k = 1; k <= n - i; k++){
                value++;
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}