

import java.util.Scanner;

public class DivisibleBy{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter  number: ");
int number = input.nextInt();

if(number % 3 == 0) System.out.println("number is divisible by 3: ");

else{ System.out.println("Number is not divisble by 3: ");}

}
	}