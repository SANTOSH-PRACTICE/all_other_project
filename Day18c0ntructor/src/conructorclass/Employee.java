package conructorclass;

public class Employee {
	
	float basic,hra ,da,grossSalary;
	String name,dept;
	int id ,accountNumber;
	
	public Employee()
	{
		name=null;
		dept=null;
		id=0;
		accountNumber=8776;
		
	}
	
	public Employee(String name, String dept,int id,int accountNumber,float basic,float hra ,float da)
	
	{
		this();
		this.name=name;
		this.dept=dept;
		this.id=id;
		this.accountNumber=accountNumber;
		this.basic=basic;
		this.hra=hra;
		this.da=da;
		
	}
	float calculateSalary()
	{
		grossSalary=basic+hra+da;
		return grossSalary;
		
	}
	
	void displayData()
	{
		calculateSalary();
		System.out.println(name+" "+dept+" "+id+" "+accountNumber+" "+grossSalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e2=new Employee("Raghav","E&T",123,12333,233377,122,1233);
				e2.displayData();

	}

}
