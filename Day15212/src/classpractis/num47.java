package classpractis;

public class num47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++)
		{int count=9;
			
			for(int j=0;j<9;j++)
			{
				if(j-i<=0)
				{
				
					System.out.print(count);
					
					count--;

					
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
9        
98       
987      
9876     
98765    
987654   
9876543  
98765432 
987654321
*/
