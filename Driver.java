	public class Driver{
	 public static void main(String [] args){
	
		Account1 wandeAccount = new Account1();
		 wandeAccount.deposit(1_200);

	System.out.println(wandeAccount.checkBalance());
		wandeAccount.withdraw(1_100);


	System.out.println(wandeAccount.checkBalance());

	}
}