package number.copy;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		boolean flag =true ;
		for(int i=2;i<num;i++)
		{
			if(num % i ==0)
			{
				flag = false;
				break;
			}
		}
		
		if (!flag)   // if (flag==false)
		{
			System.out.println(" is not prime number");
		}
		else
		{
			System.out.println("  prime number");
		}
	}

	}

