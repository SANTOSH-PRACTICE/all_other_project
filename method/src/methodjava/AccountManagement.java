package methodjava;

import java.util.Scanner;

public class AccountManagement {
	String name,accountNo,custmer_id,contact_no;
	float withdrawAmount,depositeAmount,totalBalance;
	Scanner sc=new Scanner(System.in);

	void input()
	{
		System.out.println("Enter custmer Details:");
		System.out.println("Enter custmer name:");
		name=sc.next();
		
		System.out.println("Enter custmer account No:");
		accountNo=sc.next();
		
		System.out.println("Enter custmer id:");
		custmer_id=sc.next();
		
		System.out.println("Enter custmer contact no:");
		contact_no=sc.next();
		
		int choice;
		
		do {
			System.out.println("Enter your choice:");
			System.out.println("1. withdraw Amount 2.deposite Amount 3.totalBalance 4.personal detail 5.exit");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:withdrawAmount();
			       break;
			case 2:depositeAmount();
			        break;
			case 3: totalBalance() ;
			        break;
			case 4:display();
			        break;
			case 5:System.out.println("****Exiting****");
			        break;
		    default:System.out.println("enter valid option");
		             break;
		             
			}
			
		}
		while(choice!=0);
		
		
	}
	
	void display()
	{
		System.out.println("Name="+name+"account No ="+accountNo+"custmer_id "+custmer_id+"contact_no "+contact_no);
	}
	void withdrawAmount()
	{
		System.out.println("Etnter withdrow amount:");
		withdrawAmount=sc.nextFloat();
		totalBalance=totalBalance-withdrawAmount;
		System.out.println("total amount="+totalBalance);
	}
	void depositeAmount()
	{
		System.out.println("Etnter depositeAmount :");
		depositeAmount=sc.nextFloat();
		totalBalance=totalBalance+depositeAmount;
		System.out.println("total amount="+totalBalance);
	}
	
	void totalBalance()
	{
		System.out.println("total amount="+totalBalance);

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountManagement a= new AccountManagement();
a.input();
	}

}
