// Expected Output

// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 

import java.util.*;

public class GenerateSquarePattern1{
    public static void main(String[] args){
        int n;
        System.out.println("Enter the number to print the pattern : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Printingpattern(n);
    }

    // Print the Pattern
    public static void Printingpattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// output :
// Enter the number to print the pattern : 
// 7
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 