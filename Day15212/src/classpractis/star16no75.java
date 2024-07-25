package classpractis;

public class star16no75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2 ;i<11;i=i+2) //i+=2
		{
			for(int j=0;j<11;j++)
			{
				if(j-i<=0)
					
				{
					if(j ==i/2)//i==j*2
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");

					}
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
