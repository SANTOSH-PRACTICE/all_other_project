package constuctorclass;

public class Employee1 {
	String name;
	int id;
	Employee1(String x,int y)
	{
		name =x;
		id=y;
	}
void display()
{
	System.out.println(name+" "+id);
}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Employee1 emp=	new  Employee1("priya",1022);
			emp.display();

		}


	
	}


