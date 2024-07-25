package day8class;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("Enter the num to display the table:");
		num=sc.nextInt();
		int i=1;
		while (i<=10)
		{
			System.out.println(num+" * "+i+" =" +(num*i));
			i++;
		}
				
	
		
		

	}

}
