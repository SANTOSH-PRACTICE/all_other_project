package number;

import java.util.Scanner;

public class primeOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char choice;
		Scanner sc =new Scanner(System.in);
	do {	
		System.out.println("Enter your choice from the following :");
		System.out.println("1.prime  2. even 3. odd");
		int n=sc.nextInt();
		switch(n)
		{
		case  1: System.out.println("Enter num:");
		int num =sc.nextInt();
		boolean flag =true;
		for(int i=2; i<num;i++)
		{
			if(num%i ==0)
			{
				flag= false;
				break;
			}
		}
		if (!flag)
		{
			System.out.println("not prime number");
		}
		else 
		{
			System.out.println("prime");
		}
		break;
		case 2: System.out.println("enter num:");
		int num1=sc.nextInt();
		if (num1 % 2 == 0)
		{
			System.out.println("given number is even:"+num1);
		}
		break;
		case 3: System.out.println("enter num2:");
		int num2=sc.nextInt();
		if(num2 % 2 !=0)
		{
			System.out.println("given number is odd:"+num2);

		}
		break;
		default :System.out.println("plase enter between 1-3");
		}
		System.out.println("do you wish to continue? press(y/n):");
		choice=sc.next().charAt(0);
	}while(choice =='y');
	}
}
