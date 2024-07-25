package classpractis;

public class num49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++)
		{
			int count=1;
			
			for(int j=0;j<9;j++)
			{
				if(j+i>=8)
				{
				
					//System.out.print(j+1);
					
					System.out.print(count+" ");
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
       1 2 
      1 2 3 
     1 2 3 4 
    1 2 3 4 5 
   1 2 3 4 5 6 
  1 2 3 4 5 6 7 
 1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 

*/