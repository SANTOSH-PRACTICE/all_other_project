package test2;

import java.util.Scanner;

public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		float basic, hra,da,gross;
		System.out.println("basic salary of employee:");
		basic=sc.nextInt();
		if(basic<=10000)
		{
			hra=0.20f*basic;
			da=0.80f*basic;
		}
		else 	if(basic<=20000)
		{
			hra=0.25f*basic;
			da=0.90f*basic;
		}

		else
		{
			hra=0.30f*basic;
			da=0.95f*basic;
		}
		gross= basic+hra+da;
		System.out.println("hra"+hra);
System.out.println("da"+da);
System.out.println("gross"+gross);
	}

}
