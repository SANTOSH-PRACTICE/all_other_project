package Day292212Class;
 class Student
{
	int rollNo;
	String name;
	Student(int rollNo,	String name)
	{this.name=name;
	this.rollNo=rollNo;
		
	}
	void display()
	{
		System.out.println("Roll No:"+rollNo);
		System.out.println("Name: "+name);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Akash");
		Student s2=new Student(2,"Rahul");
		Student s3=new Student(3,"Ram");
		Student s4=new Student(9,"Priya");
		Student s5=new Student(10,"Sham");
		
		Student stud[]= {s1,s2,s3,s4,s5};
		/*
		for (int i = 0; i < stud.length; i++) {
			stud[i].display();
		}
		*/
		 for(Student a:stud)
		 {
			 a.display();
		 }
		 

	}

}
