package calsspractis;

import java.util.Scanner;

public class nocolour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number1:");
		int num1=sc.nextInt();
		
		System.out.println("enter number2:");
		int num2=sc.nextInt();
		
		for(int i= num1;i<=num2;i++)
		{
			if((i%3 == 0)&&(i%5 == 0))
			{
				System.out.println(i+"pink and yellow");
			}
			else 	if(i%3 == 0)
			{
				System.out.println(i+"pink ");
			}
			
			else 	if(i%5 == 0)
			{
				System.out.println(i+"yellow ");
				
			}
			
			else
			{
				//System.out.println(i+"neither yellow nor pink");
				System.out.println("");

			}
		}
		
	}

}
