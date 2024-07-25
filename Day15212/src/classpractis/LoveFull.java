package classpractis;

public class LoveFull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 13; i++)
		{
			for (int j = 0; j < 17; j++) 
			{
				if(j+i<=2||((j-i>=6&&j<9)|(j+i<=10&&j>7))||j-i>=14||j-i<=-5||j+i>=21)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print("*");
			}}
			System.out.println();
		}

	}

}
