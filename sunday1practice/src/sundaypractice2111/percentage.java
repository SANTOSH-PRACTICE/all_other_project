package sundaypractice2111;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int marathi, hindi,maths,ssc,sci;
		
		System.out.println(" enter marks obtain in marathi:");
		marathi = sc.nextInt();
		
		System.out.println(" enter marks obtain in hindi:");
		hindi = sc.nextInt();
		
		System.out.println(" enter marks obtain in social science :");
		ssc = sc.nextInt();
		
		System.out.println(" enter marks obtain in science:");
		sci = sc.nextInt();
		
		
		System.out.println(" enter marks obtain in maths:");
		maths = sc.nextInt();
		int totalmarks=500;
		System.out.println("total marks:"+totalmarks);
		int totalobtmarks =(marathi+hindi+maths+ssc+sci);
		System.out.println("total obtain marks"+ totalobtmarks);
		
		
		int percentage =((totalobtmarks*100)/(totalmarks));
		
		System.out.println("percentage"   + percentage);
		switch(percentage/10)
		{
			
			case 9 :System.out.println("grade A");
			break;
			case 8 :System.out.println("grade B");
			break;
			case 7 :System.out.println("grade C");
			break;
			case 6 :System.out.println("grade D");
			break;
			case 5 :System.out.println("grade E");
			break;
			case 4 :System.out.println("grade F");
			break;
			default: System.out.println("fail");
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
