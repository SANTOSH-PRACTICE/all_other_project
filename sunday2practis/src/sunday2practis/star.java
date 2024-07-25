package sunday2practis;

public class star {
     
      
	public static void main(String[] args) {
		LoopI(0);
	
	}

	private static void LoopI(int i) 
	{
		if (i<5)
		{  LoopJ(i,0);
		System.out.println();
			i++;
			LoopI(i);
		}
	}

	private static void LoopJ(int i, int j) {
		if (j<5)
		{
			if(j+i>=4)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			LoopJ( i,  j);
			
		}
		
	}

}
