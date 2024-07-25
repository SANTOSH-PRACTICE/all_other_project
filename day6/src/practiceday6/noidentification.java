package practiceday6;

import java.util.Scanner;

public class noidentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		if(number>0)
		{
			System.out.println("number is possitive" +   number);
		}
		
		else if(number<0)
		{
			System.out.println("number is negative" +  number);
		}
		
		else
		{
			System.out.println("number is zero");
		}
		

	}

}
