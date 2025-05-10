//Write a Java program to find the largest of three numbers.

	import java.util.Scanner;
public class LargestThreeNumber{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);

 System.out.println("Enter three numbers: ");
  int firstNumber = input.nextInt();
  int secondNumber = input.nextInt();
  int thirdNumber = input.nextInt();

 int largest = firstNumber;
 
     if(secondNumber > largest){
	largest = secondNumber;}
   	
	if(thirdNumber > largest){	
	 largest = thirdNumber;

}

	System.out.printf("largest number is %d%n: ",firstNumber, secondNumber, thirdNumber);
 

	}

}