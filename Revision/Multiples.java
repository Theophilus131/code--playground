	import java.util.Scanner;

public class Multiples{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first number: ");
int firstNumber = input.nextInt();

System.out.println("Enter second number: ");
int secondNumber = input.nextInt();

int tripleFirstNumber = firstNumber * 3;

int doubleSecondNumber = secondNumber * 2;

if( tripleFirstNumber % doubleSecondNumber == 0)
System.out.println("first number triple is a factor of the second number doubled: " );

else{ System.out.println("first number triple is not a factor of the second number doubled:");}


}

	}