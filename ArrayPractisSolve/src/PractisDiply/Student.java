package PractisDiply;

import java.util.Scanner;

public class Student 
{

	int rollNo;
	String name;
	float marks;
	 Student(String name,int rollNo,float marks)
	 {
		 this.name=name;

		 this.rollNo=rollNo;
		 this.marks=marks;
	 }
	 void display()
	 {
		System.out.println("name: "+name+" rollNo: "+rollNo+"marks: "+marks);
	 }
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int size=sc.nextInt();
		Student stud[]=new Student[size] ;
		for (int i = 0; i < size; i++) 
		{
			System.out.println("Enter name: ");
			String name=sc.next();
			
			System.out.println("Enter rollno: ");
			int rollNo=sc.nextInt();
			
			System.out.println("Enter marks: ");
			float marks=sc.nextFloat();
			
			stud[i]=new Student(name,rollNo,marks);
			
		}
		for (int i = 0; i < stud.length; i++) {
			stud[i].display();
		}
		
		for (int i = 0; i < stud.length; i++)
		{
			for (int j = i+1; j < stud.length; j++) 
			{
				if(stud[i].marks<stud[j].marks)
				{
					Student temp=stud[i];
					stud[i]=stud[j];
					stud[j]=temp;
				}
			}
		}
		for (int i = 0; i < stud.length; i++) 
		{
			stud[i].display();
		}
	
	}

}
