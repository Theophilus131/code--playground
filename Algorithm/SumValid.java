import java.util.Scanner;

public class SumValid{

public static void main(String [] args){

	
	Scanner input = new Scanner(System.in);

System.out.println("Enter number: ");

int total = 0;

for(int index = 0; index < 10; index++){
int number = input.nextInt();

if(number < 0 || number > 100){
	System.out.println("invalid number, enter number between 0 to 100: ");
}

else{

total += number;}

}


System.out.println("sum of number : " + total);



}


	}