package classpractis;

public class no72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0 ;i<5;i++)
		{
			int count=1;
			for(int j=0;j<9;j++)
			{
				if(j+i>=4 &&j-i<=4)
					
				{
					if(j<4)
						System.out.print(count++);
					else
					System.out.print(count--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}
	
	/*
  1    
   121   
  12321  
 1234321 
123454321
*/

}


