import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();
        System.out.println("Enter the Elements of array : ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The Elements of an array : ");
        PrintArray(array);
        int SecondLargestElement = isSecondLargest(array);
        System.out.println("Second Largest Element is : " + SecondLargestElement);
    }

    static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int isSecondLargest(int[] array){
        int SecondLargestElement = array[0];
        int firstLargestElement = array[0];
        for(int i = 0; i < array.length; i++){
            if(firstLargestElement < array[i]){
                SecondLargestElement = firstLargestElement;
                firstLargestElement = array[i];
            }
        }
        return SecondLargestElement;
    }
}
