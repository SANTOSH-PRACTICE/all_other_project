package classpractis;

public class star103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((i==0 &&j<=4)||(i==4 && j<=4)|| (j-i==0)||(j+i==4))
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
*****
 * * 
  *  
 * * 
*****
*/
