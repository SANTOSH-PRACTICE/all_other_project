package practics;

import java.util.Scanner;

public class EmployeeData {
	String name;
	int id;
	float grossSalary;
	float noOfYears;
	float basicSalary;
	
	
	void inputData()
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Employee Data:");
		System.out.println("Enter name of Employee: ");
		name=sc.next();
		System.out.println("Enter id:");
		id =sc.nextInt();
		
		System.out.println("Enter no of year served:");
		 noOfYears=sc.nextFloat();
		System.out.println("Enter basic salary:");
		basicSalary=sc.nextFloat();
		
		
		System.out.println("Enter hra:");
		float hra=sc.nextFloat();
		System.out.println("Enter da:");
		float da=sc.nextFloat();
		calculateSalary(hra,da,basicSalary,noOfYears);           //(hra,da,basicSalary,noOfYears);
	}
	void calculateSalary(float hra,float da,float basicSalary,float noOfYears)
	{
		float bonus;
		if(noOfYears<=5)
		{
			bonus=(basicSalary*0.15f);
		}
		else
		{
			bonus= (basicSalary*0.35f);

		}
		grossSalary=basicSalary+hra+da+bonus;
		displayData();
	}
	void displayData()
	{
		System.out.println("Name of Employee:");
		System.out.println("Years of service of "+name+" :" +noOfYears);
		System.out.println("Gross salary of "+name+":"+grossSalary);

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData emp1=new EmployeeData();
		emp1.inputData();
		emp1.displayData();
		
		EmployeeData emp2=new EmployeeData();
		emp2.inputData();
		emp2.displayData();
	}

}
