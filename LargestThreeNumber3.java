
		import java.util.Scanner;
public class LargestThreeNumber3{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);

 System.out.println("Enter three numbers: ");
  int firstNumber = input.nextInt();
  int secondNumber = input.nextInt();
  int thirdNumber = input.nextInt();

if(firstNumber >=  secondNumber && firstNumber >=  thirdNumber)
	System.out.println("largest is: " + firstNumber);

if(secondNumber >=  firstNumber && secondNumber >=  thirdNumber)
	System.out.println("largest is: " + secondNumber);

if(thirdNumber >=  secondNumber && thirdNumber >=  firstNumber)
	System.out.println("largest is: " + thirdNumber);

}
}