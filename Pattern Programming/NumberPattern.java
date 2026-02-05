// Expected Output

// 11111
// 22222
// 33333
// 44444
// 55555



import java.util.*;

public class NumberPattern{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        // Call the function 
        NumberSquarePattern(n);
    }

    public static void NumberSquarePattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n; j++ ){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}