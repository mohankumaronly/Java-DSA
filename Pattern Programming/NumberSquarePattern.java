// Expected Output

// 11111
// 22222
// 33333
// 44444
// 55555

import java.util.*;

class NumberSquarePattern{
    public static void main(String[] args){
        // take the input from the user
        System.out.print("Enter the number to print the pattern : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // printing the pattern using the for loop
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

// Ouput :
// Enter the number to print the pattern : 5
// 11111
// 22222
// 33333
// 44444
// 55555