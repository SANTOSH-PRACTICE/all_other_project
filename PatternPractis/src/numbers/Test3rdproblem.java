package numbers;

public class Test3rdproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=1;
		for(int i=0;i<9;i=i+2)
		{		int num=cnt;

			for(int j=0;j<9;j++)
			{
				
				if(j-i<=0)
				{
					if(j<i/2) 
					System.out.print(num--);
					
					
					else 
					{
						System.out.print(num++);
					}
						
				}
					else
					{
						System.out.print(" ");
						
						
						
					}
				}
			
							
				System.out.println();
				cnt++;
		}

	}}


