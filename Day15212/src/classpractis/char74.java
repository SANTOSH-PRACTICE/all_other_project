package classpractis;

public class char74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0 ;i<5;i++) //i+=2
		{
			 int count=0;
			for(int j=0;j<9;j++)
			{
				if(j+i>=4 &&j-i<=4)
				{
				
					if(j<4)
						System.out.print((char)(count++ +65)+"");
					else
					System.out.print((char)(count-- +65)+"");
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
	  A    
   ABA   
  ABCBA  
 ABCDCBA 
ABCDEDCBA
	 */

}
