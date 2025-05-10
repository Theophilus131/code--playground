//Write a Java program to reverse a number (e.g., 1234 → 4321).

	import java.util.Scanner;
	public class ReverseNumber{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

  System.out.println("Enter number: ");
   int number = input.nextInt();

 if( number < 1000 || number > 10000)
     System.out.println("invalid number ");

  	int firstNumber  = (number / 1000) % 10;

	int secondNumber = (number / 100)  % 10;

	int thirdNumber  = (number / 10)   % 10;

	int fourthNumber =   (number % 10);

 	System.out.printf(" %d%d%d%d%n", fourthNumber, thirdNumber, secondNumber, firstNumber);






}
	}