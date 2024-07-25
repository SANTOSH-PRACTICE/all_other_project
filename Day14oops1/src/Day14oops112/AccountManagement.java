package Day14oops112;

import java.util.Scanner;

public class AccountManagement {
	
	String name,accountNumber,customer_id,contact_no;
	float totalBalance,depositeAmount,withdrawAmount;
	Scanner sc=new Scanner(System.in);
	int choice;
	void input()
	{
		System.out.println("Enter Custmer Details:");
		
		System.out.println("Name :");
		name=sc.next();
		
		System.out.println("customer_id :");
		customer_id=sc.next();
		
		System.out.println("accountNumber :");
		accountNumber=sc.next();
		
		System.out.println("contact_no :");
		contact_no=sc.next();
		
		do
		{
			System.out.println("Enter your choice:");
	
			System.out.println("1.Deposite  2. Withdrow  3. check your balance 4.personal details 5.exit");
	       choice=sc.nextInt();
	       switch(choice)
	       {
	       
	       case 1: depositeAmount();
	              break;
	       case 2:withdrawAmount();
           break;
           
	       case 3:balance();
                break;

           
	     case 4:display();
                  break;

	     case 5:System.out.println("Exiting.....thanks");
	     break;
	     
      	default: System.out.println("plese enter valid option");
		}
	
		}
	
	while(choice !=5);
	
	
	}
	void display()
	{
		System.out.println("Customer Details are: ");
		System.out.println(name+" "+customer_id+" "+accountNumber+" "+contact_no+" ");
	
	}
	void depositeAmount()
	{
		System.out.println("Enter amount to be deposite:");
		depositeAmount=sc.nextFloat();
		
		totalBalance=totalBalance+depositeAmount;
		System.out.println("total balance deposite:"+depositeAmount);
		
	}
	void withdrawAmount()
	{
		System.out.println("Enter amount to be withdraw:");
		withdrawAmount=sc.nextFloat();
		
		totalBalance=totalBalance- withdrawAmount;
		System.out.println("total balance deposite:"+withdrawAmount);
		
	}
	void balance()
	{
	System.out.println("Total Balance is: "+totalBalance);	
	}
	
	public static void main(String[] args)
	{
		AccountManagement am =new AccountManagement();
		am.input();
	}

}
