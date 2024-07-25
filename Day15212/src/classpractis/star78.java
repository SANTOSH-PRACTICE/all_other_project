package classpractis;

public class star78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<20;j++)
			{
				if(j-i<=0)
				System.out.print("*");
				else if(j>=5&&j+i<=9)
					System.out.print("*");
				else if(j-i>=9&&j<=14)
					System.out.print("*");
				else if(j+i>=19)
					System.out.print("*");
				
				else
				
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
/*
*    **********    *
**   **** *****   **
***  ***   ****  ***
**** **     *** ****
******       *******
*/
