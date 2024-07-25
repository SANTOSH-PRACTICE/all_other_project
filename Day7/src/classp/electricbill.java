package classp;

import java.util.Scanner;

public class electricbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter electric units:");
		units  =sc.nextInt();
		
		float bill;
		if(units <= 50)
		{
			bill=units*0.50f;
		}
		else if (units>50 && units<= 150)
		{
			bill= (50*0.50f)+((units-50)* 0.75f);
		}
		else if (units>150 && units<= 250)
		{
			bill= (50*0.50f)+(100* 0.75f)+((units-100)*1.20f);
		}
		else	
		{
			bill= (50*0.50f)+(100* 0.75f)+(100*1.20f)+(units-250)*1.50f;
		}
		float surplus,finalBill;
		surplus=bill*0.20f;
		finalBill=bill+surplus;
		
		System.out.println("units consumed:"+units);
		System.out.println("Electric bill:"+bill);
		System.out.println("surcharges:"+surplus);
		System.out.println("Final electric bill charge:"+finalBill);
		

	}

}
