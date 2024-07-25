package test11st;

import java.util.Scanner;

public class ROOM {
	int length,width,height,area;
	
	Scanner sc =new Scanner(System.in);
	
	public ROOM(int length,int width,int height)
	{
		this.length=length;
		this.height= height;
		this.width=width;
		
	}
	
	float whiteWashingArea()
	{
		area=length*width*height;
		return area;
	}
	int WhiteWashingcost()
	{
	int cost  = (area *80);
	return cost;
	
		
	}
	
	int flooringCost()
	{
	int	flooringArea=width*length;
	int flooringCost=0;
	
	int choice;
	System.out.println("select option:");
	System.out.println("1.geometric flooring 2.cement floooring 3.quite");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:flooringCost=flooringArea*200;
	        break;
	        
	case 2  :flooringCost= flooringArea*100 ;
           break;
	case 3: System.out.println("Exiting");
	break;
	default:System.out.println("enter valid option");
	}
	return flooringCost;
	}
	
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);

	
System.out.println("Enter room details:");
System.out.println("Enter length:");
int length=sc.nextInt();
System.out.println("Enter width:");
int width=sc.nextInt();
System.out.println("Enter height:");
int height=sc.nextInt();
ROOM r=new ROOM(length,width,height);
System.out.println("whiteWashingArea:"+r.whiteWashingArea());
System.out.println("white washing cost:"+r.WhiteWashingcost());
System.out.println("flootring cost:"+r.flooringCost());


}}