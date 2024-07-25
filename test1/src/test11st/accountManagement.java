package test11st;

import java.util.Scanner;

public class accountManagement {
String name,accountNo,coustmer_id,contact_no;
float totalBalance,depositeAmount,withdrowAmount;

Scanner sc =new Scanner(System.in);
void input()
{
	System.out.println("Enter coustmer Details: ");
	System.out.println("Enter name:");
	name=sc.next();
	System.out.println("Enter account no:");
	accountNo=sc.next();
	
	System.out.println("Enter custmer id:");
	coustmer_id=sc.next();
	
	System.out.println("Enter contact no:");
	contact_no=sc.next();
	

int choice;
do
{
	
	System.out.println("select option:");
	System.out.println("1.total balance 2. deposite amount 3.withdraw amount 4.personal details 5.exit");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1: totalBalance();
	        break;
	case 2:  depositeAmount();
	        break;
	case 3: withdrawAmount();
	        break;
	case 4:display()  ;
	        break;
	case 5: System.out.println("*** Exiting***");
	  default:System.out.println("enter valid option");
	       break;
	}
}
	while(choice != 5);
}
    void  display()
	    {
		  System.out.println("name:"+name +" account no:"+accountNo +"custmer id:"+coustmer_id+"contact no:"+contact_no );
	    }
	void totalBalance()
	{
		System.out.println("total balancer"+totalBalance);
	}
	
	void depositeAmount()
	{
		System.out.println("enter deposite amount:");
		depositeAmount=sc.nextFloat();
		totalBalance=totalBalance+depositeAmount;
		System.out.println("total balance:"+totalBalance);
		
	}
    void withdrawAmount()
    {
    	System.out.println("enter withdrow amount:");
    withdrowAmount=sc.nextFloat();
	totalBalance=totalBalance-withdrowAmount;
	System.out.println("total balance:"+totalBalance);
       }



public static void main(String[] args) {

	accountManagement a1=new accountManagement();
	a1.input();
	//a1.display();
//	a1.depositeAmount();
//	a1.totalBalance();
	//a1.withdrawAmount();
}
}
