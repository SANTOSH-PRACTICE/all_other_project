package classpractis;

public class star12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0 ;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				
				if(j+i<=3|| j-i>=5 ||j+i>=9 || j-i<=1) 
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

	}}
