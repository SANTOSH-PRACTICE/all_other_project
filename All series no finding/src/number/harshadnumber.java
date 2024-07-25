package number;

import java.util.Scanner;

public class harshadnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number =sc.nextInt();
		int numcopy=number;
		int sum=0;
		while(numcopy>0)
		{
			int y=numcopy%10;
			sum=sum+y;
			numcopy=numcopy/10;
		}
		if(number%sum ==0)
		{
			System.out.println("number is harshal number:"+number);
		}
		else
		{
			System.out.println("number is not  harshal number:"+number);

		}
	}
}
