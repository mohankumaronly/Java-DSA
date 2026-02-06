import java.util.*;

public class Pattern1{
    public static void main(String[] args){
        System.out.println("Enter the value of the n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // System.out.println(n);
        PrintPattern(n);
    }

    public static void PrintPattern(int n){

        for(int i = 1; i <= n; i++){
            int counter = 1;
            for(int j = 1; j <= n; j++){
                if(counter == j + 1){
                    counter++;
                }
                System.out.print(counter);
            }
            System.out.println();
        }
    }
}