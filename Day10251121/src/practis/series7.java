package practis;

import java.util.Scanner;

public class series7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num1,num2;
		System.out.println("enter number1(exceed 100):");
		num1= sc.nextInt();
		
		System.out.println("enter number2(exceed:)");
		num2= sc.nextInt();
		
for(int i=num1; i<num2;i++)
{
	if(i%10 ==7)
	{
		System.out.println(+i);
	}
}
	}

}
