package practiceday6;

import java.util.Scanner;

public class Profitloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int costprice,sellingprice;
		System.out.println("Enter cost price:");
		costprice= sc.nextInt();
		
		System.out.println("Enter selling price:");
		sellingprice = sc.nextInt();
		
		if((sellingprice-costprice)>0)
		{
		System.out.println("profit of"   + (sellingprice-costprice));
		}
		else if((costprice-sellingprice)>0)
		{
			System.out.println("loss of "  + (costprice-sellingprice));
			
		}
		else
		{
			System.out.println("breckeven");
		}
		

	}

}
