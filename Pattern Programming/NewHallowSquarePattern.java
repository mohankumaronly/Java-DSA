import java.util.*;

public class NewHallowSquarePattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        // CALL THE FUNCTION HERE
        NewHallowSquarePatternPrinter(n);
    }

    public static NewHallowSquarePatternPrinter(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1|| j == n){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}