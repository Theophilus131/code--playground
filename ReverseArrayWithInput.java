import java.util.Scanner;

public class ReverseArrayWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int size = input.nextInt();

        int[] integers = new int[size];

      
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            integers[i] = input.nextInt();
        }

      
        int[] reversed = new int[size];

       
        for (int i = 0; i < size; i++) {
            reversed[i] = integers[size - 1 - i];
        }

     
        System.out.print("Reversed array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
