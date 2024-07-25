package practis;

import java.util.Scanner;

public class Employee {
	
String name;
int  id;
float grossSalary;
int noOfYear,calculateBonus;

Scanner sc =new Scanner(System.in);
void inputData()
{
	System.out.println("Enter details of employee:");
	System.out.println("Enter name of employee:");
	name=sc.next();
	
	System.out.println("Enter id:");
	id=sc.nextInt();
	
	System.out.println("basic  salary:");
	float basicSalary=sc.nextFloat();
	
	System.out.println("hra:");
	float hra=sc.nextFloat();
	
	System.out.println("da:");
	float da=sc.nextFloat();
	System.out.println("Enter year of served: ");
	 noOfYear=sc.nextInt();
	
	 grossSalary=calculateSalary(basicSalary,hra,da);
	//display();
	
}

float calculateSalary(float basicSalary,float hra,float da)
{
	int bonus=calculateBonus;
	grossSalary=basicSalary+hra+da+bonus;
	return grossSalary;
}
int calculateBonus()
{
	int bonus ;
	if(noOfYear<=2)
	{
	bonus=2000;
	}
	else if(noOfYear>2 && noOfYear<=4)
	{
		bonus=4000;
	}
	else if(noOfYear>4&& noOfYear<=6)
	{
		bonus=5000;
	}
	else if(noOfYear>6 && noOfYear<=8)
	{
		bonus=6000;
	}
	else
	{
		bonus=7000;
	}
	return bonus;
}
	void display()
	{
		System.out.println("name: "+ name+"ID: " +id +  "grossSalary: "+grossSalary);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.inputData();
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.inputData();
		emp2.display();
	}

}
