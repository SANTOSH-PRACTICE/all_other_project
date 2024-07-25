package Day1130122;

public class number50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		loopI(0);
		for (int i = 0; i < 9; i++)
		{
			

		}
	}

	private static void loopI(int i) {
if(i<9)
{
	int count=1;
	loopj(i,0,count);
	
	System.out.println();
	i++;
	loopI(i);
}
	}

	private static void loopj(int i, int j, int count) {
     if(j<9)
     {

 		if(j+i>=8)
 		{
 			System.out.print(count);
 			count++;
 		}
 		else
 		{
 			System.out.print(" ");
 		}
    	 j++;
    	 loopj(i, j, count);
     }
	}

}
