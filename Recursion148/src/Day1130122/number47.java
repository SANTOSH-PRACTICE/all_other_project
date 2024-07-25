package Day1130122;

public class number47 {

	public static void main(String[] args) 
	{
		
		loopI(0);
		
      
    	
	}

	private static void loopI(int i) {
		if(i<9)
		{
			  int count=9;
	    	  
			 count=loopJ(i,0,count);
	    	 
			System.out.println();
		
		
			i++;
			loopI(i);
		}
	}

	private static int loopJ(int i, int j, int count) {
		if(j<9)
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
			j++;
			count=loopJ(i, j, count);
		}
		return count;
		
	}
		
	}


