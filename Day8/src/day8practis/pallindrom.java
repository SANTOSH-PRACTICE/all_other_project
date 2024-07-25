package day8practis;

import java.util.Scanner;

public class pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0,rem;
		
    while(num<0) 
    	{
    	rem= num % 10;
    	sum= (sum*10)+rem;
    	num=num/10;
    	}
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
