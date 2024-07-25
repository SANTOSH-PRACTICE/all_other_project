package dsdddddad;

public class NUM39 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		for (int i = 0; i < 5; i++)
		{
			int count=5;
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<=0)
				{
					System.out.print(count);
					count--;
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
