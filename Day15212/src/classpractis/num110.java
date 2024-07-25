package classpractis;

public class num110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++)
		{
			
			for(int j=0;j<5;j++)
			{
				if(i<5&&j<5)
				{
					if(j-i<=0)
					System.out.print(5-i+j);
					
					else 
						System.out.print(5);
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
55555
45555
34555
23455
12345
*/