package dsdddddad;

public class charactor30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=5;
		for (int i = 0; i < 12; i++)
		{
			int count1=0;
			for (int j = 0; j < 6; j++)
			{
				if(j+i<=5||j-i<=-6)
				{
					System.out.print((char)(65+count1+count));
					count1--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i<=4)
				count--;
			if(i==5)
			{
				count--;
			}
			if(i>4)
				count++;
			System.out.println();
			
		}

	}

}
