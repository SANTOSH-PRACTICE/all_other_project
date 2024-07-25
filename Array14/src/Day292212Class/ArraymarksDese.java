package Day292212Class;

import java.util.Iterator;
import java.util.Scanner;

class Student1
{
	int rollNo;
	String name;
	float marks;
	
	Student1(int rollNo,String name,float marks)
	{
	this.name=name;
	this.rollNo=rollNo;
	this.marks=marks;
		
	}
	void display()
	{
		System.out.println(name+" "+rollNo+" "+marks);
	}
}

public class ArraymarksDese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter Size of array: ");
         int size=sc.nextInt();
		Student1 stud[]=new Student1[size];
		
		for (int i = 0; i < size; i++)
		{
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter Roll NO:");
		int rollNo=sc.nextInt();
		System.out.println("Enter marks: ");
		float marks=sc.nextFloat();
		stud[i]=new Student1(rollNo,name,marks);
			
		}
		for (int i = 0; i < stud.length; i++) 
		{
			stud[i].display();
		}
		System.out.println("***********************");
		for (int i = 0; i < stud.length; i++) {
		for (int j = i+1; j < stud.length; j++) {
			if(stud[i].marks<stud[j].marks)
			{
				Student1 temp=stud[i];
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
