//Generate a random number from 1 to 100. Ask the user to type “even” or “odd” depending on what they think the number is. Give them a score after 10 tries.

import java.util.Scanner;
import java.util.Random;

public class EvenOddRandom{
public static void main(String [] args){

Random random = new Random();
Scanner input = new Scanner(System.in);

int score = 0;

for(int count=1; count <= 10; count++){
int number = random.nextInt(100);

System.out.println("Is this number Even or Odd "+ number + ": ");
String answer = input.next();

if(number % 2 == 0){
 
 if(answer.equalsIgnoreCase("Even")){
	System.out.println("you answered correctly:");
	score++; }
else{System.out.println("wrong, it was Even: ");}

}else{

if(answer.equalsIgnoreCase("Odd")){
	System.out.println("you answered correctly:");
	score++;
}
else{System.out.println("wrong, it was odd: ");}
	}

}
System.out.printf("your final score is %d ", score);



	}


}