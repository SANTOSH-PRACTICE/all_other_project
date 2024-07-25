8765

package practis;

import java.util.Scanner;

public class nodays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number of days:");
		int day=sc.nextInt();
		
		int year=day/365;
		System.out.println("year:"+year);
		int remdays=day%365;
		
		int week=remdays/7;
		System.out.println("week:"+week);
		
		int days=remdays%7;
				System.out.println("days:"+days);

	}

}
