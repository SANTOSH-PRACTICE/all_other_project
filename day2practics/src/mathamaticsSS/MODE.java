package mathamaticsSS;

import java.util.Scanner;

public class MODE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the frist number:");
		int num1=sc.nextInt();
		
		System.out.println("enter the second number:");
		int num2=sc.nextInt();
		
		int mod= num1%num2;
		System.out.println("mod of two no:"+mod);
	}

}
