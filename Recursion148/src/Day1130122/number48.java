package Day1130122;

public class number48 {

	public static void main(String[] args)
	{
		int count=9;
		loopI(0,count);
  
	}

	private static void loopI(int i, int count) {
if(i<9)
{   loopj(i,0,count);
	
	System.out.println();
	count--;
	i++;
	loopI(i, count);
}
	}

	private static void loopj(int i, int j, int count) {
		// TODO Auto-generated method stub
		if(j<9)
		{
			if(j-i<=0)
			{
				System.out.print(count);
				
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopj(i, j, count);
		}
	}

}
