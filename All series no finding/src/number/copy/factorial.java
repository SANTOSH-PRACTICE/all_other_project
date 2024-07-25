package number.copy;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number =sc.nextInt();
		int fact=1;
		do {
			fact=number*fact;
			number--;
		}
		while(number>1);
		System.out.println("factorial:"+fact);

	}
}
