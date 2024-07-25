package test11st;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter num1:");
		int num1=sc.nextInt();
		
		
		System.out.println("enter num2:");
		int num2=sc.nextInt();
		
		
		int add= num1+num2;
		System.out.println("addition"  +add);
		
		int sub= num1-num2;
		System.out.println("subraction" +sub);
		
		int mul= num1*num2;
		System.out.println("multification"  + mul);
		
		
		int div= num1/num2;
		System.out.println("divion"  + div);
		
		
		

		
		

	}

}
