package Day1130122;

public class charactor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0;
		for (int i = 0; i < 6; i++)
		{
			int count=0;
			int diff=5;
			for (int j = 0; j < 6; j++) 
			{
				if(j-i<=0)
				{
					System.out.print((char)(65+ count+count1));
					 count=diff+count;
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			count1++;
		}

	}

}
