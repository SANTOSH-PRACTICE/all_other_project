package day133011;

import java.util.Scanner;

public class EmployeeData {
	
	String  name;
	int  noOfYears;
	float basicSalary,bonus,grossSalary;
	
	void inputData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee Details: ");
		
		System.out.println("Enter Name :");
				name=sc.next();
		System.out.println("Enter no of year of service:");
		noOfYears =sc.nextInt();
		System.out.println("Enter basic salary: ");
		basicSalary=sc.nextFloat();
		calculateGrossSal();
	}
	void calculateGrossSal()
	{
		if(noOfYears<=5)
		{
			bonus=(basicSalary*0.15f);
		}
		else
		{
			bonus=(basicSalary*0.35f);
		}
		
		grossSalary=basicSalary+bonus;
		displayData();
	}
	
	void  displayData()
	{
		System.out.println("Name of Employee:");
		System.out.println("Years of service of "+name+" :" +noOfYears);
		System.out.println("Gross salary of "+name+":"+grossSalary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData emp1=new EmployeeData();
		emp1.inputData(); 
	}

}
