package sundaypractice2111;

public class star {

	public static void main(String[] args) {
		
		loopI(1);
 
	}

	private static void loopI(int i) {
       if(i<9)
       {
    	   loopJ(i,0);
    	  
    		System.out.println();
		i=i+2;
        loopI(i);
	}
	}

	private static void loopJ(int i, int j) {
      if(j<9)
      {
    	  if(j-i<=0)
			{
				System.out.print("*");
				 if(j==i/2)
				{
					System.out.print(" ");
				}
				
			}
			
			else
			{
				System.out.print(" ");
			}
    	  j++;
    	  loopJ(i, j);
      }
	}

}
