import java.util.*;

public class SquareNumberPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        // System.out.println(n);
        // call the function
        SquareSerielNumberPrintern(n);
    }
    public static void SquareSerielNumberPrintern (int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}