package sunday2practis;

import java.util.Scanner;

public class tempcen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter temrature in faherenhite:");
	   float	faherenheite=sc.nextFloat();
	
float celcius=(((faherenheite-32)/9)*5);
System.out.println("tmpreture in celcius:"+celcius);
	}

}
