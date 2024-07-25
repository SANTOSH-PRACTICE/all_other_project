package classpractis;

public class char37 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		int count1=0;
		for (int i=0 ;i<6;i++) 
		{
			 int count2=count1;
			 int diff=5;
			for(int j=0;j<6;j++)
			{
				if(j-i<=0)
					
				{
				
						System.out.print((char)(count2 +65));
						count2=count2+diff;
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			count1++;
			System.out.println();
		}


	}

	}
/*
A     
BG    
CHM   
DINS  
EJOTY 
FKPUZ_
*/