package day122911;

import java.util.Scanner;

public class Employee3 {
	//dada member
	String name;
	int id;
	float salary;
	Scanner sc =new Scanner(System.in);
	
	// member fuctions
	void inputData()
	{
		System.out.println("Enter details of an Employee:");
		System.out.println("Enter Name:");
		name =sc.next();
		
		System.out.println("Enter id:");
		id =sc.nextInt();
		
		System.out.println("Enter salary:");
		salary =sc.nextFloat();
		
	}
	
	void display()
	{
		System.out.println("Details are: ");
		System.out.println("Name: "+name+ " ID: " +id+" salary:"+ salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee3 emp1=new Employee3();
		emp1.inputData();
		
		Employee3 emp2=new Employee3();
		emp2.inputData();
		emp1.display();
		emp2.display();

	}

}
