package number;

import java.util.Scanner;

public class PrimeNumberFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number:");
     int number=sc.nextInt();
     
     int count=0;
     for (int i = 2; i < number; i++)
     {
		if(number%i==0)
		{
			count++;
		}
	}
     if(count==0)
     {
    	 System.out.println("prime number");
     }
     else
     {
    	 System.out.println("not prime number");
     }
	}

}
