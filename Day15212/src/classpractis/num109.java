package classpractis;

public class num109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++)
		{
			
			for(int j=0;j<5;j++)
			{
				if(i<5&&j<5)
				{
					if(j+i<=3)
					System.out.print(1);
					
					else 
						System.out.print(i+1);
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
11111
11122
11333
14444
55555
*/

