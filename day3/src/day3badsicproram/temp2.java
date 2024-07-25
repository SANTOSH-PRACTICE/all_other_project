package day3badsicproram;

import java.util.Scanner;

public class temp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float farenheit,celcius;
		System.out.println("enter temprature in farenheit:");
		
		 farenheit=sc.nextFloat();
		
		 celcius =(( farenheit-32)*5)/9;
		System.out.println("temprature in celcius:" +celcius);



	}

}
