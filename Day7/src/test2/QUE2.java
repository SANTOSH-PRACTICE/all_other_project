package test2;

import java.util.Scanner;

public class QUE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int costvaluve,sellingvalue;
		System.out.println("Enter cost valve:");
		costvaluve=sc.nextInt();
		System.out.println("Enter selling valve:");
		sellingvalue=sc.nextInt();
		
		if((sellingvalue - costvaluve)>0)
		{
			System.out.println("profit is:"+(sellingvalue - costvaluve));
		}

		else if((costvaluve - sellingvalue)>0)
		{
			System.out.println("loss is:"+(costvaluve - sellingvalue));
		}
		else 
		{
			System.out.println("breakeven");
		}

	}

}
