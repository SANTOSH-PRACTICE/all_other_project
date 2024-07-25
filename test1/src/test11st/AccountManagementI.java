package test11st;

import java.util.Scanner;

public class AccountManagementI {
	
	String name,accountNo,custmer_id,contact_no;
	float withdrawAmount,depositeAmount,totalBalance;
	
	
	Scanner sc=new Scanner(System.in);

	
	void input()
	{ 
		System.out.println("Enter details:");
		System.out.println("Enter Name:");
		name=sc.next();
		
		System.out.println("Enter accountNo:");
		accountNo=sc.next();
		
		System.out.println("Enter custmer_id:");
		custmer_id=sc.next();
		
		System.out.println("Enter contact_no:");
		contact_no=sc.next();
		int choice;
		do {
			 System.out.println("enter following option:");
			 System.out.println("1.withdrawAmount 2.depositeAmount 3.totalBalance 4.personal details 5.exit");
			  choice=sc.nextInt();
		 
		 switch(choice)
		 {
		 case 1:withdrawAmount();
		         break;
		 case 2:    depositeAmount() ;
		          break;
		 case 3: totalBalance();
		         break;
		 case 4:display();
		         break;
		 case 5: System.out.println("***Exiting***");
		       break;
		 default:System.out.println("enter valid option");
		 break;
		          
		 }
		 
		}
	
	while(choice<=5);
		}
	    void display()
	    {
	    	System.out.println("name:"+name+"account no:"+accountNo+"contact no"+contact_no+" custmer id"+custmer_id);
	    }
	
	   void withdrawAmount()
	   {
		   System.out.println("enter withdraw amount:");
		   withdrawAmount=sc.nextFloat();
		   totalBalance=totalBalance-withdrawAmount;
		   System.out.println("total amount:"+totalBalance);
	   }
		   
	   
	   void  depositeAmount() 
	   { System.out.println("enter deposite amount:");
	   depositeAmount=sc.nextFloat();
	   totalBalance=totalBalance+depositeAmount;
	   System.out.println("total amount:"+totalBalance);
		   
	   }
	   void totalBalance()
	   {
		   System.out.println("total amount:"+totalBalance);
 
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountManagementI a=new AccountManagementI();
		a.input();
		

	}
}

