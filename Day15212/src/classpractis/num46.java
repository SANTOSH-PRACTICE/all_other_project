package classpractis;

public class num46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0;i<9;i++)
		{
			
			for(int j=0;j<9;j++)
			{
				if(j-i<=0)
				{
				
					System.out.print(count);
					
					
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			count++;
			System.out.println();
		}


	}


	}
/*
 1        
22       
333      
4444     
55555    
666666   
7777777  
88888888 
999999999

 */

