package star;

public class Starp2 {

	public static void main(String[] args) {

		
		for (int i = 0; i <6 ; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{
				if(j-i>=0&&j+i<=4)
				{
					System.out.print("*");
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
