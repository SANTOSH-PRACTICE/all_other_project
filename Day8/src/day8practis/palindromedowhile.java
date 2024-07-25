package day8practis;

import java.util.Scanner;

public class palindromedowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0,rem;
		do {
			rem=num%10;
			sum=(num*10)+rem;
			num=num/10;
			
		}
		
		while(num>0);
		
		
  
    if(temp != sum)
    {
    	System.out.println("the number is palindrome");
    }
    else
    {
    	System.out.println("the number is not  palindrome");

    }
	}

}
