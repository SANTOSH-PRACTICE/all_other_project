package number;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int base, exponte,power=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter base:");
		base=sc.nextInt();
		
		System.out.println("Enter exponte:");
		exponte=sc.nextInt();
		
while(exponte!=0)
{
	power=base*power;
	exponte--;
	
	
}
System.out.println("power: "+power);
	}

}
