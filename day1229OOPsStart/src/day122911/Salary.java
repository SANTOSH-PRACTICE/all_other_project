package day122911;

import java.util.Scanner;

public class Salary {
	
	
	String name;
	int id;
	float grossSalary;
	int noOfyears;
	Scanner sc =new Scanner(System.in);

	void inputData()
	{
		System.out.println("Enter details of an Employee:");
		System.out.println("Enter Name:");
		name =sc.next();
		
		System.out.println("Enter id:");
		id =sc.nextInt();
		
		System.out.println("Enter basicSalary:");
		float basicSalary =sc.nextFloat();
		
		System.out.println("Enter hra:");
		float hra =sc.nextFloat();
		
		System.out.println("Enter da:");
		float da =sc.nextFloat();
		 System.out.println("Enter no of years served:");
		
		 noOfyears=sc.nextInt();
		 grossSalary=calculateSalary(basicSalary,hra,da);	
				 }
	float calculateSalary(float basicSalary,float hra,float da)

	{
		int bonus=calculateBonus();
		grossSalary=basicSalary+hra+da+bonus;
		return grossSalary;
	}
	
	int calculateBonus()
	{
		int bonus;
		if(noOfyears<=2)
		{
			bonus=2000;
		}
		else 	if(noOfyears>2&& noOfyears<=4)
		{
			bonus=4000;
		}
		else 	if(noOfyears>4&& noOfyears<=6)
		{
			bonus=5000;
		}
		else 	if(noOfyears>6&& noOfyears<=8)
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
		System.out.println("Name: "+name+ " ID: " +id+" grossSalary:"+ grossSalary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary emp1=new Salary();
		emp1.inputData();
		emp1.display();

		Salary emp2=new Salary();
		emp2.inputData();
		emp2.display();


	 

	}

}
