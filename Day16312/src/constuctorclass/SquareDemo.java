package constuctorclass;

import java.util.Scanner;

 class Square {
	
	float calculateArea(int lenght)
	{
		int area=lenght * lenght;
		return area;
		
	}
}
public class SquareDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter length");
int length=sc.nextInt();

Square sq=new Square();
System.out.println("area is:"+ sq.calculateArea(length));

	}
}

