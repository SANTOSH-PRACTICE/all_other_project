package mathamaticsSS;

import java.util.Scanner;

public class change3d {


		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the valve of num1:");
		int num1=sc.nextInt();
		//System.out.println("number1:"+num1);
		
		System.out.println("enter the valve of num2:");
		int num2=sc.nextInt();
		//System.out.println("number1:"+num2);
		
		System.out.println("enter the valve of num3:");
		int num3=sc.nextInt();
		
		int temp=0;
		temp=num1;
		num1=num2;
		num2=num3;
		num3=temp;
		
				System.out.println("show  valve of num1:"+num1);
		System.out.println("show valve of num2:"+num2);
		System.out.println("show valve of num2:"+num3);



	}

}
