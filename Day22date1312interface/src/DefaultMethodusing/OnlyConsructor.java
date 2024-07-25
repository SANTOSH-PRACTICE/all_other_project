package DefaultMethodusing;
class College
{
	String name;
	public College(String name) {
		this.name=name;
		
	}
}
class Student1{
	String stuName;
	int rollNo;
	College college;
	
	public Student1(String stuName,int rollNo,College college)
	{
		this.stuName=stuName;
		this.rollNo=rollNo;
		this.college=college;
		
	}
	void display()
	{
		System.out.println(stuName+" "+rollNo+" "+college.name);
	}
}

public class OnlyConsructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1("Priya",87,new College("abe college"));
		s.display();
		

	}

}
