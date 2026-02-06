import java.util.*;

public class NumberSquarePattern02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        // System.out.println(n);
        PrintingPattern(n);
    }

    public static void PrintingPattern(int n){
        int value = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j); 
            }
            for(int k = i; k <= n - 1; k++){
                System.out.print(value);
            }
            System.out.println();
        }
    }
}