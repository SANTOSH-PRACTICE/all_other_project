package series;

import java.util.Scanner;

public class FabonicSeris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number you want seris:");
		int num=sc.nextInt();
		
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		System.out.print(firstnum+" "+secondnum);
		
		while(num>=0)
		{
			nextnum=firstnum+secondnum;
			System.out.print(" "+nextnum+" ");
			
			firstnum=secondnum;
			secondnum=nextnum;
			num--;
		}
		
		

	}

}
