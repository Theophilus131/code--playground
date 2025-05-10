
	import java.util.Scanner;
public class SimpleInterest{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);

System.out.println("Enter amount :");
int principalAmount = input.nextInt();

System.out.println("Enter annaual rate :");
double annualRate = input.nextDouble();

System.out.println("Enter years :");
int time = input.nextInt();

   double simpleInterest =  principalAmount *(annualRate/100) * time; 


System.out.printf("the simple interest is %f%n: ", simpleInterest);


}

}