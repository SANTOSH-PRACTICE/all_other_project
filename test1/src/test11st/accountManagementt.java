package test11st;

import java.util.Scanner;

public class accountManagementt {
	String name,accountNo,cantactNo,custmerId;
	float withraowAmount,depositeAmount,totalAmount;
	Scanner sc=new Scanner(System.in);

	void input()
	{
		System.out.println("Enter Details:");
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter account No:");
		accountNo=sc.next();
		System.out.println("Enter cantact No:");
		cantactNo=sc.next();
		System.out.println("Enter custmer Id:");
		custmerId=sc.next();
		int choice;

		do {
			
			System.out.println("select valid option:");
			System.out.println("1.withdrow amlount 2.deposite amount 3.account balance 4.personsl detais 5.exite");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:withraowAmount();
		       break;
		       
		case 2 :depositeAmount();     
		          break;
		case 3:totalAmount();
		break;
		
		case 4:display();
		break;
		case 5:System.out.println("**Exiting**");
		        break;
		 default:System.out.println("enter valid option:");
	       break;
		}

		}
		while(choice!=5);

	}
		void withraowAmount()
		{
			System.out.println("Enter withdraow amount:");
			withraowAmount=sc.nextFloat();
			totalAmount=totalAmount-withraowAmount;
			System.out.println("totalAmount:"+totalAmount);

			
		}
		
		void depositeAmount()
		{
			System.out.println("Enter deposite Amount :");
			depositeAmount=sc.nextFloat();
			totalAmount=totalAmount-depositeAmount;
			System.out.println("totalAmount:"+totalAmount);

		}
		void totalAmount()
		{
			System.out.println("totalAmount:"+totalAmount);

		}
		void display()
		{
			System.out.println("name="+name+ "account no:"+accountNo+"cantact No:"+cantactNo+"custmer Id"+custmerId);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accountManagementt a =new accountManagementt();
		    a.input();

	}

}
