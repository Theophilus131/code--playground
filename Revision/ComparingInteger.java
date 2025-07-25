import java.util.Scanner;

public class ComparingInteger{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter any integer: ");
int integer = input.nextInt();

int square = integer * integer;

System.out.println("square of number : " + square);

if(integer > 100 && square > 100){
System.out.println(" integer and square of integer is greater than 100: ");

}else if(integer == 100 && square == 100){
System.out.println("integer and square of integer is equal too 100: " );
} else if(integer != 100 && square != 100){

System.out.println(" integer and square of integer is not equal too 100: " );}
else {System.out.println("integer and square of integer is less than 100 " );}

}


	}