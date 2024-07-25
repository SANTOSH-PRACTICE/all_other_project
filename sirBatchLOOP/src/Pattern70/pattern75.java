package Pattern70;

public class pattern75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 11; i=i+2)
		{
			for (int j = 0; j < 11; j++) 
			{
				if(j-i<=0)
				{
					if(i==2*j)
						System.out.print(" ");
					else
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}
