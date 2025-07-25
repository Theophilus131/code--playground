import java.util.Scanner;
public class Number{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter numbers: ");
int numbers = input.nextInt();

int sum = 0;
int average = 0;

for(int index = 1; index < 10; index++ ){
numbers = input.nextInt();

sum += numbers;

average = sum / 10;

}
	
System.out.println("sum of numbers is : " + sum);

System.out.println("average of numbers is: " + average);

	
	}


}