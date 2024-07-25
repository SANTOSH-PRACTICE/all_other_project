package inheritance;
class Employee
{
	long  empId,empPhoneNo;
	String empName,empAddress;
	double basicSalary,specialAllowance=250.80,hra=1000.5;
	public Employee(long Id,long PhoneNo,String Name,String Address,double BasicSalary)
	{
		empId=Id;
		empName=Name;
		empAddress=Address;
		empPhoneNo=PhoneNo;
		basicSalary=BasicSalary;
		
	}
	void calculateSalary()
	{
		double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary/100);
	System.out.println("Salary:"+salary);
	}
	void calculateTransportAllowance()
	{
		double TransportAllowance=(0.1*basicSalary);
		System.out.println("Employee Tranceport Allowance:"+TransportAllowance);
	}
}
class Manager extends Employee
{
public Manager(long Id,long PhoneNo,String Name,String Address,double BasicSalary) {
super(Id,PhoneNo,Name,Address, BasicSalary);}
void calculateTransportAllowance()
{
	double TransportAllowance=(0.15*basicSalary);
	System.out.println("manager Tranceport Allowance:"+TransportAllowance);
}
}
class Trainee1 extends Employee
{
	public Trainee1(long Id,long PhoneNo,String Name,String Address,double BasicSalary) {
		super(Id,PhoneNo,Name,Address, BasicSalary);
		}
}
public class TraineeActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For Employee data: ");
		Employee e=new Employee(11,23,"Priya" ,"pune",44000);
		e.calculateSalary();
		e.calculateTransportAllowance();
		
		System.out.println("For Manager data: ");
		Manager e1=new Manager(11,23,"Priya" ,"pune",34000);
		e1.calculateSalary();
		e1.calculateTransportAllowance();
		
		System.out.println("For Trainee1 data: ");
		Trainee1 e2=new Trainee1(11,23,"Priya" ,"pune",50400);
		e2.calculateSalary();
		e2.calculateTransportAllowance();
		
		
		
		
		

	}

}
