package practis;

import java.util.Scanner;

public class electricbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int unit;
		float bill;
		System.out.println("Enter the unit used:");
		unit=sc.nextInt();
		
		if(unit <= 50)
		{
			bill = unit*0.50f;
		}
		
		else if(( unit>50) && ( unit<=150)) 
		{
			bill=(50 * 0.50f)+((unit-50)*0.75f);
		}
		
		else if(( unit>150) && ( unit<=250)) 
		{
			bill=(50 * 0.50f) +(100*0.75f)+(unit-150)*1.20f;
		}
		
		else 
		{
			bill= (50 * 0.50f) +(100*0.75f)+(100*1.20f)+(unit-250)*1.50f;
		}
		
		 float surplus= bill* 0.20f;
		 float totalbill;
		 totalbill = bill +surplus;
		 
		 System.out.println("bill is:"+bill);
		 System.out.println("surplus is:"+surplus);
		 
		 System.out.println("total bill is:"+totalbill);
		 
		 
		 
		
		
		
		

	}

}
