package classpractis;

public class num111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<5;i++)
		{
			
			for(int j=0;j<5;j++)
			{
				if(i<5&&j<5)
				{
				if(j-i>=0)	
		
					System.out.print(5-i);
					
				else
				
					System.out.print(5-j);
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
54444
54333
54322
54321

*/