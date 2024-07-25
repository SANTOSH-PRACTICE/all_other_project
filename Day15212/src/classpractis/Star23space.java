package classpractis;

public class Star23space {
	public static void main(String[] args) {
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if( ( j+i <=7 && j-i<=-1)||(j+i>=13 || j-i>=5))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}

}
