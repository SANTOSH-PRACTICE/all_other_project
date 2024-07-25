package classpractis;

public class num44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0;i<5;i++)
		{
			
			for(int j=0;j<5;j++)
			{
				if(j+i>=4)
				{
				
					System.out.print(count+" ");
					
					
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			count++;
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
*/