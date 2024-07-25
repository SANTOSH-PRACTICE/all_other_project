package Day14oops112;

import java.util.Scanner;

public class AccountManager1 {
	
	String name,accountNumber,custmer_Id,contact_no;
	float totalBalance,depositeAmount,wihdrowAmount;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Entetr name:");
		name=sc.next();
		
		System.out.println("Entetr account number:");
		accountNumber=sc.next();
		
		System.out.println("Entetr custmer id:");
		custmer_Id=sc.next();
		
		System.out.println("Entetr contact number:");
		contact_no=sc.next();
	}
	
	void display()
	{
		System.out.println("custmer details are: ");
		System.out.println("name: "+name+" Account Number:"+accountNumber +"custmer_Id:"+custmer_Id +"contact number: "+contact_no);

		
	}
	

	void depositeAmount()
	{
		System.out.println("Enter deposite amount");
		depositeAmount=sc.nextFloat();
		totalBalance=totalBalance+depositeAmount;
		System.out.println("total amount: "+totalBalance);
	}
	
	void wihdrowAmount()
	{
		System.out.println("Enter withdrow amount");
		wihdrowAmount=sc.nextFloat();
		totalBalance=totalBalance-wihdrowAmount;
		System.out.println("total amount: "+totalBalance);
	}
	
	void totalBalance()
	{
		
		System.out.println("total amount: "+totalBalance);

	}
	
	public static void main(String[] args)
	{
		AccountManager1 a1=new AccountManager1();
		a1.input();
		a1.display();
		a1.depositeAmount();
		a1.wihdrowAmount();
		a1.totalBalance();
	}

}
