package Day14oops112;

import java.util.Scanner;

public class studentData {
	
	String name;
	int rollNo;
	String cantactNo;
	float totalMarks;
	Scanner sc =new Scanner(System.in);
	
	 void input()
	{
		System.out.println("Enter student Details:");
		System.out.println("Enter name:");
		name=sc.next();
		
		System.out.println("Enter contact number:");
		cantactNo=sc.next();
		
		System.out.println("Enter roll number:");
		rollNo=sc.nextInt();
		
		System.out.println("Enter total marks:");
		totalMarks=sc.nextInt();

		display(name,rollNo,cantactNo,totalMarks);
		
		
	}
	void display(String name,int rollNo,String cantactNo,float totalMarks)
	{
		System.out.println("name: " +name+ " RollNo: " +rollNo+ "cantactNo: "+ cantactNo +"total marks: "+ totalMarks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentData st1=new studentData();
		st1.input();

	}

}
