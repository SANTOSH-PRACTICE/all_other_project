package classpractis;

public class num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0 ;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j-i>=0 || j+i>= 8)
				{
					System.out.print(j+" ");
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
0 1 2 3 4 
 1 2 3 4 
  2 3 4 
   3 4 
    4 
   3 4 
  2 3 4 
 1 2 3 4 
0 1 2 3 4 

*/

