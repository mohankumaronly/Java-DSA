import java.util.*;

public class AllInOneQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scanner.nextInt();
        System.out.println("Enter the Element if the array : ");
        int[] array = new int[n];
        TakeInputElementArray(array);
        System.out.println("Write the number squence to execute the task");
        System.out.println("1. Print the element of an array");
        System.out.println("2. Find Maximum value of an array");
        System.out.println("3. Find Minimum value of an array");
        System.out.println("4. Find Second Largest value of an array");
        int UserNumber = scanner.nextInt();
        switch (UserNumber) {
            case 1:
                PrintElementsOfArray(array);
                break;
            case 2:
                System.out.println("Largest Element is : " + FindLargestElement(array));
                break;
            case 3:
                System.out.println("Minimum Element is : " + FindMinimumElement(array));
                break;
            case 4:
                System.out.println("Second Largest Element is : " + secondLargestElement(array));
                break;
            default:
                System.out.println("Enter the valid number to perform the task");
                break;
        }

    }

    public static void TakeInputElementArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void PrintElementsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int FindLargestElement(int[] array) {
        int maxvalue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxvalue < array[i]) {
                maxvalue = array[i];
            }
        }
        return maxvalue;
    }

    public static int FindMinimumElement(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int secondLargestElement(int[] array) {
        int secondLargestValue = array[0];
        int FirstlargestElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (FirstlargestElement < array[i]) {
                secondLargestValue = FirstlargestElement;
                FirstlargestElement = array[i];
            } else if (array[i] > secondLargestValue && array[i] != FirstlargestElement) {
                secondLargestValue = array[i];
            }
        }
        return secondLargestValue;
    }

}
