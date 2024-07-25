package classpractis;

public class num51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;

		for (int i=0;i<10;i++)
		{		

			for(int j=0;j<5;j++)
			{
				if(j+i>=4 && j-i>=-4)
				{
					
					System.out.print(count+" ");
					
						
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i<3)
			count++;
			if(i==3)
				count++;
			if(i>3)
				count--;
			System.out.println();
		}

	}

}
/*

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1
*/ 
  