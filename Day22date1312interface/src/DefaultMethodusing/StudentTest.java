package DefaultMethodusing;

import java.util.Scanner;

//next class is getteerTest
public class StudentTest {
	String name;
	int rollNo;
	float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
		
	}
	public static void main(String[] args) {
		StudentTest s=new StudentTest();
				
		/*
		s.setMarks(12);
		s.setName("Rahul");
		s.setRollNo(001);
		*/
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name:");
		s.setName(sc.next());
		System.out.println("Enter Roll No:");
		s.setRollNo(sc.nextInt());
		
		System.out.println("Enter marks:");
		s.setMarks(sc.nextInt());
	
		
		
		System.out.println(s.getName());
		System.out.println(s.getMarks());
		System.out.println(s.getRollNo());

		
	}
	

}
