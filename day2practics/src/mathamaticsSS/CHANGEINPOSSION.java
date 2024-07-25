package mathamaticsSS;

import java.util.Scanner;

public class CHANGEINPOSSION {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the valve of num1:");
	int num1=sc.nextInt();
	//System.out.println("number1:"+num1);
	
	System.out.println("enter the valve of num2:");
	int num2=sc.nextInt();
	//System.out.println("number1:"+num2);
	
	int temp=0;
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("show  valve of num1:"+num1);
	System.out.println("show valve of num2:"+num2);

	

	



	}

}
