package classpractis;

public class num42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	count1=1;
		for (int i=0;i<10;i++) 
		{int count2=count1;
			for(int j=0;j<5;j++)
			{
				if(j-i>=0 ||j+i>=9)
				{
					System.out.print(count2++ +" ");
				}
				else
				
					System.out.print(" ");
				}
			if(i<=4)
			
				count1++;
			
			else
			
				count1--;
			
			if(i==4)
			
			count1--;
			
			
			System.out.println();
			}

	}

}
/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
*/

	


