package practiceday6;

import java.util.Scanner;

public class Percentageifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int marathi,maths,hindi,english,ssc;
		
		System.out.println("Enter the obtain mark in marathi:");
		marathi=sc.nextInt();
		
		System.out.println("Enter the obtain mark in maths:");
		maths=sc.nextInt();

		
		System.out.println("Enter the obtain mark in hindi:");
		hindi=sc.nextInt();

		
		System.out.println("Enter the obtain mark in english:");
		english=sc.nextInt();

		
		System.out.println("Enter the obtain mark in social science:");
		ssc =sc.nextInt();
		int totalMarks = 500;
		System.out.println("total marks"+ totalMarks);
		
		int totalobtMarks=(marathi+hindi+ssc+english+maths);
		System.out.println("total obtain marks"+ totalobtMarks);
		
		int percentage=((totalobtMarks*100)/totalMarks);
		
		System.out.println("percentage" +    percentage);
		
		
		if((percentage>=90)&&(percentage<=100))
		{
			System.out.println("Grade  A");
		}
		
		else	if ((percentage>=80)&&(percentage<90))
		{
			System.out.println("Grade  B");
		}
		
		else	if((percentage>=70)&&(percentage<80))
		{
			System.out.println("Grade  C");
		}
		
		else	if((percentage>=70)&&(percentage<80))
		{
			System.out.println("Grade  D");
		}
		
		else	if((percentage>=60)&&(percentage<50))
		{
			System.out.println("Grade  E");
		}
		else	if((percentage>=40)&&(percentage<50))
		{
			System.out.println("Grade F ");
		}
		else
		{
			System.out.println("fail");
		}
		

		
		


	}

}
