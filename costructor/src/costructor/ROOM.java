package costructor;

import java.util.Scanner;

public class ROOM {
	
	int length,height,width,area;
	public ROOM(int length,int height,int width)
	{
		this.length=length;
		this.height=height;
		this.width=width;
		
	}
	
	float whiteWashingArea()
	{
		 area=length*width*height;
	return area;
	
		
	}
	int WhiteWashingCost()
	{
		int cost=area*80;
         return cost;
	}
	
	int flooringCost()
	{
	int	floaringArea=length*width*height;
	int flooringCost=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your choice:");
	System.out.println("1.geometric flooring 2.cement flooring 3.quite");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:flooringCost=floaringArea*200;
	        break;
	case 2:flooringCost=floaringArea*100;
            break;
	case 3: System.out.println("***Exiting***");  
	        break;
	default:System.out.println("Enter  valid option");
	         break;
	}
	
	return flooringCost;
	
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter Details of Room:");
		System.out.println("Enter length:");
		int length=sc.nextInt();
		
		
		System.out.println("Enter heigth:");
		int heigth=sc.nextInt();
		
		
		System.out.println("Enter width:");
		int width=sc.nextInt();
		ROOM r=new ROOM(length,heigth,width);
		System.out.println("White whashing area:"+r.whiteWashingArea());
		System.out.println("white washing cost:"+r.WhiteWashingCost());
		System.out.println("flooring cost:"+r.flooringCost());
		
		
		
		
		
		

	}

}
