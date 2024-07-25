package series;

import java.util.Scanner;

public class pelliSeris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		System.out.print(firstnum+" "+secondnum);
		
		for(int i=0;i<15;i++)
		{
			nextnum=firstnum+(2*secondnum);
			
			firstnum=secondnum;
			secondnum=nextnum;
			System.out.print(" "+nextnum+" ");

			
		}

	}

}
