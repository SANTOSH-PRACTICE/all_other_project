package classpractis;

public class char3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0 ;i<5;i++)
		{int cnt =0;
		for(int j=0;j<5;j++)
		{
			if(j-i<=0)
			{
				System.out.print((char)(j+65));
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
A    
AB   
ABC  
ABCD 
ABCDE
*/

