package practis;

import java.util.Scanner;

public class digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int number;
		System.out.println("Enter valve of number:");
		number=sc.nextInt();
		int count=0;
		
		while (number !=0)
		{
			number= number/10;
			count++;
		}
		
System.out.println("no of digit:"+count);
	}

}
