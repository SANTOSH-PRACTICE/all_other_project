package Janewary13mains2021;

import java.util.Scanner;

class maths
{
	void getDecimal(int binaryNum)
	{int decimal=0;
   	int count=0;
		
	
	while(true)
	{
		if(binaryNum==0)
		{
			break;
		}
		else
		{
			int temp=binaryNum%10;
			decimal=(int) (decimal+(temp*(Math.pow(2, count))));
			binaryNum=binaryNum/10;
			count++;
			
		}
	}
	System.out.println(decimal);
	}

}
public class Que5 {
      //binary to decimal;

		public static void main(String[] args) 
		{
			maths a=new maths();
			a.getDecimal(1010);

	}

}
 