package classr;
class Worker
{
	String sname;
	int sAge;
	String sPhoneNumber,sAddress;
	float sSalary;
	
	void displaySalary()
	{
		System.out.println("Salary: "+sSalary);
	}
	void dispayData()
	{
		System.out.println(sname+" "+sAddress+" "+sAge+" "+sPhoneNumber);
	}
}

class Employee extends Worker
{
	String workSpace;
	String display()
	{
		return "Devlper";
	}
}
class Manager extends Worker
{String deppt;
String displayDeppt()
{
	return "IT";
	
}
}

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.sname="priya";
         e1.sAddress="pune";
         e1.sAge=34;
         e1.sPhoneNumber="8987767656";
         e1.sSalary=500000;
         
         e1.dispayData();
         System.out.println(e1.display());
         e1.displaySalary();
         
         Manager m1=new Manager();
         m1.sname="rahul";
         m1.sAddress="mumbai";
         m1.sAge=24;
         m1.sPhoneNumber="9788776776";
         m1.sSalary=5455445;
         
         System.out.println();
         m1.dispayData();
         System.out.println(m1.displayDeppt());
         m1.displaySalary();
         
         
	}

}
