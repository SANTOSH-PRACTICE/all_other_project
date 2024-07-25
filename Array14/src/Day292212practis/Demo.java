package Day292212practis;

import java.util.Scanner;


class Student
{
	int rollNo;
	String name;
	float marks;
	
	Student(int rollNo,String name,float marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		
	}
	void display()
	{
		System.out.println(name+" "+rollNo+" "+marks);
	}
}

public class Demo {

	public static void main(String[] args) {
    /*  Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size: ");
      int size=sc.nextInt();
      Student stud[]=new Student[size];
      
      for (int i = 0; i < stud.length; i++) {
		
	
      System.out.println("Enter Name: ");
      String name=sc.next();
      System.out.println("Enter Roll No: ");
      int rollNo=sc.nextInt();
      System.out.println("Enter Marks: ");
      float marks=sc.nextFloat();
      stud[i]=new Student(rollNo,name,marks);
      
	}*/
		Student s1=new Student(1,"Akash",78.8f);
		Student s2=new Student(2,"Rahul",77.9f);
		Student s3=new Student(3,"Ram",99.5f);		
		Student stud[]= {s1,s2,s3};
		
      for (int i = 0; i < stud.length; i++) 
      {
		stud[i].display();
		
	}
      System.out.println("*******************");
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
			
		}}
		for (int i = 0; i < stud.length; i++) {
			stud[i].display();
		
	}

}
}