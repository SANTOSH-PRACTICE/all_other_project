package classpractis;

public class char33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			int cnt=5;
			for(int j=0;j<6;j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(cnt+65));
					cnt--;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
/*
F          
FE        
FED      
FEDC    
FEDCB  
FEDCBA
*/