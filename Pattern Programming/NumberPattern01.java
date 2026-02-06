import java.util.*;

public class NumberPattern01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the n :  ");
        int n = scanner.nextInt();
        // System.out.println(n);
        // Call the function here
        PatterPrinting(n);

    }

    public static void PatterPrinting(int n){
        int value = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j){
                    System.out.print(i);
                }else{
                    System.out.print(value);
                }
            }
            System.out .println();
        }
    }
}