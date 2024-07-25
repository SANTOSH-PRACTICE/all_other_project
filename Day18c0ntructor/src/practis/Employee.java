package practis;

public class Employee {
	float basic,hra,da,grossSalary;
	String name,deptt;
	int accountNo,id;
	
	public Employee()
	{
		name=null;
		deptt=null;
		id=0;
		accountNo=4555445;
		
		
	}
	
	public Employee(String name,String deptt,int accountNo,int id,float basic,float hra ,float da) 
	{
		this();
		this.name=name;
		this.accountNo=accountNo;
		this.deptt=deptt;
		this.id=id;
		this.basic=basic;
		this.hra=hra;
		this.da=da;
		
	}
	float calculateSalary()
	{
		grossSalary=basic+hra+da;
	return grossSalary;
	}
	void display()
	{
		System.out.println("name:"+name+ "id:"+id+" accountNo"+accountNo+" gross salary"+grossSalary);
	}


   public static void main(String[] args)
   {
	   Employee e1=   new Employee("santosh"," IT",5554,45443,45444,333,5655);
	   e1.display();
	   
   }}