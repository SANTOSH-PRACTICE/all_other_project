package prelim21feb2021setA;

public class Que1 {

	public static void main(String[] args) {

		int count=1;
		for (int i = 0; i < 5; i++)
		{
			int count1=0;
			int diff=4;
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<=0)
				{
					System.out.print(count+count1+" ");
					 count1=diff+count1;
					 diff--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			count++;
		}
	}

}
