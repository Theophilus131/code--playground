
	
import java.util.Scanner;

public class SmallestAndLargestRefactor{
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

int largest = firstNumber;

int smallest = firstNumber;

if(secondNumber >= largest) largest = secondNumber;
if(secondNumber <= smallest) smallest = secondNumber;

if(thirdNumber >= largest) largest = thirdNumber;
if(thirdNumber <= smallest) smallest = thirdNumber;

if(fourthNumber >= largest) largest = fourthNumber;
if(fourthNumber <= smallest) smallest = fourthNumber;

if(fifthNumber >= largest) largest = fifthNumber;
if(fifthNumber <= smallest) smallest = fifthNumber;


System.out.println("largest number is: " + largest);
System.out.println("smallest number is : " + smallest);

}

	}



