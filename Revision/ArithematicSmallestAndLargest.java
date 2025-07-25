
	import java.util.Scanner;

public class ArithematicSmallestAndLargest{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first number: ");
int firstNumber = input.nextInt();

System.out.println("Enter second number: ");
int secondNumber = input.nextInt();

System.out.println("Enter third number: ");
int thirdNumber = input.nextInt();

int sum = firstNumber + secondNumber + thirdNumber;

int average = sum / 3;

int product = firstNumber * secondNumber * thirdNumber;

int smallest = 0;
int largest = 0;

if(firstNumber >= secondNumber && firstNumber >= thirdNumber){
		largest = firstNumber;
	}
else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
	largest = secondNumber;
}

else if(thirdNumber >= firstNumber && thirdNumber >= secondNumber){
		largest = thirdNumber;
		}
			
if(firstNumber <= secondNumber && firstNumber <= thirdNumber){
		smallest = firstNumber;
	}
else if(secondNumber <= firstNumber && secondNumber <= thirdNumber){
	smallest = secondNumber;
}

else if(thirdNumber <= firstNumber && thirdNumber <= secondNumber){
		smallest = thirdNumber;
		}
	
	System.out.println("the sum of numbers :" +sum);
	System.out.println("the average of numbers :" +average);
	System.out.println("the product of numbers :" +product);
	System.out.println("the largest numbers :" +largest);
	System.out.println("the smallest numbers :" +smallest);
	
	
	
	
	}
	
}