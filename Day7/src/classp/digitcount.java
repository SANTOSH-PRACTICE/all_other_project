package classp;

import java.util.Scanner;

public class digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
int num;
 int count = 0;
System.out.println("Enter a number :");

num =sc.nextInt();

while(num!=0)
	
{
	num = num/10;
			
	count++ ;
}
	System.out.println("Number of digits:" +count);

	}

}
