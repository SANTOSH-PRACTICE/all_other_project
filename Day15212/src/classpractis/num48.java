package classpractis;

public class num48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=9;
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
			count--;
			System.out.println();
		}


	}


	}
/*
9        
88       
777      
6666     
55555    
444444   
3333333  
22222222 
111111111

 */

