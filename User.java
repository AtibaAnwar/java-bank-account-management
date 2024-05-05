import java.util.Scanner;

abstract class Account{
	 long accountNumber;
	 String accountName;
	 double amount =0;

	Scanner sc =new Scanner (System.in);
	public void deposit(){
		System.out.println("Enter the amount to be added");
		double depositedAmount = sc.nextDouble();
		amount	+= depositedAmount;
		System.out.println("!!Successfull deposited!!");
	}

	public void withDraw(){
		System.out.println("Enter the amount to be withdraw");
		double withDrawAmount = sc.nextDouble();
		if(withDrawAmount > amount){
			System.out.println("!!Insufficient Balance!!");
		}
		else{
			amount -= withDrawAmount;
			System.out.println("!!Successfull withdraw!!");
		}
	}
	public void displayDetails(){
		System.out.println("AccountHolder Name :"+accountName);
		System.out.println("Account Number  :"+accountNumber);
		System.out.println("Balance :"+amount);
	}

	public void displayBalance()
	{
		System.out.println("Balance is "+amount);
	}
}
final class SB_Account extends Account{
	double min_bal = 2000;
	
	public void deposit(){
		super.deposit();
		
	}
	public void withDraw(){
		super.withDraw();
	}
	@Override
	public void displayBalance()
	{
		System.out.println("Enter the no.of months your account has been created");
		int months = sc.nextInt();
		amount = amount + ( months * 0.04);
		System.out.println("Balance is "+amount);
	}
}

final class Current_Account extends Account{
	double min_bal = 5000;

	public void deposit(){
		super.deposit();
	}
	public void withDraw(){
		super.withDraw();
	}
}
public class User{
	public static void main(String args[]) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the account Type");
		String accountType = sc.next();
		
		Account accnt;
		if(accountType.equals("SB_Account")){
			accnt = new SB_Account();
		}
		else{
			 accnt = new Current_Account();
		}
		
		System.out.println("Enter account number...");
		accnt.accountNumber = sc.nextLong();
		
		
		System.out.println("Enter Name...");
		accnt.accountName = sc.next ();
		
		 SB_Account saccnt = new SB_Account();
		
		accnt.displayDetails();
		accnt.deposit();
		accnt.withDraw();
		accnt.displayBalance();

	}
}
		
		
	
		
		
		