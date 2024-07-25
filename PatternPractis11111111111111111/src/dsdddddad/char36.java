package dsdddddad;

public class char36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < 6; i++) 
		{
			int count1=i;
			for (int j = 0; j < 6; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(65+count+count1));
					count1--;
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
