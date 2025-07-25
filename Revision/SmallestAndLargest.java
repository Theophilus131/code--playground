
import java.util.Scanner;

public class SmallestAndLargest{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first number: ");
int firstNumber = input.nextInt();

System.out.println("Enter second number: ");
int secondNumber = input.nextInt();

System.out.println("Enter third number: ");
int thirdNumber = input.nextInt();

System.out.println("Enter fouth number: ");
int fourthNumber = input.nextInt();

System.out.println("Enter fifth number: ");
int fifthNumber = input.nextInt();

int largest = 0;

int smallest = 0;

if(firstNumber >= secondNumber && firstNumber >= thirdNumber && firstNumber >= fourthNumber && firstNumber >= fifthNumber){
		largest = firstNumber;
		smallest = firstNumber;
	
	}
else if(secondNumber >= firstNumber && secondNumber >= thirdNumber && secondNumber >= fourthNumber && secondNumber >= fifthNumber){
		largest = secondNumber;
		smallest = secondNumber;
}

else if(thirdNumber >= firstNumber && thirdNumber >= secondNumber && thirdNumber >= fourthNumber && thirdNumber >= fifthNumber){
		largest = thirdNumber;
		smallest = thirdNumber;
	
	}

else if(fourthNumber >= firstNumber && fourthNumber >= secondNumber && fourthNumber >= thirdNumber && fourthNumber >= fifthNumber){
		largest = fourthNumber;
		smallest = fourthNumber;
	
	}

else if(fifthNumber >= secondNumber && fifthNumber >= thirdNumber &&fifthNumber >= fourthNumber && fifthNumber >= fifthNumber){
		largest = fifthNumber;
		smallest = fifthNumber;
	
	}


System.out.println("largest number is " + largest);
System.out.println("smallest number is: " + smallest);
		}

	}