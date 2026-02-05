import java.util.*;

public class GenerateSquarePatternAgainOne {
    public static void main(String[] args){
        System.out.println("Enter the value : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // call the function 
        PrintPattern(n);

    }

    public static void PrintPattern(int n ){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}