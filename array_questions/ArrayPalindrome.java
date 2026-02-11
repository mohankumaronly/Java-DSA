    import java.util.*;

    public class ArrayPalindrome {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the array : ");
            int n = scanner.nextInt();
            System.out.println("Enter the Elements of array : ");
            int[] array = new int[n];
            for(int i = 0; i <   n; i++){
                array[i] = scanner.nextInt();
            }
            System.out.println("The Elements of an array : ");
            PrintArray(array);
            boolean YesOrNot = isPalindrome(array);
            if(YesOrNot){
                System.out.println("Yes given element of an array is palindrome");
            }else{
                System.out.println("NO given element of an array is NOT palindrome");
            }
        }

        static void PrintArray(int[] array){
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        static boolean isPalindrome(int[] array){
            int start = 0; 
            int end = array.length - 1;
            while(start < end){
                if(array[start] != array[end]){
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }