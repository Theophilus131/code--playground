 //(Calculating the Sum of Digits) Write a method that takes a four-digit integer value and
 //returns the sum of the digits. For example, given the number 7631, the method should return 17.
 //Incorporate the method into an application that reads a value from the user and displays the result.

public class SumofDigits{


public static int sumNumber(int number){
	
	int total = 0;
	for(int count =1; count <= number; count++ ){

	int firstNumber  = (number / 1000) % 10;

	int secondNumber = (number / 100)  % 10;

	int thirdNumber  = (number / 10)   % 10;

	int fourthNumber =   (number % 10);


	total = firstNumber + secondNumber + thirdNumber + fourthNumber;
	
			}
		return (total);

}

























} 