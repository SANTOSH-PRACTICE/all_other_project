package conructorclass;

public class Student {
	String name;
	int id,gross,basic,hra,da;
	Student(String name,int basic,int hra, int da,int id)
	{

	this.name=name;
	this.id=id;
	this.basic=basic;
	this.hra=hra;
	this.da=da;
	
	}
	
	int calculateSalary()
	{
	return(gross=basic+hra+da);
	}
	
	void display()
	{
		this.calculateSalary();
		System.out.println("Name: "+name + " ID: "+id + " salary: "+gross);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Student("priya",101,20000,2000,27636).display();
	}

}
