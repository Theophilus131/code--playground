	
	// (Extremes) Write an application that finds the minimum and maximum amongst several
 //integers and then computes the sum of the two extremes. The user will be prompted to input how
// many values the application should ask the user to input.
	
	
	import java.util.Scanner;
	
	public class Extremes{
	
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println(" how many numbers do you wish to input: ");
	int number = input.nextInt();
	
	System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();
		
	int minimum = firstNumber;
	int maximum = firstNumber;
	int sumExtremes = 0;
	


	for(int index = 1; index < number; index++){
		int currentNumber = input.nextInt();
	
		if(currentNumber > maximum){
			maximum = currentNumber;	
		}
	
		if(currentNumber < minimum){
		
			minimum = currentNumber;
	
	}
		sumExtremes = minimum + maximum;
	
	
		}
		
		System.out.println("The minimum of the numbers: " + minimum);
		
		System.out.println("The maximum of the numbers: " + maximum);
		
		System.out.println("Sum of extrames is: " + sumExtremes);
		
		
		
		
		
		
		}
	

	
	
	}
 