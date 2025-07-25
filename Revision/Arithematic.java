
import java.util.Scanner;

public class Arithematic{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter first number: ");
int firstNumber = input.nextInt();

System.out.println("Enter second number: ");
int secondNumber = input.nextInt();

int squareFirst = firstNumber * firstNumber;
int squareSecond = secondNumber * secondNumber;

int sumSquare = squareFirst * squareSecond;
int differenceSquare = squareFirst - squareSecond;

System.out.println("first number squared: " +squareFirst);
System.out.println("second number squared: " +squareSecond);
System.out.println("sum of squared: " +sumSquare);
System.out.println("difference of squared: " +differenceSquare);

}
	}