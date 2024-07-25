package practisDAY3;

import java.util.Scanner;

public class Tempferenite {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		float farenheit,celcius;
		System.out.println("enter temprature in celcius :");
		
		celcius=sc.nextFloat();
		
		 farenheit=(( celcius*9/5)+32);
		System.out.println("temprature in farenheit:" +farenheit);



	}

}

