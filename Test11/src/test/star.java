package test;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i=i+2)
		{ 
			for (int j = 0; j < 7; j++) 
			{
				if(j+i<=3)
				{
					System.out.print("* ");
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