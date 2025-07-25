import java.util.Scanner;

public class EvenIndex{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter numbers");

int [] number = new int [10];
int sum = 0;

for(int i = 0; i < number.length; i++){
number[i] = input.nextInt();

	if(i % 2 == 0){

	sum += number[i];
	}

} 


  System.out.println("the sum of even index : " + sum);




}





	}