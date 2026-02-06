import java.util.*;

public class NumberSqaurePattern03{
    public static void main(String[] aargs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        // System.out.println(n);
        PrintingPattern(n);
    }

    public static void PrintingPattern(int n){
        int value = 5;
        for(int i = 1; i <= n; i++){      
            for(int j = 1; j <= n; j++){
                System.out.print(value);
            }
            value--;
            System.out.println();
        }
    }

}