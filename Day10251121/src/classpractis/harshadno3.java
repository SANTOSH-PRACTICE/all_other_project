package classpractis;

import java.util.Scanner;

public class harshadno3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("input number of your choice:");
		int num =sc.nextInt();
int copynum =num;
		int sum=0;
		
		
		while(copynum>0)
		{
			int y=copynum %10;
			sum =sum+ y;
			copynum =copynum /10;
			
		}
		if(num%sum ==0)
		{
			System.out.println(num+ " is a harshad number");
		}
		
		else
		{

			System.out.println(num+ " is  not a harshad number");
		}

		


	}

}
