package practis;

public class Student implements Comparable<Student>{

	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public int compareTo(Student s)
	{
		if(marks<s.marks)
		   return 1;
		else if(marks==s.marks)
		{
			if(name.charAt(3)<s.name.charAt(3))
			return 1;
			else if(name.charAt(3)==s.name.charAt(3))
				return 0;
			else 
				return -1;
		}
		else
		return -1;
		
	}
	
	
	public String toString()
	{
		
		return "Student[rollNo="+rollNo +" ,name="+  name+",marks ="+marks+"]";
		
	}
	

}
