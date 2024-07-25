package Day1130122;

public class star1 {
	public static void main(String[] args)
	{
		LoopI(0);
		
	
	}

	private static void LoopI(int i) {
		// TODO Auto-generated method stub
		LoopJ(i,0);
		if(i<5)
		{
			System.out.println();

			i++;
		LoopI(i);
		}
	}



	private static void LoopJ(int i, int j) {
		// TODO Auto-generated method stub
		if(j<5)
		{
			if(j-i>=0)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			LoopJ(i, j);
	}}
}