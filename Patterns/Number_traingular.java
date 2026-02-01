public class Number_traingular{
    public static void main(String[] args){
        Number_traingular_printer(6);
    }

    public static void Number_traingular_printer(int n){
       for (int i = 1; i <= n; i++) {
            
            // 1. Inner loop for Leading Spaces
            // This prints (n - i) spaces to push the numbers to the center
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. Inner loop for Numbers
            // This prints the number 'i', followed by a space
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // 3. Move to the next line
            System.out.println();
          }   
       }   }
