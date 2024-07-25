package Day14oops112;

import java.util.Scanner;

public class Area {
	
	int num1,num2,num3,area;
	Scanner sc =new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter number 1: ");
		num1=sc.nextInt();
		System.out.println("Enter number 2: ");
		num2=sc.nextInt();
		
		System.out.println("Enter number 3: ");
		num3=sc.nextInt();
		area(num1);
		area(num1,num2);
		area(num1,num2,num3);
	  }
void area(int side)
    {
	area=side*side;
	System.out.println("area of square is:"+area);
    }
void area(int lenght,int breath)
    {
	area=lenght*breath;
	System.out.println("area of rectangle is:"+area);

   }

void area(int base,int height,int side)
    {
	area=(int)(0.5f*(base*height));
	System.out.println("area of triangle is:"+area);

     }
	public static void main(String[] args)
	{
		Area a1=new Area();
		a1.input();

	}

}
