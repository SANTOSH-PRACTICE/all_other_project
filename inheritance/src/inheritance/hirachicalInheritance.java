package inheritance;

class Employee
{
	String empName,emp_Id,emp_ContactNo;
	float basicSalary,hra,da;
	
	Employee(String empName,String emp_Id,String emp_ContactNo,float basicSalary,float hra,float da)
	{ 
		this.empName=empName;
	    this.emp_Id=emp_Id;
	    this.emp_ContactNo=emp_ContactNo;
	    this.basicSalary=basicSalary;
	    this.hra=hra;
	    this.da=da;
	}
	float calculateSalary()
	
	{
		
		float grossSalary= (basicSalary+hra+da);
		return grossSalary;
		
	}
	
}
class Manager extends Employee
{
     String department,designation;
	Manager(String empName, String emp_Id, String emp_ContactNo, float basicSalary, float hra, float da) {
		super(empName, emp_Id, emp_ContactNo, basicSalary, hra, da);
		 
		this.department=department;
		this.designation=designation;
	}
	String imformation()
	{
		return ("department"+"IT");
	}
	
	
}
class Worker extends Employee
{
     String workStation;
	Worker(String empName, String emp_Id, String emp_ContactNo, float basicSalary, float hra, float da) {
		super(empName, emp_Id, emp_ContactNo, basicSalary, hra, da);
		// TODO Auto-generated constructor stub
	}
	String impormation1() {
		return ("workStation: "+"software devlopment");
	}
	
}

public class hirachicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("employee imp: ");
		Employee e=new Employee("santosh","233" ,"976613182",  344440, 4440,766 );
		System.out.println("grossSalary: "+e.calculateSalary());
		
		System.out.println("worker imp: ");

		Worker w=new Worker("priya", "45555555", "778888", 898890, 8980, 5655);
		System.out.println("grossSalary: "+w.calculateSalary());
		System.out.println("impormation:"+w.impormation1());
		
		System.out.println("manager imp: ");

		Manager m=new Manager("ram", "676667", "7867877877", 87987867, 8980, 6870);
		System.out.println("grossSalary: "+m.calculateSalary());
		System.out.println("impo: "+m.imformation());
		

	}

}
