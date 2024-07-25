package practis;

import java.util.Scanner;

public class tempce {

	public static void main(String[] args) {
		// TODO Auto-generated method stubcelci
		
		Scanner sc= new Scanner(System.in);
		int celcius,fahernite;
		System.out.println("enter temp in celcius:");
		celcius=sc.nextInt();
		
		fahernite=((celcius*9)/5)+32;
		System.out.println("tmprature in fahernite:"+fahernite);

}
}