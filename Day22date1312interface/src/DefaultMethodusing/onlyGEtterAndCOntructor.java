package DefaultMethodusing;

class Collage
{
	String name;
 Collage(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}

class Student {
	String stName;
	int rollNo;
	public Student(String stName,int rollNo  )
	{
		this.stName=stName;
		this.rollNo=rollNo;
	}
	public String getStName() {
		return stName;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
}
public class onlyGEtterAndCOntructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Collage c=new Collage("xyz");
		Student s=new Student("rahul",65);
		System.out.println(s.getStName()+" having roll no: "+s.getRollNo()+" is of "+c.name+" college ");
		
	}

}
