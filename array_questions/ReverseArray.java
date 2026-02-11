    import java.util.*;

    public class ReverseArray {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of Element : ");
            int n = scan.nextInt();
            System.out.println("Enter the Element of an array : ");
            int[] array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = scan.nextInt();
            }

            // Printing the Element of an array
            System.out.println("Element of an array : ");
            PrintArray(array);
            System.out.println("Reversign the array : ");
            // array = reverseArray(array);
            // PrintArray(array);
            OptimalReverseArray(array);
            PrintArray(array);

        }

        static void PrintArray(int[] array){
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
        }

        static int[] reverseArray(int[] array){
            int[] reversed = new int[array.length];

            for(int i = 0; i < array.length; i++){
                reversed[i] = array[array.length - 1 - i];
            }
            return reversed;
        }

        static void OptimalReverseArray(int[] array){
            int start = 0;
            int end = array.length - 1;

            while(start < end){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                start++; 
                end--;
            }
        }
    }