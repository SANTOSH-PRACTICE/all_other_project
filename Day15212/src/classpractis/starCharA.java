package classpractis;

public class starCharA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<8;i++)
		{
		for (int j=0;j<5;j++)
		{
			if(i==0&&(j>0&&j<4))
			{
				System.out.print("*");
			}
			else if(j==0&&(i>0&&i<8))
			{
				System.out.print("*");
			}
			else if(j==4&&(i>0&&i<8))
 			{
				System.out.print("*");
			}
		
			else if(i==3)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();

	}

}
}
/*
 *** 
*   *
*   *
*****
*   *
*   *
*   *
*   *
*/