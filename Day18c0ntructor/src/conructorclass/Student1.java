package conructorclass;

public class Student1 {
	String name,deppt;
	int id,gross,basic,hra,da;
	Student1(String name,int basic,int hra, int da,int id)
	{

	this.name=name;
	this.id=id;
	this.basic=basic;
	this.hra=hra;
	this.da=da;
	
	}
	Student1(String name,int basic,int hra, int da,int id,String deppt)
	{
       this(name,id,basic,hra,da);
       this.deppt=deppt;
       
	}
	int calculateSalary()
	{
	return(gross=basic+hra+da);
	}
	
	void display()
	{
		this.calculateSalary();
		System.out.println("Name: "+name + " ID: "+id + " salary: "+gross+" deppt:"+ deppt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Student1("priya",101,20000,2000,27636,"IT").display();
	}

}
