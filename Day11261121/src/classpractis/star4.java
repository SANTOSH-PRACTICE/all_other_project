package classpractis;

public class star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0 ;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(((j-i)>=0)&&((j+i)<=6))
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
/*   ans

*******
 ***** 
  ***  
   *   

*/