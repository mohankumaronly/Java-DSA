import java.util.*;

public class FindMaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element of the arrray : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the element of the array : ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt(); 
        }
        // // printing the element of the user
        // System.out.println("Elements of an array : ");
        // for(int i = 0; i < n; i++){
        //     System.out.println(array[i] + " ");
        // }

        int maximumValue = MaxValue(array);
        System.out.println("maximum value of the given array : "+ maximumValue);
    }

    public static int MaxValue(int[] array){

        int maximumValue = array[0];
        for(int i = 0; i < array.length; i++){
            if(maximumValue < array[i]){
                maximumValue = array[i];
            }
        }
        return maximumValue;
    }
}