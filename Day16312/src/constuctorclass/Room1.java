package constuctorclass;

import java.util.Scanner;

public class Room1 {

	
			int length,width,height,area;
			Scanner sc=new Scanner(System.in);
			public Room1(int length,int width,int height)
			{
				this.length=length;
				this.width=width;
				this.height=height;
				
			}

			float whiteWashingArea()
			{
				area=length*width*height;
				return area;
				
			}
		int whiteWashingCost()
		{
			int cost=area*80;
			return cost;
		}
		int flooringCost()
		{
			int flooringArea=length*width;
			int flooringCost=0;
			
			int choice;
			System.out.println("Enter youre choice");
			System.out.println("1. Geometric flooring 2. cement flooring");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: flooringCost=flooringArea*200;
			break;
			case 2: flooringCost=flooringArea*100;
			break;
			default:System.out.println("Enter valid choice");
			
			}
			return flooringCost;
			
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
						Scanner sc=new Scanner(System.in);
					System.out.println("Enter length,width,length: ");	
			    Room1 room=new Room1(sc.nextInt(),sc.nextInt(),sc.nextInt());
				System.out.println("Flooring cost is:"+room.flooringCost());
				System.out.println("white washing area is:"+room.whiteWashingArea());
				System.out.println("white washing cost is:"+room.whiteWashingCost());

			}

	}


