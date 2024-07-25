package numbers;

public class Petteenpreexam {

	public static void main(String[] args) {

           int cnt=1;
		for (int i = 0; i < 4;i++)
		{
			int temp=cnt+i;
			for (int j = 0; j < 4; j++) 
			{
				if(j-i<=0)
				{
					if(i%2==0)
					{
					System.out.print(cnt++);
					
					}
					else
					{
						System.out.print(temp--);
						cnt++;
					}
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
