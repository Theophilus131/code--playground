	 // Generate two random integers under 100 and prompt user for there sum


	import java.util.Random;
	import java.util.Scanner;

	public class SimpleSumGame {
    	public static void main(String[] args) {
       
	Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

       
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);

        int correctSum = num1 + num2;

        
        System.out.println("What is the sum of " + num1 + " and " + num2 + "?");
        int userSum = scanner.nextInt();

        if (userSum == correctSum) {
            System.out.println("True! Your answer is correct.");
        } else {
            System.out.println("False! The correct answer is " + correctSum);
        }

       


    }
}
