package constuctorclass;

public class Employee4 {  //(  imp note:constructor overloading)
	String name;
	int id;
	
	public Employee4( )
	{
		id=1011;
		name=" rahul";
				System.out.println(name+" "+id);
	}
	public Employee4(int id)
	{
		this.id=id;
	name=" priya";
	System.out.println(name+" "+id);
		
	}
	public Employee4(int  id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(name+" "+id);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee4();
		new Employee4(3344);

		new Employee4(244,"akash");
	}

}
