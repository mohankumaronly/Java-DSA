import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// 1. Given an value of n write program to check whether the given number is prime or not

// 2. Given two integer value n and m write the program to print all the prime number between the n and m
// Input 2, 10
// output 2,3,5,7


public class Learning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the squence number to perform the task");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Enter the value of the n");
                int checkPrimeNumber = scanner.nextInt();
                System.out.println(isPrime(checkPrimeNumber));
                break;
            case 2:
                System.out.println("Enter the two prime Numbers : ");
                int isPrimeNumberOne = scanner.nextInt();
                int isPrimeNumberTwo = scanner.nextInt();
                isPrimeNumberBetweenTwoValue(isPrimeNumberOne, isPrimeNumberTwo);
            default: 
                System.out.println("Enter the valid Number");
                break;
        }
    }

    
    public static string isPrimeNumberBetweenTwoValue(int n, int m){
        for(int i = 0; i <= n; i++){
            
        }
    }

    public static String isPrime(int n) {

        int count = 0;
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // count++;
        // }
        // }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return "Prime";
        } else {
            return "Not Prime";
        }
    }
}
