package comparables;

public class Student1 implements Comparable<Student1> {

	int rollNo;
	String name;
	int marks;
	public Student1(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public String ToString()
	{
		return "Student1[rollNo="+rollNo+",name="+name+",marks"+marks+"]";
		
	}
	@Override
	public int compareTo(Student1 s) {
		if(marks<s.marks)
			return 1;
		else if(marks==s.marks)
		{
			if(name.charAt(2)<name.charAt(2))
				return 1;
			else if(name.charAt(2)==name.charAt(2))
				return 0;
			else
				return -1;
		}
		else
			return -1;
	}

}
