package constuctorclass;

public class Employee3 {

		String name;
		int id;
		Employee3(String name,int id)
		
		{
			this.name =name;
			this.id=id;
		}
		
	void display()
	   {
		System.out.println(name+" "+id);
	    }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
			Employee3 emp=	new  Employee3("priya",1022);
				emp.display();

			}


	}


