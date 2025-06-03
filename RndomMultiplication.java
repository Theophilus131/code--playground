//Generate two random numbers between 5 and 15. Ask the user to multiply them. Track how many they got right out of 5 questions.

import java.util.Scanner;
import java.util.Random;

public class RndomMultiplication{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
Random random = new Random();

int score = 0;

for(int count = 1; count <= 5; count++){

int firstNumber = random.nextInt(5, 16);
int secondNumber = random.nextInt(5, 16);
int answer = firstNumber * secondNumber;

System.out.println("Mutiply  "+ firstNumber +" * "+ secondNumber +" : ");
int userInput = input.nextInt();

if(userInput == answer){
System.out.println("you answered correctly: ");
score++;}

else{System.out.println("wrong answer. the correct answer is: " + answer);}


	}

System.out.printf("you answered %d questions ", score);


}







	}