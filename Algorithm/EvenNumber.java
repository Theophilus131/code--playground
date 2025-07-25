
	import java.util.Scanner;
public class EvenNumber{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter numbers: ");


int sum = 0;


for(int index = 1; index < 10; index++ ){
int numbers = input.nextInt();

if(numbers % 2 == 0){
sum += numbers;
}

	}
	
System.out.println("sum of numbers is : " + sum);

	
	}


}