package classpractis;

public class num45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<9;i++)
		{
			int count=1;
			
			for(int j=0;j<9;j++)
			{
				if(j-i<=0)
				{
				
					//System.out.print(j+1);
					
					System.out.print(count);
					count++;
					
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
 1        
12       
123      
1234     
12345    
123456   
1234567  
12345678 
123456789
*/
