package Pattern70;

public class charr74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) 
		{
			int num =1;
			for (int j = 0; j < 9; j++)
			{
				if(j+i>=4&&j-i<=4)
					
				{
					System.out.print((char)(num+64));
					
					if(j<4)
						num++;
					else
						num--;
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();

		}



	}

}
