package classp;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		float basic,gross,da,hra;
		System.out.println("Enter basic salary employee:");
		basic =sc.nextFloat();
		if(basic <=10000)
		{
			da=basic *0.8f;
			hra=basic*0.2f;
			System.out.println("Da:"+da);
			System.out.println("HRA:"+hra);
		}
		else 	if(basic <=20000)
		{
			da=basic *0.9f;
			hra=basic*0.25f;
			System.out.println("Da:"+da);
			System.out.println("HRA:"+hra);
		}
		else 
		{
			da=basic *0.95f;
			hra=basic*0.3f;
			System.out.println("Da:"+da);
			System.out.println("HRA:"+hra);
		}
		
		gross= basic+hra+da;
		System.out.println("gross salary:"+gross);
		
		
	}

}
