package day122911;

import java.util.Scanner;

public class Employee1 {
	
	
	
	String name;
	int id;
	float grossSalary;
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
		
		
		calculateSalary(basicSalary,hra,da);
		
		
	}
	void calculateSalary(float basicSalary, float hra,float da)
	{
		grossSalary=basicSalary+hra+da;
	}
	
	void display()
	{
		System.out.println("Name: "+name+ " ID: " +id+" grossSalary:"+ grossSalary);
	}
	

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.inputData();
		emp1.display();

		Employee emp2=new Employee();
		emp2.inputData();
		emp2.display();


	

	}

}
