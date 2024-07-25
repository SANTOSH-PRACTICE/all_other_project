package practis;

import java.util.Scanner;

public class payments {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner sc = new Scanner(System.in);
		int basic;
        System.out.println("Enter the basic salary of employee:");
        basic=sc.nextInt();
        float hra,da, totalsalary;
        if (basic<= 10000)
        {
        	hra=basic *0.20f;
        	da= basic*0.80f;
        	System.out.println("hra:"+hra);
        	System.out.println("da:"+da);
        }
        
        else if (basic<=20000)
        {
        	hra=basic *0.25f;
        	da= basic*0.90f;
        	System.out.println("hra:"+hra);
        	System.out.println("da:"+da);
        }
        else
        {
        	hra=basic *0.30f;
        	da= basic*0.95f;
        	System.out.println("hra:"+hra);
        	System.out.println("da:"+da);
      
        }
        
        
        totalsalary=hra+da+basic;
        
        System.out.println("total salary:"+totalsalary);
        
        	

	}

}
