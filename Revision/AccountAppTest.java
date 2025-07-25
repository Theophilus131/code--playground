
import java.util.Scanner;

 public class AccountAppTest{
 public static void main(String [] args){

	Scanner input = new Scanner(System.in);
 

 AccountApp theoAccount = new AccountApp("Chris Monday", 10000.00);

 AccountApp theoSecondAccount = new AccountApp("John Blue", 1000.53);

System.out.printf(" %s balance: $%.2f%n", theoAccount.getName(), theoAccount.getBalance());
 
 System.out.printf("%s balance: $%.2f%n", theoSecondAccount.getName(), theoSecondAccount.getBalance() );


	System.out.print("Enter deposit amount for theo Account: ");
	double depositAmount = input.nextDouble();

	System.out.printf("%n adding %.2f to theoAccount ", depositAmount);	

	theoAccount.deposit(depositAmount);

	System.out.printf("%s balance: $%.2f%n ", theoAccount.getName(), theoAccount.getBalance());
	
	 System.out.printf("%s balance: $%.2f%n", theoSecondAccount.getName(), theoSecondAccount.getBalance() );

	
	System.out.print("Enter deposit for theo second account: ");
	depositAmount = input.nextDouble();

	theoSecondAccount.deposit(depositAmount);

	System.out.printf("%s balance: $%.2f%n ", theoAccount.getName(), theoAccount.getBalance());
	
	 System.out.printf("%s balance: $%.2f%n", theoSecondAccount.getName(), theoSecondAccount.getBalance() );

	
	System.out.println("Enter amount you wish to withdraw: ");
	double withdrawalAmount = input.nextDouble();

	theoAccount.withdraw(withdrawalAmount);

	System.out.println("withdrawal amount is: ", theoAccount.getWithdraw());


	
	}



}