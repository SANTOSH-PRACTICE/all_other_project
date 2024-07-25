package sundaypractice2111;

import java.util.Scanner;

public class profitloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int costprise, sellingprise;
		
		System.out.println("Enter cost prise of objet:");
		costprise=sc.nextInt();
		
		System.out.println("Enter selling prise of objet:");
		sellingprise=sc.nextInt();
		
		if((sellingprise -costprise) >=0)
		{
			System.out.println("profit is"+  (sellingprise-costprise));
		}
		else if ((costprise-sellingprise) >=0 )
			
		{
			System.out.println("loss is"+  (costprise-sellingprise));
		}
		else
		{
			System.out.println("breakeven");
		}
		

	}

}
