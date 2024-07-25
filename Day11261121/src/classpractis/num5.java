package classpractis;

public class num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0 ;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j-i>=0 || j+i>= 8)
				{
					System.out.print(j);
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

/*
01234
 1234
  234
   34
    4
   34
  234
 1234
01234
*/
