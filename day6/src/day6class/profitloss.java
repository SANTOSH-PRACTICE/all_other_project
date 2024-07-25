package day6class;

import java.util.Scanner;

public class profitloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int costprice,sellingprice;
		
		System.out.println("Enter the cost price of product:");
		costprice= sc.nextInt();
		
		System.out.println("Enter the selling price of product:");
		sellingprice= sc.nextInt();
		
		if((sellingprice-costprice)>0)
		{
			System.out.println("profit of"+(sellingprice-costprice));
		}
		
		else if((sellingprice-costprice)<0)
		{
			System.out.println("loss of"+(costprice-sellingprice));

			
		}
		
		else
		{
			System.out.println("breakeven");
			
		}

		
		
		

	}

}
