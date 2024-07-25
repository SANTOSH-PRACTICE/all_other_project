package day3badsicproram;

import java.util.Scanner;

public class TEMPRATURE {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float farenheit,celcius;
		System.out.println("enter temprature in celcius:");
		
		celcius =sc.nextFloat();
		
		farenheit =((celcius*9)/5)+32;
		System.out.println("temprature in farenheit:" +farenheit);

		
		


	}

}
